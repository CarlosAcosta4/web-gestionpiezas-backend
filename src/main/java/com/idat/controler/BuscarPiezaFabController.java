package com.idat.controler;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.idat.entity.PiezaFabricada;
import com.idat.service.BuscarPiezaFabService;


@Controller
@RequestMapping("/piezas")
public class BuscarPiezaFabController {

	@Autowired
    private BuscarPiezaFabService buscarPiezaFabService;
	

	@GetMapping("/mostrarMenu")
    public String mostrarMenu() {
        return "menu";
    }

    @GetMapping("/buscarPiezas")
    public String buscarPiezasPorFecha(Model model) {
        return "gestionPiezas";
    }

    @PostMapping("/buscarPiezas")
    public String mostrarPiezasPorFecha(@RequestParam("fechaInicio") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate fechaInicio,
                                        @RequestParam("fechaFin") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate fechaFin,
                                        Model model) {
        List<PiezaFabricada> piezas = buscarPiezaFabService.buscarPorRangoFechas(fechaInicio, fechaFin);
        model.addAttribute("piezas", piezas);
        return "mostrarPiezas";
    }
    

    
}

package com.idat.controler;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.idat.entity.Fabrica;
import com.idat.entity.Linea;
import com.idat.entity.PiezaFabricada;
import com.idat.service.FabricaService;
import com.idat.service.LineaService;
import com.idat.service.PiezaFabricadaService;

@Controller
@RequestMapping("/piezas")
public class PiezaFabricadaController {

    @Autowired
    private PiezaFabricadaService piezaFabricadaService;
    
    @Autowired
    private LineaService lineaService;
    
    @Autowired
    private FabricaService fabricaService;


    @GetMapping("/registrarPiezas")
    public String mostrarFormulario(Model model) {
        model.addAttribute("piezaFabricada", new PiezaFabricada());
        return "registrarPiezas";
    }

    @PostMapping("/registrarPiezas")
    public String guardarPiezas(@RequestParam("fechaFabricacion") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate fechaFabricacion,
                                @RequestParam("idFabrica") Integer idFabrica,
                                @RequestParam("idLinea") Integer idLinea,
                                @RequestParam("cantidad") Integer cantidad,
                                RedirectAttributes redirectAttributes) {

        // Crear una instancia de PiezaFabricada con los datos del formulario
        PiezaFabricada piezaFabricada = new PiezaFabricada();
        piezaFabricada.setFecha_fabricacion(fechaFabricacion);
        piezaFabricada.setCantidad(cantidad);

        Fabrica fabrica = fabricaService.obtenerFabricaPorId(idFabrica);
        Linea linea = lineaService.getLineaPorId(idLinea);

        piezaFabricada.setFabrica(fabrica);
        piezaFabricada.setLinea(linea);

        // Lógica para guardar la instancia de PiezaFabricada en la base de datos
        piezaFabricadaService.guardarPiezaFabricada(piezaFabricada);

        redirectAttributes.addFlashAttribute("successMessage", "¡Piezas fabricadas guardadas con éxito!");
        return "redirect:/piezas/buscarPiezas";
    }
}


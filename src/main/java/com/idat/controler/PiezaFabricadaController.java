package com.idat.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.entity.PiezaFabricada;
import com.idat.request.PiezaFabricadaRequest;
import com.idat.response.PiezaFabricadaResponse;
import com.idat.service.LineaService;
import com.idat.service.PiezaFabricadaService;

@RestController
public class PiezaFabricadaController {
    @Autowired
    private PiezaFabricadaService piezaFabricadaService;
    @Autowired
    private LineaService lineaService;

    @PostMapping("/piezasFabricadas")
    public ResponseEntity<PiezaFabricadaResponse> guardarPiezaFabricada(@RequestBody PiezaFabricadaRequest request) {
        PiezaFabricadaResponse response = new PiezaFabricadaResponse();

        if (request.getFechaFabricacion() == null || request.getCantidadLineaA() == null || request.getCantidadLineaB() == null || request.getCantidadLineaC() == null) {
            response.setMessage("Fallo en guardar piezas: los datos enviados no pueden ser null");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        PiezaFabricada piezaFabricadaA = new PiezaFabricada();
        piezaFabricadaA.setFecha_fabricacion(request.getFechaFabricacion());
        piezaFabricadaA.setCantidad(request.getCantidadLineaA());
        piezaFabricadaA.setLinea(lineaService.getLineaPorNombre("A"));
        piezaFabricadaService.guardarPiezaFabricada(piezaFabricadaA);

        PiezaFabricada piezaFabricadaB = new PiezaFabricada();
        piezaFabricadaB.setFecha_fabricacion(request.getFechaFabricacion());
        piezaFabricadaB.setCantidad(request.getCantidadLineaB());
        piezaFabricadaB.setLinea(lineaService.getLineaPorNombre("B"));
        piezaFabricadaService.guardarPiezaFabricada(piezaFabricadaB);

        PiezaFabricada piezaFabricadaC = new PiezaFabricada();
        piezaFabricadaC.setFecha_fabricacion(request.getFechaFabricacion());
        piezaFabricadaC.setCantidad(request.getCantidadLineaC());
        piezaFabricadaC.setLinea(lineaService.getLineaPorNombre("C"));
        piezaFabricadaService.guardarPiezaFabricada(piezaFabricadaC);

        response.setMessage("Piezas fabricadas guardadas con éxito");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
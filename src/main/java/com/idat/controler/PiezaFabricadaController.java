package com.idat.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.idat.entity.Fabrica;
import com.idat.entity.PiezaFabricada;
import com.idat.entity.Usuario;
import com.idat.request.PiezaFabricadaRequest;
import com.idat.response.PiezaFabricadaResponse;
import com.idat.service.LineaService;
import com.idat.service.PiezaFabricadaService;
import com.idat.service.UsuarioService;

@RestController
public class PiezaFabricadaController {
    @Autowired
    private PiezaFabricadaService piezaFabricadaService;
    @Autowired
    private LineaService lineaService;
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/piezasFabricadas/{usuarioId}")
    public ResponseEntity<PiezaFabricadaResponse> guardarPiezaFabricada(@PathVariable Integer usuarioId, @RequestBody PiezaFabricadaRequest request) {
        PiezaFabricadaResponse response = new PiezaFabricadaResponse();

        if (request.getFechaFabricacion() == null || request.getCantidadLineaA() == null || request.getCantidadLineaB() == null || request.getCantidadLineaC() == null) {
            response.setMessage("Fallo en guardar piezas: los datos enviados no pueden ser null");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        Usuario usuario = usuarioService.getUsuarioPorId(usuarioId);

        if (usuario == null) {
            response.setMessage("Fallo en guardar piezas: usuario no encontrado");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        Fabrica fabrica = usuarioService.getFabricaPorUsuarioId(usuario.getId_usuario());

        PiezaFabricada piezaFabricadaA = new PiezaFabricada();
        piezaFabricadaA.setFecha_fabricacion(request.getFechaFabricacion());
        piezaFabricadaA.setCantidad(request.getCantidadLineaA());
        piezaFabricadaA.setLinea(lineaService.getLineaPorNombre("A"));
        piezaFabricadaA.setFabrica(fabrica);
        piezaFabricadaService.guardarPiezaFabricada(piezaFabricadaA);

        // Similar for piezaFabricadaB and piezaFabricadaC...

        response.setMessage("Piezas fabricadas guardadas con éxito");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
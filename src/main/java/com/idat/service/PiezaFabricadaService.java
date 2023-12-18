package com.idat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.PiezaFabricada;
import com.idat.repository.PiezaFabRepository;

@Service
public class PiezaFabricadaService {
    @Autowired
    private PiezaFabRepository piezaFabricadaRepository;

    public PiezaFabricada guardarPiezaFabricada(PiezaFabricada piezaFabricada) {
        if (piezaFabricada.getFecha_fabricacion() == null || piezaFabricada.getCantidad() == null || piezaFabricada.getLinea() == null) {
            throw new IllegalArgumentException("Fallo en guardar piezas: los datos enviados no pueden ser null");
        }
        return piezaFabricadaRepository.save(piezaFabricada);
    }
}
package com.idat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.PiezaFabricada;
import com.idat.repository.PiezaFabRepository;

@Service
public class PiezaFabricadaService {
	@Autowired
    private PiezaFabRepository piezaFabRepository;

    public PiezaFabricada guardarPiezaFabricada(PiezaFabricada piezaFabricada) {
        return piezaFabRepository.save(piezaFabricada);
    }
}
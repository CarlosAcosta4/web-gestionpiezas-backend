package com.idat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.Linea;
import com.idat.repository.LineaRepository;

@Service
public class LineaService {
	
    @Autowired
    private LineaRepository lineaRepository;

    public Linea getLineaPorId(Integer id) {
        return lineaRepository.findById(id).orElse(null);
        
     
    }
    
    public Linea getLineaPorNombre(String nombre) {
        return lineaRepository.findByNombre(nombre).orElse(null);
    }
}
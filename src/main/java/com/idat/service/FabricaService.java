package com.idat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.Fabrica;
import com.idat.repository.FabricaRepository;

@Service
public class FabricaService {
	
	@Autowired
    private final FabricaRepository fabricaRepository;

    public FabricaService(FabricaRepository fabricaRepository) {
        this.fabricaRepository = fabricaRepository;
    }

    public Fabrica obtenerFabricaPorId(Integer id) {
        return fabricaRepository.findById(id).orElse(null);
    }

}

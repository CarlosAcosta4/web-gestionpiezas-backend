package com.idat.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.PiezaFabricada;
import com.idat.repository.BuscarPiezaFabRepository;

@Service
public class BuscarPiezaFabService {
	
	@Autowired
    private BuscarPiezaFabRepository buscarPiezaFabRepository;

    public List<PiezaFabricada> buscarPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return buscarPiezaFabRepository.findByFechaFabricacionBetween(fechaInicio, fechaFin);
    }
}

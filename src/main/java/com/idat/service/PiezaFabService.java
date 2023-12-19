package com.idat.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.PiezaFabricada;
import com.idat.repository.PiezaFabRepository;

@Service
public class PiezaFabService {
	
	@Autowired
    private PiezaFabRepository piezaFabRepository;

    public List<PiezaFabricada> buscarPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        // Lógica para buscar las piezas fabricadas por un rango de fechas
        return piezaFabRepository.findByFechaFabricacionBetween(fechaInicio, fechaFin);
    }
}

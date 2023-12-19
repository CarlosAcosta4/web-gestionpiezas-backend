package com.idat.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.entity.Fabrica;
import com.idat.entity.PiezaFabricada;


public interface PiezaFabRepository extends JpaRepository<PiezaFabricada,Integer>{
	
	 List<PiezaFabricada> findByFechaFabricacionBetween(LocalDate fechaInicio, LocalDate fechaFin);
	 
}


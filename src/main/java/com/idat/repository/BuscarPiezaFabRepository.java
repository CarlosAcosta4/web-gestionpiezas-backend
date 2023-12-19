package com.idat.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.entity.PiezaFabricada;

@Repository
public interface BuscarPiezaFabRepository extends JpaRepository<PiezaFabricada,Integer>{
	
	List<PiezaFabricada> findByFechaFabricacionBetween(LocalDate fechaInicio, LocalDate fechaFin);
	 
}

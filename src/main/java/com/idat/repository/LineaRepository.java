package com.idat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.entity.Linea;


public interface LineaRepository extends JpaRepository<Linea,Integer>{
	Optional<Linea> findByNombre(String nombre);
}


package com.idat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.entity.Fabrica;


public interface FabricaRepository extends JpaRepository<Fabrica,Integer>{
	Optional<Fabrica> findById(Integer fabricaId);
}


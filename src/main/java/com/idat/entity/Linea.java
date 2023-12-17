package com.idat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lineas")
public class Linea {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_linea;
    
    @Column()
    private String nombre;

	public Linea() {
		super();
	}

	public Linea(Integer id_linea, String nombre) {
		super();
		this.id_linea = id_linea;
		this.nombre = nombre;
	}

	public Integer getId_linea() {
		return id_linea;
	}

	public void setId_linea(Integer id_linea) {
		this.id_linea = id_linea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

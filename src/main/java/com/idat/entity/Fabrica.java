package com.idat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fabricas")
public class Fabrica {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_fabrica;
    
    @Column()
    private String sucursal;
   
	public Fabrica() {
		super();
	}

	public Fabrica(Integer id_fabrica, String sucursal) {
		super();
		this.id_fabrica = id_fabrica;
		this.sucursal = sucursal;
	}

	public Integer getId_fabrica() {
		return id_fabrica;
	}

	public void setId_fabrica(Integer id_fabrica) {
		this.id_fabrica = id_fabrica;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
}

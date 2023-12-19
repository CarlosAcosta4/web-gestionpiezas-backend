package com.idat.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "piezas_fabricadas")
public class PiezaFabricada {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pieza;
    
    @Column()
    private Integer cantidad;
    
    @DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fechaFabricacion;

    @ManyToOne
    @JoinColumn(name = "id_fabrica")
    private Fabrica fabrica;

    @ManyToOne
    @JoinColumn(name = "id_linea")
    private Linea linea;

	public PiezaFabricada() {
		super();
	}

	public PiezaFabricada(Integer id_pieza, Integer cantidad, LocalDate fechaFabricacion, Fabrica fabrica,
			Linea linea) {
		super();
		this.id_pieza = id_pieza;
		this.cantidad = cantidad;
		this.fechaFabricacion = fechaFabricacion;
		this.fabrica = fabrica;
		this.linea = linea;
	}

	public Integer getId_pieza() {
		return id_pieza;
	}

	public void setId_pieza(Integer id_pieza) {
		this.id_pieza = id_pieza;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha_fabricacion() {
		return fechaFabricacion;
	}

	public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
		this.fechaFabricacion = fecha_fabricacion;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}
}
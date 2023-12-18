package com.idat.request;

import java.time.LocalDate;

public class PiezaFabricadaRequest {
    private LocalDate fechaFabricacion;
    private Integer cantidadLineaA;
    private Integer cantidadLineaB;
    private Integer cantidadLineaC;
	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public Integer getCantidadLineaA() {
		return cantidadLineaA;
	}
	public void setCantidadLineaA(Integer cantidadLineaA) {
		this.cantidadLineaA = cantidadLineaA;
	}
	public Integer getCantidadLineaB() {
		return cantidadLineaB;
	}
	public void setCantidadLineaB(Integer cantidadLineaB) {
		this.cantidadLineaB = cantidadLineaB;
	}
	public Integer getCantidadLineaC() {
		return cantidadLineaC;
	}
	public void setCantidadLineaC(Integer cantidadLineaC) {
		this.cantidadLineaC = cantidadLineaC;
	}
    
}

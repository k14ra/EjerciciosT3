package edu.alonso.daw.tema3.ejercicioseguro;

import java.time.LocalDate;

public class Seguro {
	
	private LocalDate fechaRenovacion;
	private double precio;
	
	public Seguro(int cv) {
		this.fechaRenovacion = LocalDate.now().plusYears(1);
		if(cv >= 50 && cv < 100) {
			this.precio = 400;
		} else if(cv >= 100 && cv <= 115) {
			this.precio = 500;
		} else if(cv > 115) {
			this.precio = 700;
		}
	}
	public LocalDate getFechaRenovacion() {
		return fechaRenovacion;
	}
	public void setFechaRenovacion(LocalDate fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Seguro fechaRenovacion=" + fechaRenovacion + ", precio=" + precio;
	}


}

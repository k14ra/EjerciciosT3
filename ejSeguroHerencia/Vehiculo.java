package edu.alonso.daw.tema3.ejercicioseguro;

import java.time.LocalDate;

public class Vehiculo {
	
	private String color;
	private String matricula;
	private LocalDate fechaCompra;
	private Seguro seguro;
	private int cv;
	
	public Vehiculo(String color, String matricula, int cv) {
		this.color = color;
		this.matricula = matricula;
		this.fechaCompra = LocalDate.now();
		this.cv = cv;
		this.seguro = new Seguro(cv);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}
	@Override
	public String toString() {
		return "color=" + color + ", matricula=" + matricula + ", fechaCompra=" + fechaCompra + ", seguro="
				+ seguro + ", cv=" + cv;
	}


}

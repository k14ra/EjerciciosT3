package edu.alonso.daw.tema3.ejerciciocliente;

import java.time.LocalDate;

public class Cuenta {

	private String iban;
	private double saldo;
	private LocalDate fechaCreacion;
	private double intereses;

	public Cuenta(String iban) {
		this.iban = iban;
		this.saldo = 0;
//		this.fechaCreacion = LocalDate.now();
		this.fechaCreacion = LocalDate.of(1990, 1, 1);
		this.intereses = Intereses.calculaIntereses(this);
	}
	
	public Cuenta(String iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
		this.fechaCreacion = LocalDate.now();
		this.intereses = Intereses.calculaIntereses(this);
	}
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}
	
	@Override
	public String toString() {
		return "IBAN=" + iban + ", saldo=" + saldo + "€, fechaCreacion=" 
				+ fechaCreacion + ", intereses=" + intereses;
	}

}

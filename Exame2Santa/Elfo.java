package Exame2Santa;

import java.util.Objects;

public class Elfo extends Empleado {

	private int edad;
	private int sueldoDia;
	private double numeroRegalosEmpaquetadosDia;
	
	public Elfo(String nombre, String paisOrigen, int edad, int sueldoDia, double numeroRegalosEmpaquetadosDia) {
		super(nombre, paisOrigen);
		this.edad = edad;
		this.sueldoDia = sueldoDia;
		this.numeroRegalosEmpaquetadosDia = numeroRegalosEmpaquetadosDia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldoDia() {
		return sueldoDia;
	}

	public void setSueldoDia(int sueldoDia) {
		this.sueldoDia = sueldoDia;
	}

	public double getNumeroRegalosEmpaquetadosDia() {
		return numeroRegalosEmpaquetadosDia;
	}

	public void setNumeroRegalosEmpaquetadosDia(double numeroRegalosEmpaquetadosDia) {
		this.numeroRegalosEmpaquetadosDia = numeroRegalosEmpaquetadosDia;
	}

	@Override
	public String toString() {
		return "Elfo [edad=" + edad + ", sueldoDia=" + sueldoDia + ", numeroRegalosEmpaquetadosDia="
				+ numeroRegalosEmpaquetadosDia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(edad, numeroRegalosEmpaquetadosDia, sueldoDia);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elfo other = (Elfo) obj;
		return edad == other.edad && Double.doubleToLongBits(numeroRegalosEmpaquetadosDia) == Double
				.doubleToLongBits(other.numeroRegalosEmpaquetadosDia) && sueldoDia == other.sueldoDia;
	}
	
}

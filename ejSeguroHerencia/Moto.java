package edu.alonso.daw.tema3.ejercicioseguro;

public class Moto extends Vehiculo {

	private int cc;

	public Moto(String color, String matricula, int cv, int cc) {
		super(color, matricula, cv);
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString() + ", cc=" + cc;
	}

}

package edu.alonso.daw.tema3.ejercicioseguro;

public class Coche extends Vehiculo {

	private int numPlazas;

	public Coche(String color, String matricula, int cv, int numPlazas) {
		super(color, matricula, cv);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	public String toString() {
		return "Coche: " + super.toString() + ", numPlazas=" + numPlazas;
	}

}

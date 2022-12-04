package Ejercicioclaseempleados;

public class Jefe extends Empleado{

	private double bonusDirector;

	public Jefe(String nombre, int edad, String dni, double sueldo) {
		super(nombre, dni, edad, sueldo);
		bonusDirector = 30;
		super.setFuncion("Director");
	}

	public double getBonusDirector() {
		return bonusDirector;
	}

	public void setBonusDirector(double bonusDirector) {
		this.bonusDirector = bonusDirector;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFunción: " + super.getFuncion() + "\nPorcentaje bonus: " + bonusDirector;
	}
}

package Ejercicioclaseempleados;

public class Tester extends Empleado {

	private int ProyectosPendientes;

	public Tester(String nombre, String dni, int edad, double sueldo, int proyectosPendientes) {
		super(nombre, dni, edad, sueldo);
		ProyectosPendientes = proyectosPendientes;
		super.setFuncion("Tester");
	}

	public int getProyectosPendientes() {
		return ProyectosPendientes;
	}

	public void setProyectosPendientes(int proyectosPendientes) {
		this.ProyectosPendientes = proyectosPendientes;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFunción: " + super.getFuncion() + "\nNúmero de proyectos pendientes de testing: "
				+ ProyectosPendientes;
	}
}

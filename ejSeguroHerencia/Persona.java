package edu.alonso.daw.tema3.ejercicioseguro;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Vehiculo vehiculoSemana;
	private Vehiculo vehiculoFinSemana;

	public Persona(String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}

	public Persona(String nombre, String apellido1, String apellido2, String dni, Vehiculo vehiculoSemana) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.vehiculoSemana = vehiculoSemana;
	}

	public Persona(String nombre, String apellido1, String apellido2, String dni, Vehiculo vehiculoSemana,
			Vehiculo vehiculoFinSemana) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.vehiculoSemana = vehiculoSemana;
		this.vehiculoFinSemana = vehiculoFinSemana;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Vehiculo getVehiculoSemana() {
		return vehiculoSemana;
	}

	public void setVehiculoSemana(Vehiculo vehiculoSemana) {
		this.vehiculoSemana = vehiculoSemana;
	}

	public Vehiculo getVehiculoFinSemana() {
		return vehiculoFinSemana;
	}

	public void setVehiculoFinSemana(Vehiculo vehiculoFinSemana) {
		this.vehiculoFinSemana = vehiculoFinSemana;
	}

	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", vehiculoSemana=" + vehiculoSemana + ", vehiculoFinSemana=" + vehiculoFinSemana;
	}
}

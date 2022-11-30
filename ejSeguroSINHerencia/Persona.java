package edu.alonso.daw.tema3.ejercicioseguro;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Coche cocheSemana;
	private Coche cocheFinSemana;

	public Persona(String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}

	public Persona(String nombre, String apellido1, String apellido2, String dni, Coche cocheSemana) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.cocheSemana = cocheSemana;
	}

	public Persona(String nombre, String apellido1, String apellido2, String dni, Coche cocheSemana,
			Coche cocheFinSemana) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.cocheSemana = cocheSemana;
		this.cocheFinSemana = cocheFinSemana;
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

	public Coche getCocheSemana() {
		return cocheSemana;
	}

	public void setCocheSemana(Coche cocheSemana) {
		this.cocheSemana = cocheSemana;
	}

	public Coche getCocheFinSemana() {
		return cocheFinSemana;
	}

	public void setCocheFinSemana(Coche cocheFinSemana) {
		this.cocheFinSemana = cocheFinSemana;
	}

	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", cocheSemana=" + cocheSemana + ", cocheFinSemana=" + cocheFinSemana;
	}
}

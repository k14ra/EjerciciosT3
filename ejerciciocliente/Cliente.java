package edu.alonso.daw.tema3.ejerciciocliente;

public class Cliente {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int telefono;
	private Cuenta cuenta;
	
	public Cliente(String nombre, String apellido1, String apellido2, String dni, Cuenta cuenta) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.cuenta = cuenta;
	}
	
	/*public Cliente(String nombre, String apellido1, String apellido2, String dni, String iban, double saldo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		Cuenta cuenta = new Cuenta(iban, saldo);
		this.cuenta = cuenta;
	}*/
	
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", telefono=" + telefono + "\nCuenta=" + cuenta.toString();
	}
}


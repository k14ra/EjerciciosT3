package Exame2Santa;

import java.util.Objects;

public class Empleado {

	private String nombre;
	private String paisOrigen;
	
	public Empleado(String nombre, String paisOrigen) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", paisOrigen=" + paisOrigen + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, paisOrigen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(paisOrigen, other.paisOrigen);
	}
	
}

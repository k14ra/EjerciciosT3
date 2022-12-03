package SimulacroExamen;

import java.time.LocalDate;

public abstract class  Servicio {

	private Cuenta cuenta1;
	private double precio;
	private LocalDate fechaAlta;
	
	public Servicio(Cuenta cuenta1, double precio, LocalDate fechaAlta) {
		this.cuenta1 = cuenta1;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
	}

	public abstract double costeServicioPersona();
		
	public Cuenta getCuenta1() {
		return cuenta1;
	}

	public void setCuenta1(Cuenta cuenta1) {
		this.cuenta1 = cuenta1;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Coste del servicio: " + precio	+ "\nDado de alta: " + fechaAlta;
	}

}

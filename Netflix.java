package SimulacroExamen;

import java.time.LocalDate;

public class Netflix extends Servicio{

	private Cuenta cuenta2;
	private Cuenta cuenta3;
	private String pais;
	

	public Netflix(Cuenta cuenta1, double precio, LocalDate fechaAlta, String pais) {
		super(cuenta1, precio, fechaAlta);
		this.pais = pais;
	}
	
	@Override
	public double costeServicioPersona() {
		
		int cantidadCuentas = 1;
		
		if(this.cuenta2 != null) {
			cantidadCuentas++;
		}
		if(this.cuenta3 != null) {
			cantidadCuentas++;
		}
		
		return super.getPrecio()/cantidadCuentas;
	}
	
	public Cuenta getCuenta2() {
		return cuenta2;
	}
	public void setCuenta2(Cuenta cuenta2) {
		this.cuenta2 = cuenta2;
	}
	public Cuenta getCuenta3() {
		return cuenta3;
	}
	public void setCuenta3(Cuenta cuenta3) {
		this.cuenta3 = cuenta3;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		String info = "Servicio Netflix\n" + super.toString() + "\nContenido valido para " 
				+ this.pais + "\nInformacion sobre las cuentas: ";
		info = info + "\n" + super.getCuenta1();
		
		if(this.cuenta2 != null) {
			info = info + "\n\n" + this.cuenta2;
		}
		if(this.cuenta3 != null) {
			info = info + "\n\n" + this.cuenta3;
		}
		
		return info;
	}
	
}

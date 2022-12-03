package SimulacroExamen;

import java.time.LocalDate;

public class PrimeVideo extends Servicio{

	private String cuentaAmazon;

	public PrimeVideo(Cuenta cuenta1, double precio, LocalDate fechaAlta, String cuentaAmazon) {
		super(cuenta1, precio, fechaAlta);
		this.cuentaAmazon = cuentaAmazon;
	}

	@Override
	public double costeServicioPersona() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getCuentaAmazon() {
		return cuentaAmazon;
	}

	public void setCuentaAmazon(String cuentaAmazon) {
		this.cuentaAmazon = cuentaAmazon;
	}

	@Override
	public String toString() {
		return "PrimeVideo [cuentaAmazon=" + cuentaAmazon + "]";
	}


}

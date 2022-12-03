package SimulacroExamen;

import java.time.LocalDate;

public class HboMax extends Servicio {
	
	private Cuenta cuenta2;
	private boolean hboNormal;
	
	public HboMax(Cuenta cuenta1, double precio, LocalDate fechaAlta, boolean hboNormal) {
		super(cuenta1, precio, fechaAlta);
		this.hboNormal = hboNormal;
	}

	@Override
	public double costeServicioPersona() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Cuenta getCuenta2() {
		return cuenta2;
	}

	public void setCuenta2(Cuenta cuenta2) {
		this.cuenta2 = cuenta2;
	}

	public boolean isHboNormal() {
		return hboNormal;
	}

	public void setHboNormal(boolean hboNormal) {
		this.hboNormal = hboNormal;
	}

	@Override
	public String toString() {
		return "HboMax [cuenta2=" + cuenta2 + ", hboNormal=" + hboNormal + "]";
	}


}

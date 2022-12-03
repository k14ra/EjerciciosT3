package SimulacroExamen;

public class Cuenta {

	private String nombrePersona;
	private String apodo;
	private boolean titular;
	private String numCuenta;
	
	public Cuenta(String nombrePersona, String apodo, boolean titular, String numCuenta) {
		this.nombrePersona = nombrePersona;
		this.apodo = apodo;
		this.titular = titular;
		this.numCuenta = numCuenta;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	@Override
	public String toString() {
		return "\tInformacion de " + nombrePersona + "\n\tUsuario: " + apodo
				+ "\n\tNumero de cuenta: " + numCuenta + (this.titular ? "\n\tEs titular" : "");
	}
	
	
}

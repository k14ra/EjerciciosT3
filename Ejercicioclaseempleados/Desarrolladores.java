package Ejercicioclaseempleados;

public class Desarrolladores extends Empleado{

	private boolean sabeJava;
	private boolean sabeJavaScript;
	private boolean sabeNet;
	
	public Desarrolladores(String nombre, String dni, int edad, double sueldo, boolean sabeJava, boolean sabeJavaScript,
			boolean sabeNet) {
		super(nombre, dni, edad, sueldo);
		this.sabeJava = sabeJava;
		this.sabeJavaScript = sabeJavaScript;
		this.sabeNet = sabeNet;
		super.setFuncion("Desarrollador");
	}

	//CONOCIMIENTOS DEL DESARROLLADOR
	public String conocimientos() {
		String conocimientos = "";
		if (sabeJava == true) {
			conocimientos += "\nJava";
		}
		if (sabeJavaScript == true) {
			conocimientos += "\nJavaScript";
		}
		if (sabeNet == true) {
			conocimientos += "\n.Net";
		}
		return conocimientos;
	}
	
	public boolean isSabeJava() {
		return sabeJava;
	}

	public void setSabeJava(boolean sabeJava) {
		this.sabeJava = sabeJava;
	}

	public boolean isSabeJavaScript() {
		return sabeJavaScript;
	}

	public void setSabeJavaScript(boolean sabeJavaScript) {
		this.sabeJavaScript = sabeJavaScript;
	}

	public boolean isSabeNet() {
		return sabeNet;
	}

	public void setSabeNet(boolean sabeNet) {
		this.sabeNet = sabeNet;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFuncion: " + super.getFuncion() + "\nDispone de conocimientos en: "
				+ conocimientos();
	}

}

package Ejercicioclaseempleados;

public class Empresa {

	private Empleado jefe;
	private Empleado desarrollador1;
	private Empleado desarrollador2;
	private Empleado desarrollador3;
	private Empleado tester1;
	private Empleado tester2;
	
	public Empresa(Empleado jefe, Empleado desarrollador1, Empleado desarrollador2, Empleado desarrollador3,
			Empleado tester1, Empleado tester2) {
		this.jefe = jefe;
		this.desarrollador1 = desarrollador1;
		this.desarrollador2 = desarrollador2;
		this.desarrollador3 = desarrollador3;
		this.tester1 = tester1;
		this.tester2 = tester2;
	}

	public String listaEmpleados() {
		String lista = "";
		if (jefe != null) {
			lista += "\n" + ((Empleado) jefe).getFuncion();
		}
		if (desarrollador1 != null) {
			lista += "\n" + ((Empleado) desarrollador1).getFuncion();
		}
		if (desarrollador2 != null) {
			lista += "\n" + ((Empleado) desarrollador1).getFuncion();
		}
		if (desarrollador3 != null) {
			lista += "\n" + ((Empleado) desarrollador1).getFuncion();
		}
		if (tester1 != null) {
			lista += "\n" + ((Empleado) tester1).getFuncion();
		}
		if (tester2 != null) {
			lista += "\n" + ((Empleado) tester2).getFuncion();
		}
		return lista;

	}
	
	//METODO PARA MOSTRAR LOS SUELDOS DE CADA EMPLEADO:
	public String listaSueldos() {
		String listaSueldos = "";
		//un Casting se usa para acceder a metodos de tus hijos o padres segun el casting que tengas
		//en este caso el bonus lo tengo en el hijo pero el sueldo en el padre
		//casting: ((Archivo)variable).metodo para acceder al hijo y obtener el bonus.
		//Si quisiera acceder al padre sería ((Empleado)director).metodo
		double bonusDirector = jefe.getSueldo() * ((Jefe) jefe).getBonusDirector() / 100;
		double sueldoDirector = bonusDirector + jefe.getSueldo();
		
		listaSueldos += "El jefe cobra: " + jefe.getSueldo() + "€ " + "más un bonus de " + 
						bonusDirector + " Sueldo total: " + sueldoDirector;
		listaSueldos += "\n El primer programador cobra: " + desarrollador1.getSueldo();
		
		if(desarrollador2 != null) {
			listaSueldos += "\n El segundo programador cobra: " + desarrollador2.getSueldo();
		}
		if(desarrollador3 != null) {
			listaSueldos += "\n El tercer programador cobra: " + desarrollador3.getSueldo();
		}
		if(tester1 != null) {
			listaSueldos += "\n El primer tester cobra: " + tester1.getSueldo();
		}
		if(tester2 != null) {
			listaSueldos += "\n El segundo tester cobra: " + tester2.getSueldo();
		}
		
		return listaSueldos;
	}

	@Override
	//ESTE METODO SOLO DEBE MOSTRAR LOS EMPLEADOS CONTRATADOS
	public String toString() {
		return "ViewNext dispone de los siguientes empleados\n" + listaEmpleados();
	}
	
	
	
	
}

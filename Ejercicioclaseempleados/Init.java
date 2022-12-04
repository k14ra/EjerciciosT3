package Ejercicioclaseempleados;

public class Init {

	public static void main(String[] args) {
		Empleado empleado1 = new Jefe("Kiara", 21, "70830449v", 100000);
		Empleado empleado2 = new Desarrolladores("Dani", "8539166v", 17, 40000, true, false, true);
		Empleado empleado3 = new Tester("Sergio", "42739166v", 37, 20000, 4);
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		Empresa listaEmpleados = new Empresa(empleado1,empleado2,empleado2,null,empleado3,null);
		System.out.println(listaEmpleados);
		System.out.println(listaEmpleados.listaSueldos());
	}
}

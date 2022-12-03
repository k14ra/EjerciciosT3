package SimulacroExamen;

import java.time.LocalDate;

public class Init {

	public static void main(String[] args) {
		
		GestorServicios gestor = new GestorServicios();

		Cuenta cuenta1Netflix = new Cuenta("Kiara GM", "Shiro", true, "ES02 5674 5784 76 8465746354");
		Cuenta cuenta2Netflix = new Cuenta("Daira GM", "Daira", false, "ES05 5748 2337 90 8465746354");

		Netflix net = new Netflix(cuenta1Netflix, 15.99, LocalDate.now(), "España");
		net.setCuenta2(cuenta2Netflix);
		
		gestor.setNetflix(net);
		
		System.out.println(gestor.toString());
		gestor.mostrarInformacionServicios();
		
		System.out.println("\n\nCOSTE DE SERVICIOS POR PERSONA");
		System.out.println("Netflix: " + gestor.getNetflix().costeServicioPersona());
	}
	
}

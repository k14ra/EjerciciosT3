package edu.alonso.daw.tema3.ejerciciocliente;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Nombre: "); String nombre = sc.nextLine();
		 * 
		 * System.out.print("Apellido1: "); String ap1 = sc.nextLine();
		 * 
		 * System.out.print("Apellido2: "); String ap2 = sc.nextLine();
		 * 
		 * System.out.print("DNI: "); String dni = sc.nextLine();
		 * 
		 * System.out.print("IBAN: "); String iban = sc.nextLine();
		 * 
		 * System.out.print("Vas a hacer un ingreso inicial?(Y/N)");
		 * 
		 * String ingreso = sc.nextLine();
		 * 
		 * Cuenta cuenta = null; //double saldoInicial = 0;
		 * if(ingreso.equalsIgnoreCase("Y")) { System.out.print("Saldo inicial: ");
		 * double saldoInicial = Double.valueOf(sc.nextLine()); cuenta = new
		 * Cuenta(iban, saldoInicial); } else { cuenta = new Cuenta(iban); }
		 * 
		 * sc.close();
		 */

		String nombre = "Fran";
		String ap1 = "Pérez";
		String ap2 = "Arribassssss";
		String dni = "70707070H";
		String iban = "ES98 9078 65 1828374654";
		double saldoInicial = 60;
//		Cuenta cuenta = new Cuenta("ES98 9078 65 1828374654", 90);
		/*
		 * Cuenta cuenta = new Cuenta("ES98 9078 65 1828374654");
		 * 
		 * Cliente cli1 = new Cliente(nombre, ap1, ap2, dni, cuenta); // Cliente cli1 =
		 * new Cliente(nombre, ap1, ap2, dni, iban, saldoInicial);
		 */

		Cliente cli1 = crearCliente(nombre, ap1, ap2, dni, iban, saldoInicial);
		

		System.out.println(cli1.toString());

		// El cliente vuelve de nuevo
		cli1.setApellido2("Arribas");

		System.out.println(cli1.toString());

		// El cliente ingresa dinero
//		cli1.getCuenta().setSaldo(80);
//		cuenta.setSaldo(50);

		// Uso de un dato
		System.out.println("Saldo del cliente: " + cli1.getCuenta().getSaldo());
		
		Cliente cli2 = crearCliente("Juan", "López", "Sánchez", "71323232P", "ES98 9078 65 5554441110");
		System.out.println("-------------------");
		System.out.println("Otro objeto");
		System.out.println("-------------------");
		System.out.println(cli2);
		
		


	}

	public static Cliente crearCliente(String nombre, String ap1, String ap2, String dni, String iban,
			double saldoInicial) {
		Cuenta cuenta = new Cuenta("ES98 9078 65 1828374654", saldoInicial);


		Cliente cli1 = new Cliente(nombre, ap1, ap2, dni, cuenta);
		return cli1;
	}

	public static Cliente crearCliente(String nombre, String ap1, String ap2, String dni, String iban) {
		Cuenta cuenta = new Cuenta("ES98 9078 65 1828374654");
		


		Cliente cli1 = new Cliente(nombre, ap1, ap2, dni, cuenta);
		return cli1;
	}
}

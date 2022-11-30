package edu.alonso.daw.tema3.ejercicioseguro;

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
		 * 

		 * sc.close();
		 */

		String nombre = "Fran";
		String ap1 = "Pérez";
		String ap2 = "Arribas";
		String dni = "70707070H";
		
		// Entra una persona, y no compra
		Persona per1 = new Persona(nombre, ap1, ap2, dni);
		
		// Otra persona entra y sí compra
		
		Persona per2 = new Persona("Juan", ap1, "López", "71717171H");
		
		Coche coche1 = new Coche("Rojo", "7876-HGF", 90);
		per2.setCocheSemana(coche1);
		
		System.out.println("Persona 1: " + per1);
		
		System.out.println("Persona 2: " + per2);
		
		System.out.println("El marido quiere otro para el fin de semana...");
		// Llega a casa y su marido quiere otro coche
		Coche coche2 = new Coche("Azul", "5566-HGF", 170);
		
		per2.setCocheFinSemana(coche2);
		
		System.out.println("Persona 2: " + per2);
		


	}

	
}

package EJSMETODOS;

import java.util.Scanner;

public class ej1 {

	/*
	 * Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
	 * y retorna un valor true en caso de que el carácter sea una vocal, y un valor
	 * false en caso contrario.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter, si es vocal devolvere true.");
		String caracter = sc.nextLine();
		System.out.println(esVocal(caracter));
		
	}

	public static boolean esVocal(String caracter) {
		switch(caracter.toLowerCase()) {
		case "a": return true;
		case "e": return true;
		case "i": return true;
		case "o": return true;
		case "u": return true;
		}
		return false;
	}
}

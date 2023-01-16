package EJSMETODOS;

public class ej6MCD {

	/*
	 * Método mcd() (máximo común divisor), que calcule el mcd de dos números
	 * pasados como parámetros utilizando el algoritmo de Euclides. Este algoritmo
	 * dice que si tenemos dos números A y B, restamos el menor del mayor hasta que
	 * A y B sean iguales, es ese momento tenemos el valor de mcd.
	 */

	/*
	 * https://es.khanacademy.org/computing/computerscience/cryptography/
	 * modarithmetic/a/the-euclidean-algorithm
	 */

	public static void main(String[] args) {

		System.out.println("30, 27 -> " + mcd(30, 27));
	}

	public static int mcd(int a, int b) {
		while (a != b) {
			if (a == 0) {
				return b;
			}
			if (b == 0) {
				return a;
			}

			int aux = b;
			b = a % b;
			a = aux;
		}
		
		return a;
	}

}

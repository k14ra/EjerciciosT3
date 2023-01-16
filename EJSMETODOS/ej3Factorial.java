package EJSMETODOS;

public class ej3Factorial {

	/*
	 * Método factorial(), que calculará el factorial del número que se le pasa como
	 * parámetro. Retornará el resultado del calculo del factorial, o bien un -1 en
	 * caso de que el parámetro pasado sea negativo, y un -2 en caso de que el
	 * parámetro pasado sea cero.
	 */

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static double factorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}
	
	
}
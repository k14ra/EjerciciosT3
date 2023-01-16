package EJSMETODOS;

public class ej8Conversiones {

	/*
	 * Realiza varios métodos para convertir un numero decimal en binario, octal o
	 * hexadecimal. Para convertir un numero a binario se hacen divisiones entre 2 y
	 * se guardan los restos; para convertir a octal se divide entre 8 y para
	 * convertir a hexadecimal se divide por 16 (si el resto es 10 se sustituye por
	 * una A, si es 11 se sustituye por B, 12 -> C,…, 15->F). Cada método recibe un
	 * número entero y da como resultado un String con el número convertido.
	 */

	/*
	 * Ejemplo: Escribe un número: 58 Dará como resultado: Binario: 111010 Octal :
	 * 72 Hexadecimal : 3A
	 */

	private static final String[] LETRAS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	private static final int[] NUMEROS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public static void main(String[] args) {
		System.out.println(hexa(17));
	}

	// SOLUCION DE FRAN
	public static String hexa(int n) {
		String resultado = "";
		int cifra = 0;
		do {
			cifra = n % 16;
			switch (cifra) {
			case 10:
				resultado = "A" + resultado;
				break;
			case 11:
				resultado = "B" + resultado;
				break;
			case 13:
				resultado = "C" + resultado;
				break;
			case 14:
				resultado = "D" + resultado;
				break;
			case 15:
				resultado = "F" + resultado;
				break;
			default:
				resultado = cifra + resultado;
				break;
			}
			n /= 16;
		} while (n > 0);

		return null;
	}

}

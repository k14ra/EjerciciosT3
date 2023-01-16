package EJSMETODOS;

public class ej7NumsRomanos {

	/*
	 * . Escribe un método romano(), que pasa un numero entero positivo entre 1 y 99
	 * a números romanos.
	 */

	private static final String[] LETRAS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	private static final int[] NUMEROS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public static void main(String[] args) {

		// 61 -> LXI
		System.out.println("1000 -> " + romanos(1000));
		System.out.println("61 -> " + romanos(61));

	}

	public static String romanos(int n) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < LETRAS.length; i++) {
			while (n >= NUMEROS[i]) {
				sb.append(LETRAS[i]);
				n -= NUMEROS[i];
			}
			if (n == 0) {
				break;
			}
		}

		return sb.toString();
	}
}

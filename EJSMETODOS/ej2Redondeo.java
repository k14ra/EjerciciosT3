package EJSMETODOS;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ej2Redondeo {

	/*
	 * Realiza un método redondear() al que se le pasa como parámetro un numero
	 * float y los decimales que deben quedar después de redondear, y retorna el
	 * numero redondeado. 
		 * Ejemplo: redondear( 234.49234 , 3 ) 
		 * Da como resultado : 234.492
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero a redondear y el numero de decimales que quieres:");
		System.out.println("Numero a redondear: ");
		float num = sc.nextFloat();
		System.out.println("Numero de decimales: ");
		int decimal = sc.nextInt();
		
		sc.close();
		
		redondear(num, decimal);
		redondear2(3.473, 2);
	}
	
	public static void redondear(float num, int decimal) {
		num *= Math.pow(10,  decimal);
		
		double lastCifra = num * Math.pow(10, decimal + 1);
		lastCifra %= 10;
		
		if (lastCifra >= 5) {
			num += 1;
		}
		
		num = (int) num;
		num /= Math.pow(10,  decimal);
		
		System.out.println(num);
	}
	
	
	public static double redondear2(double num, int decimal) {
		double factor = Math.pow(10,  decimal);
		
		num *= factor;
		
		int ultimaCifra = (int) ((num * 10) % 10);
		
		if(ultimaCifra >= 5) {
			num++;
		}
		
		//Trunco el numero
		num = (int) num;
		return num / factor;
	}
	
	public static double redondeoB (double num, int decimal) {
		BigDecimal bd = new BigDecimal(num).setScale(decimal, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}
	
}

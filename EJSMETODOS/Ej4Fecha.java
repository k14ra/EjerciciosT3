package EJSMETODOS;

public class Ej4Fecha {

	/*
	 * Método fecha() que calculará el día del año al que corresponde una fecha en
	 * formato día, mes. 
	 * fecha(1,1)=1 fecha(11,3)=70 fecha(31,12)=365
	 */
	
	public static void main(String[] args) {
		System.out.println(fecha(31,12));
		System.out.println(fecha(11, 3));
		System.out.println(fecha(1, 1));
	}

	public static int fecha(int dia, int mes) {
		int total = 0;
		
		for (int i = 1; i < mes; i++) {
			switch (i) {
			case 2:
				total += 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				total += 30;
				break;
			default:
				total += 31;
			}
		}
		
		//sumo los dias del mes 
		return total + dia;
	}
}

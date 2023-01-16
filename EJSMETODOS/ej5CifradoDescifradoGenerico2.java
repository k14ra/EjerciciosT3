package EJSMETODOS;


/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de 
caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o 
descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que 
está dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta 
que el cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de 
descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán 
ningún cambio*/

//GENERICO

public class ej5CifradoDescifradoGenerico2 {
	
	public static void main(String[] args) {
		
		System.out.println("hola -> " + cifrar("hola", 2));
		System.out.println("jqnc -> " + descifrar("jqnc", 2));
	}

	public static String cifrar(String frase, int clave) {
		StringBuilder sb = new StringBuilder();
		
		clave%= 26;
		
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isLowerCase(frase.charAt(i))) {
				int letraResultante = frase.charAt(i) + clave;
				if(letraResultante > 'z') {
					letraResultante -= 26;
					//26 es el numero de letras del abecedario, sin incluir la ñ
				}
				sb.append((char)letraResultante);
			}
		}
		return sb.toString();
	}

	public static String descifrar(String frase, int clave) {
		StringBuilder sb = new StringBuilder();
		
		clave%= 26;
		
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isLowerCase(frase.charAt(i))) {
				int letraResultante = frase.charAt(i) - clave;
				if(letraResultante > 'a') {
					letraResultante += 26;
				}
				sb.append((char)letraResultante);
			}
		}
		return sb.toString();
	}

}

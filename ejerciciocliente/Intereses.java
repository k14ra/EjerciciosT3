package edu.alonso.daw.tema3.ejerciciocliente;

import java.time.LocalDate;

public class Intereses {
	
	public static double calculaIntereses(Cuenta cuenta) {
		
		double result = 0;
		
		if(cuenta.getFechaCreacion().isBefore(LocalDate.now().minusYears(3))
				&& cuenta.getFechaCreacion().isAfter(LocalDate.now().minusYears(5))) {
			result = 0.05;
		} else if(cuenta.getFechaCreacion().isBefore(LocalDate.now().minusYears(5))){
			result = 0.1;
		}
		
		return result;
	}

}

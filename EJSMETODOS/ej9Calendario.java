package EJSMETODOS;

public class ej9Calendario {

	public static void main(String[] args) {

		for (int mes = 1; mes <= 12; mes++) {
			imprimeCalendario(mes, 2017);
		}

		// imprimeCalendario(4, 2017);
	}

	public static void imprimeCalendario(int mes, int anio) {
		StringBuilder sb = new StringBuilder();

		sb.append("\n     ").append(getMes(mes)).append(" ").append(anio);
		sb.append("\n  L  M  X  J  V  S  D\n");

		int diasMes = diasTieneMes(mes, anio);
		int diaSemana = diaComienzoMes(mes, anio);

		// El domingo sería el 0 según la fórmula
		if (diaSemana == 0) {
			diaSemana = 7;
		}

		for (int i = 1; i < diaSemana; i++) {
			sb.append("   ");
		}

		for (int dia = 1; dia <= diasMes; dia++) {
			if (dia < 10) {
				sb.append("  ").append(dia);
			} else {
				sb.append(" ").append(dia);
			}
			diaSemana++;
			if (diaSemana == 8) {
				diaSemana = 1;
				sb.append("\n");
			}
		}

		System.out.println(sb);

	}

	public static String getMes(int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		default:
			return "Diciembre";
		}
	}

	public static boolean isBisiesto(int anio) {
		return ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
	}

	public static int diaComienzoMes(int mes, int anio) {
		if (mes <= 2)
			return (anio + 31 * (mes - 1) + (anio - 1) / 4 - 3 * ((anio + 99) / 100) / 4) % 7;
		else
			return (anio + 31 * (mes - 1) - (4 * mes + 23) / 10 + anio / 4 - (3 * (anio / 100 + 1)) / 4) % 7;
	}

	public static int diasTieneMes(int mes, int anio) {
		switch (mes) {
		case 2:
			return isBisiesto(anio) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

}

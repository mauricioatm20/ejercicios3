package com.CursoJava.Introduccion.Ejercicios4;
/*12. Solicite al usuario una fecha e indicar los días que faltan hasta fin de mes.
13. Solicite al usuario una fecha e indicar la cantidad de días transcurridos en ese año hasta esa 
fecha.
14. Solicite al usuario una fecha e indicar los días que faltan hasta fin de año. (se supone que el 
año no es bisiesto)
15. Solicite al usuario dos fechas (día1, mes1, año1, día2, mes2, año2), indicar el tiempo 
transcurrido entre ambas, en años, meses y días sin tener en cuenta años bisiestos.*/


public class ejer12Al15 {
	
	public static int diasFinMes(int dia, int mes) {
		return ejer08.diaMes(mes)- dia;
	}
	
	public static int diasTrasncurridosAnyo(int dia, int mes) {
		
		int dias =0;
		for (int i=1; i < mes; i++) {
			dias += ejer08.diaMes(i);
		}
		return dias + dia;
	}
	
	
	public static int diasFaltantesAnyo(int dia, int mes) {
		int dias = ejer08.diaMes(mes)- dia;
		for(int i=mes +1; i<=12; i++ ) {
			dias += ejer08.diaMes(i);
		}
		return dias;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("faltan "+ diasFinMes(25,12)+ "  dias para fin de mes  " ); // ejer12 : 
		System.out.println(diasTrasncurridosAnyo(25,1)+" dias transcurrido en el año");// ejer13 : 
		System.out.println(diasFaltantesAnyo(31,12) + " dias restantes para fin de año"); // 
	}
}

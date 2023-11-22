package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;

/*Solicitar una fecha (día, mes, año) y validar si es una fecha correcta sin contemplar años 
bisiestos, es decir, no se puede ingresar 29 2 xxxx.*/


public class ejer09 {
	public static boolean isFechaOk(int mes, int dia, int anyo) {
		int dias = 1;
		return dias >= 1 && dias <= ejer08.diaMes(mes);
	}
	
	public static int solicitarEntero(String mensaje, Scanner scanner) {
		System.out.println(mensaje);
		return scanner.nextInt();
	}
	
	
	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);

	        int dia = solicitarEntero("Ingrese el día: ", scanner);
	        int mes = solicitarEntero("Ingrese el mes: ", scanner);
	        int anyo = solicitarEntero("Ingrese el año: ", scanner);

	        if (isFechaOk(dia, mes, anyo)) {
	            System.out.println("La fecha ingresada es válida.");
	        } else {
	            System.out.println("La fecha ingresada no es válida.");
	        }
	}
}

package com.CursoJava.Introduccion.Ejercicios4;


/*Solicite al usuario un número que represente el mes e imprima su nombre.
 * 
10. Solicite al usuario un número que represente el mes e imprima su nombre y la cantidad de 
días que tiene (no contemplar años bisiestos).*/


public class ejer08 {
	public static String mes (int num) {
		int dias;
		String mes= //empieza la instruccion // es un switc de exprecion
		switch(num){
		
		case 1:
			yield  "enero";
		case 2:
			yield  "enero";
		case 3:
			yield  "enero";
		case 4:
			yield  "enero";
		case 5:
			yield  "enero";
		case 6:
			yield  "enero";
		case 7:
			yield  "enero";
		case 8:
			yield  "enero";
		case 9:
			yield  "enero";
		case 10:
			yield  "enero";
		case 11:
			yield  "enero";
		case 12:
			yield  "enero";
			
		default:
			yield "mes incorrecto";
			
			
		} ;// termina la instruccion
		return mes;
		
	}
	
	
	public static int diaMes (int num) {
		return switch (num) {
		case 1,3,5,7,8,10,12:
			yield 31;
		case 2:
			yield 28;
		case 4,6,9,11:
			yield 30;
		default:
			yield 0;
		};
	}
	public static void main(String[] args) {
		for(int i =1; i<= 12; i++) {
			System.out.println(i + " : " + mes(i));
			
		}
		System.out.println();
		for(int i =1; i<= 12; i++) {
			System.out.println(i + " : " + diaMes(i));
		}
	}

}

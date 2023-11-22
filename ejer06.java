package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;
/*Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo: 
INGRESO: 3589, SALIDA: 9853.*/
public class ejer06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingresar un numero entero");
		int numero = teclado.nextInt();
		
		int inverso = 0;
		
		  while (numero != 0) {
	            int digito = numero % 10;
	            inverso = inverso * 10 + digito;
	            numero = numero / 10;
	        }System.out.println(inverso);
	}

}

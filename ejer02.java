package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;

public class ejer02 {
/*Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo 
muestre por pantalla en forma de asteriscos. Por ejemplo, ingresado el valor 4 la salida 
será:
****
****
****
****
*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("ingrese base de cuadrado");
		int lado = teclado.nextInt();

		for(int i=1; i<=lado; i++) {
			
			for(int j=1; j<=lado; j++) {
				System.out.print("*");	
		
			}
			System.out.println();
		}
	}	
}




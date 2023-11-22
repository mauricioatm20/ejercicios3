package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;

public class ejer03 {
/*Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente 
manera:
****
*  *
*  *
****
*
*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("ingrese numero");
		int numero = teclado.nextInt();
		
		for(int i=1; i<= numero; i++) {
			for(int j=1; j<numero; j++) {
				
				if (i == 1 || i == numero - 1 || j == 1 || j == numero - 1) { // para crear (|) se presiona "atl124"       || significa "or"
					
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
			}
			System.out.println();
		}	
	}
}
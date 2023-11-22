package com.CursoJava.Introduccion.Ejercicios4;

import java.security.DomainCombiner;
import java.util.Scanner;

/*Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).*/
public class ejer07 {

	public static boolean isCapicua(int numero) {
		
		int entrada = numero;
		int resto =0;
		
		while (numero != 0) {
			int modulo = numero % 10;
			resto = resto * 10 + modulo;
			numero = numero /10;
		} 
		return entrada == resto;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);	
		
		System.out.println("ingrese un numero entero");
		int numero = teclado.nextInt();
		
		
		if(isCapicua(numero)) {
			System.out.println("es capicua");
		}else {
			System.out.println("no es capicua");
		}
	}
	
}


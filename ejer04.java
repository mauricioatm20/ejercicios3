package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;

public class ejer04 {
/*Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea.*/
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("ingresar numero de 4 cifras");
		int numero = teclado.nextInt();
		
		
		
		if(numero >=1000 && numero <=9999) {
			
			int digito1 = numero / 1000;
			int digito2 = (numero / 100)  % 10;
			int digito3 = (numero /10) % 10;
			int digito4 = numero % 10;
			
			System.out.println("los digitos");
			
			System.out.println(digito1);
			System.out.println(digito2);
			System.out.println(digito3);
			System.out.println(digito4);
			
		}else {
			System.out.println("introduzca numero de 4 cifras");	
		}
		
		
	}

}

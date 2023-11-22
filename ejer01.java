package com.CursoJava.Introduccion.Ejercicios4;

import java.util.Scanner;

public class ejer01 {
/*Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, / ) y el 
programa debe mostrar la operación y su resultado.
Por ejemplo:
Ingrese valor: 12.5
Ingrese valor: 2
Ingrese operación: -
12.5 – 2 = 10.5*/
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		

		System.out.println("seleccion la operacion desea realizar \nsuma + \nresta - \nmultiplicacion * \ndivision /");
		String operador = teclado.nextLine();

		System.out.println("ingresar numero");
		double num1 = teclado.nextDouble();
		
		System.out.println("ingresar segundo numero");
		double num2 = teclado.nextDouble();


		double resultado;
		
		
		switch(operador) {
		
		case "+":
			
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2  + " = " + resultado);
			break;
			
		case "-":
			
			resultado = num1 + num2;
			System.out.println(num1 + " - " + num2  + " = " + resultado);
			break;
		case "*":
			
			resultado = num1 + num2;
			System.out.println(num1 + " * " + num2  + " = " + resultado);
			break;
		
		case "/":
			
			resultado = num1 + num2;
			System.out.println(num1 + " / " + num2  + " = " + resultado);
			break;
		
		}
		
	}

}

package com.CursoJava.Introduccion.Ejercicios4;
/*Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado: 
Dado un precio y una cantidad de dinero, el programa nos dirá cuántas monedas deben 
darse como cambio de tal forma que el número total de monedas sea mínimo.*/
public class ejer16 {
	public static void muestraCambio(double aPagar, double pago) {
		
		int  vuelta = (int)Math.round(pago - aPagar) * 100;
		
		int c1,c5,c10,c20,c50,e1,e2;
			c1=c5 =c10=c20=c50=e1=e2=0;
		
		if (vuelta > 0) {
			e2 = vuelta / 200;
			vuelta %= 200;
			e1 = vuelta / 100;
			vuelta %= 100;
			c50 = vuelta / 50;
			vuelta %= 50;
			c20= vuelta / 20;
			vuelta %= 20;
			c10= vuelta / 10;
			vuelta %= 10;
			c5= vuelta / 5;
			vuelta %= 5;
			c1 = vuelta;
			
			
		}
		System.out.println("2,00$ " + e2);
		System.out.println("1,00$ " + e1);
		System.out.println("0,50$ " + c50);
		System.out.println("0,20$ " + c20);
		System.out.println("0,10$ " + c10);
		System.out.println("0,05$ " + c5);
		System.out.println("0,01$ " + c1);
		System.out.println();
	
	}
	
	public static void main(String[] args) {
		double compra = 7.25;
		double pago = 10;
		
		
		System.out.println(compra);
		System.out.println(pago);
		muestraCambio(compra, pago);
	}
}

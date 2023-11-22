package com.CursoJava.Introduccion.Ejercicios4;

public class ejer06y07 {
	public static int invierte (int num) {
		
		int inv=0;
		while (num>0){
			inv= inv * 10 + num %10;
			num = num / 10;
		}
		return inv;
	}
	
	public static boolean isCapicua(int num) {
		return num == invierte(num);
	}
	
	public static void main(String[] args) {
	System.out.println(invierte(1234));
	
	System.out.println(isCapicua(1234));
}

}

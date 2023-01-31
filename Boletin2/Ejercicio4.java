package Boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		cadena = String.valueOf(sc.nextLine());
		String salida = "";
		
		for (int i=0;i<cadena.length()-1;i+=2) {
			salida += cadena.charAt(i+1);
			salida += cadena.charAt(i);
		}
		if (cadena.length()%2==1) {
			salida += cadena.charAt(cadena.length()-1);
		}
			
		System.out.println(salida);
	}
}

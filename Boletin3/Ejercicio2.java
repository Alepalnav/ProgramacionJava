package Boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		String mensaje = "";
		String numerocad = String.valueOf(numero);
		int total = 0;
		
		for (int i = 0;i<numerocad.length();i++) {
			int n = numerocad.charAt(i);
			total += n;
		}
		if (total%3==0) {
			mensaje = "es divisible";
		}else {
			mensaje = "no es divisible";
		}
		
		System.out.println(mensaje);

	}
	
	

}

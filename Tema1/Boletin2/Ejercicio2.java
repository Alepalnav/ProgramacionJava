package Boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = Integer.valueOf(sc.nextLine());
		
		String numeroCad = String.valueOf(numero);
		String numeroNuevo = "";
		
		for (int contador = numeroCad.length()-1; contador >= 0; ) {
			numeroNuevo += numeroCad.charAt(contador);
			contador--;
		}
		System.out.println(numeroNuevo);
			

	}

}

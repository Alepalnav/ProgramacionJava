package Boletin1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int numero1 = 1;
		int numero2 = 1;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		int n;
		n = Integer.valueOf(sc.nextLine());
		int contador = 2;
		System.out.println(numero1);
		System.out.println(numero2);
		
		while (contador<n) {
			resultado = numero1+numero2;
			System.out.println(resultado);
			numero1 = numero2;
			numero2 = resultado;
			contador++;
		}

	}
}

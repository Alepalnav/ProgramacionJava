package Boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int suma = 0;
		int contador = 0;
		
		while (contador<15) {
			System.out.println("Dime un número: ");
			contador++;
			numero = Integer.valueOf(sc.nextLine());
			suma += numero;
		}
		System.out.println(suma);
	}

}

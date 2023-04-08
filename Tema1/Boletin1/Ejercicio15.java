package Boletin1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		int suma = 0;
		
		while (sc != 'fin') {
			suma += numero;
			numero = Integer.valueOf(sc.nextLine());
		}
		System.out.println(suma);
		

	}

}

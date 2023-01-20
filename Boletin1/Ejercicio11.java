package Boletin1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		
		while (numero>0) {
			System.out.println(numero*numero);
			numero = Integer.valueOf(sc.nextLine());
		}

	}

}

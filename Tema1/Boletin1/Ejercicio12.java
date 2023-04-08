package Boletin1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		
		int contador = 0;
		
		while (numero>0) {
			contador++;
			numero = Integer.valueOf(sc.nextLine());
		}
		System.out.println(contador);

	}

}

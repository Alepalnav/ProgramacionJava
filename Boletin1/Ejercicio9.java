package Boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		
		while(contador<5) {
			contador++;
			numero = Integer.valueOf(sc.nextLine());
			if (numero%3==0) {
				System.out.println("Es múltiplo de 3");
			}
		}
	}

}

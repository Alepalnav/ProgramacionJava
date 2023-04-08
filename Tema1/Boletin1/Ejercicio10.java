package Boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		
		int suma = 0;
		int contador = 0;
		
		while (contador<100) {
			if (numero>0) {
				numero++;
				suma+=numero;
				contador++;
			}
		}System.out.println(suma);
	}

}

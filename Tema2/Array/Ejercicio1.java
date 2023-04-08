package Tema2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for (int c = 9;c>=0;c--) {
			numeros[c]=Integer.valueOf(sc.nextLine());
		}

		System.out.println(Arrays.toString(numeros));
	}

}

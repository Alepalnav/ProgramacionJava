package Tema2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for(int c=0;c<10;c++) {
			numeros[c]=c;
		}
		System.out.println(Arrays.toString(numeros));
		
		int numero=0;
		numero = numeros[9];
		
		for(int i=9;i>0;i--) {
			numeros[i]=numeros[i-1];
		}
		numeros[0]=numero;
		
		System.out.println(Arrays.toString(numeros));
	}

}

package Boletin1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		numero = Integer.valueOf(sc.nextLine());
		int contador = 0;
		int impar = 0;
		int cont_impar = 0;
		int par = 0;
		int mayor_par = 0;
		
		while (numero>0) {
			if (numero%2==0) {
				par += numero;
				if (numero>mayor_par){
					mayor_par = numero;
				}
			}else {
				impar += numero;
				cont_impar ++;
			}
			contador++;
			numero = Integer.valueOf(sc.nextLine());
		}
		System.out.println(contador);
		System.out.println(impar/cont_impar);
		System.out.println(mayor_par);
		
	}

}

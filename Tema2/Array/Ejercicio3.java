package Tema2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static final String DIGITOS = "0123456789";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = "";
		String valorIntroducido = "";
		int sumaTotal = 0;
		int contador = 0;
		int contadores[] = new int[DIGITOS.length()];
		
		do {
			System.out.println("introduzca un numero: ");
			n = sc.nextLine();
			sumaTotal += Integer.valueOf(n);
			contador ++;
			int tamanio = n.length();
			char ultimoDigito = n.charAt(tamanio-1);
			
			contadores[DIGITOS.indexOf(ultimoDigito)]+=1;
			
			System.out.println("introduzca mas numeros(S/N):");
			valorIntroducido = sc.nextLine();
		}while (valorIntroducido.toUpperCase().equals("S"));
		
		System.out.println(sumaTotal/contador);
		System.out.println(Arrays.toString(contadores));
		
		int mayor = contadores[0];
		for(int i = 0; i<contadores.length;i++) {
			if (contadores[i]>mayor) {
				mayor = contadores[i];
			}
		}
		int numeroMayor = 0;
		for (int a = 0; a<contadores.length;a++) {
			if(contadores[a]==mayor) {
				numeroMayor = a;
			}
		}
		System.out.println(numeroMayor);

	}
	
	 

}

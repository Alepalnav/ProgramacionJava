package Tema2.Boletin1.Ej3;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU = "\n1. Servir café solo (1 euro) \r\n"
			+ "2. Servir leche (0,8 euros)\r\n"
			+ "3. Servir café con leche (1,5 euros)\r\n"
			+ "4. Consultar estado máquina. Aparecen los datos de los depósitos y del\r\n"
			+ "   monedero\r\n"
			+ "5. Apagar máquina y salir.\n";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MaquinaCafe mCafe = new MaquinaCafe();
		
System.out.println(MENU);
		
		double dinero=0;
		
		System.out.println("Introduzca alguna de las opciones: ");
		int opcion = Integer.valueOf(sc.nextLine());
		
		while(opcion!=5) {
			
			if(opcion==1 || opcion==2 || opcion==3) {
				System.out.println("Introduzca el dinero:");
				dinero = Double.valueOf(sc.nextLine());
				
				System.out.println(mCafe.servir(dinero, opcion)); 
			}else {
				System.out.println(mCafe.toString()); 
			}
			System.out.println(MENU);

			
			System.out.println("Introduzca alguna de las opciones: ");
			opcion = Integer.valueOf(sc.nextLine());
			
		}

	}

}

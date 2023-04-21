package colecciones.boletin1.ejercicio6;

import java.util.Scanner;

public class Principal {

	public static final String MENU = "1. Añadir palabra: \n"
			+ "2. Buscar palabra en diccionario: \n"
			+ "3. Borrar una palabra del diccionario: \n"
			+ "4. Listado de palabras que empiecen por: \n"
			+ "5. Salir: ";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(MENU);
		int opcion = Integer.valueOf(sc.nextLine());
		Diccionario diccionario = new Diccionario();
		
		while(opcion!=5) {
			if(opcion==1) {
				System.out.println("Dime una palabra: ");
				String palabra = sc.nextLine();
				System.out.println("Dime su significado: ");
				String significado = sc.nextLine();
				diccionario.AñadirPalabra(palabra, significado);
				System.out.println(diccionario.toString());
			}else if(opcion==2) {
				System.out.println("Dime una palabra: ");
				String palabra = sc.nextLine();
				System.out.println(diccionario.BuscarPalabra(palabra));
			}else if(opcion==3) {
				System.out.println("Dime una palabra: ");
				String palabra = sc.nextLine();
				diccionario.BorrarPalabra(palabra);
				System.out.println(diccionario.toString());
			}else if(opcion==4) {
				System.out.println("Dime una cadena: ");
				String cadena = sc.nextLine();
				System.out.println(diccionario.ListadoPalabra(cadena));
			}
			System.out.println(MENU);
			opcion=Integer.valueOf(sc.nextLine());
		}
	}
}
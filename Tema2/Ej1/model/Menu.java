package Tema2.Ej1.model;

import java.util.Scanner;

public class Menu {

	public static final String MENU = "\n a) Asignar Vuelo. \n b) Obten el numero de vuelos. \n c) Obten el numero de kilometros"
			+ "\n d) Obten la media de kilometros por vuelo \n e) Cambio de compañia \n f) Mosttrar informacion del avion \n g) Salir";
										
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Buenas tardes, bienvenido al aeropuerto de 1B");
		
		System.out.println("Seleccione 1 para crear un avion con id y 2 para avion con id y compañía: ");
		
		Avion avion;
		
		System.out.println("Introduzca el id: ");
		String id = sc.nextLine();
		System.out.println("Introduzca la capacidad: ");
		int capacidad = Integer.valueOf(sc.nextLine());
		
		if (Integer.valueOf(sc.nextLine())==2) {
			System.out.println("Introduzca el nombre de la compañía: ");
			String compania = sc.nextLine();
			avion = new Avion(id,capacidad,compania);
			
		} else {
			avion = new Avion(id,capacidad);	
		}
		System.out.println(avion);
		
		System.out.println(MENU);
		
		String opcion = sc.nextLine();
		
		while(!opcion.equalsIgnoreCase("g")) {
			
			switch (opcion) {
			case "a":
				System.out.println("Introduzca el número de asientos ocupados: ");
				Integer numeroAsientos = Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca los kilómetros que se realizarán durante el vuelo: ");
				int kmsVuelo = Integer.valueOf(sc.nextLine());
				
				if(avion.asignarVuelo(numeroAsientos, kmsVuelo)) {
					System.out.printf("Se ha asignado el vuelo con capacidad %s y kilometros %s", numeroAsientos, kmsVuelo);
					
				}else {
					System.out.println("No ha sido posible asignar vuelo");
				}
				break;
			case "b":
				System.out.println("Este avión ha efectuado " + avion.getNumVuelos() + "vuelos");
				break;
			case "c":
				System.out.println("Este avión ha efectuado " + avion.getTotalKm() + "km de vuelos");
				break;
			case "d":
				System.out.println("Este avión ha efectuado " + avion.getMediaKm() + "km de media por vuelo");
				break;
			case "e":
				System.out.println("Introduzca el nombre de la compañia: ");
				avion.setCompania(sc.nextLine());
				break;
			case"f":
				System.out.println(avion);
				break;
			default:
				break;
			}
			System.out.println(MENU);
			opcion = sc.nextLine();
		}
		System.out.println("Saliste del menú");
		
	}
}
package Tema2.mock;

import java.util.Arrays;
import java.util.Scanner;

import Tema2.mock.model.Plato;

public class Principal {

	private static final String MENU="\n1. Dar de alta un plato.\n"
			+ "2. Modificar el precio de un plato.\n"
			+ "3. Asignar un vino a un plato.\n"
			+ "4. Mostrar información de un plato.\n"
			+ "5. Mostrar información de todos los platos.\n"
			+ "6. Salir.\n";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plato[] menu = new Plato[10];
		int posicion=0;
		
		System.out.println(MENU);
		System.out.println("Introduce una opcion:");
		int opc= Integer.valueOf(sc.nextLine());
		
		while(opc!=6) {
			
			if(opc==1) {
				System.out.println("Introduce el nombre del Plato: ");
				String nombre = sc.nextLine();
				System.out.println("Introduce el precio del Plato: ");
				double precio = Double.valueOf(sc.nextLine());
				if(platoIguales(nombre,menu)!=-1) {
					System.out.println("Platos Iguales, no es posible crearlo.");
				}else {
					Plato p = new Plato(nombre, precio);
					menu[posicion%menu.length]=p;
					posicion++;
				}
				
			}else if(opc==2) {
				System.out.println("Introduzca el nombre del plato: ");
				String nombre=sc.nextLine();
				if(platoIguales(nombre, menu)==-1 && menu[0]!=null) {
					System.out.println("El plato no existe");
				}else {
					try {
						System.out.println("Introduzca el precio a cambiar: ");
						double precioNuevo = Double.valueOf(sc.nextLine());
						menu[platoIguales(nombre, menu)].setPrecio(precioNuevo);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				}
			}else if(opc==3) {
				System.out.println("Introduzca el nombre del plato: ");
				String nombre=sc.nextLine();
				if(platoIguales(nombre, menu)==-1 && menu[0]!=null) {
					System.out.println("El plato no existe");
				}else {
					try {
						System.out.println("Introduzca el nombre del vino: ");
						String nombreVino = sc.nextLine();
						System.out.println("Introduzca el graduacion del vino: ");
						double gradVino = Double.valueOf(sc.nextLine());
						menu[platoIguales(nombre, menu)].setVinoRecomendado(nombreVino, gradVino);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					
				}
			}else if(opc==4) {
				System.out.println("Introduzca el nombre del plato: ");
				String nombre=sc.nextLine();
				if(platoIguales(nombre, menu)==-1) {
					System.out.println("No existe el plato.");
				}else {
					System.out.println(menu[platoIguales(nombre, menu)].toString());
				}
			}else if(opc==5) {
				System.out.println(Arrays.toString(menu));
			}
			System.out.println(MENU);
			System.out.println("Introduce una opcion:");
			opc= Integer.valueOf(sc.nextLine());
		}
		
		
	}
	
	public static int platoIguales (String nombre, Plato[] menu) {
		int res = -1;
		for(int i=0;i<menu.length && res==-1; i++) {
			if(menu[i]!=null && nombre!=null && !nombre.isEmpty()&&   menu[i].getNombre().equalsIgnoreCase(nombre)) {
				res=i;
			}
		}
		return res;
	}

	

}

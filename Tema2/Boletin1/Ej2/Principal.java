package Tema2.Boletin1.Ej2;

import java.util.Scanner;

public class Principal {

	public static final String menu = "1. Hacer reintegro, se pedirá la cantidad a retirar. \n "
			+ "2. Hacer ingreso, se pedirá la cantidad a ingresar. \n"
			+ "3. Consultar el saldo y el número de reintegros e ingresos realizados. "
			+ "4. Finalizar las operaciones. Debe confirmar si realmente desea salir e\r\n"
			+ "informar del saldo al final de todas las operaciones. ";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cuenta cuenta = new Cuenta(0, 0, 0);
		
		System.out.println("Introduce un saldo inicial a introducir en la cuenta:");
		double saldo = Double.valueOf(sc.nextLine());
		cuenta.ingreso(saldo);
		
		boolean res = false;
		
		while(res==false) {
			
			System.out.println(menu);
			System.out.println("Introduce alguna opcion: ");
			int opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce el saldo a retirar: ");
				double reintegro = Double.valueOf(sc.nextLine());
				System.out.println("Retirado con exito? "+ cuenta.reintegro(reintegro));
				break;
				
			case 2:
				System.out.println("Introduce el saldo a ingresar: ");
				double ingreso = Double.valueOf(sc.nextLine());
				System.out.println("Ingresado con exito? "+cuenta.ingreso(ingreso));
				break;
				
			case 3:
				System.out.println(cuenta.toString());
				break;
				
			case 4:
				
				System.out.println("Desea salir? (S/N)");
				String sn = sc.nextLine();
				
				if(sn.equalsIgnoreCase("S")) {
					System.out.println("Seguro? (S/N)");
					String sg = sc.nextLine();
					
					res= sn.equalsIgnoreCase(sg)? true:res;
				}
				break;
			}

		}
		System.out.println("Saldo final de su cuenta es "+cuenta.getSaldo()+"€");
		

	}

}
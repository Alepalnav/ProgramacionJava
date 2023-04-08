package POO_avanzada.Cartas;

import java.util.Scanner;

public class Main {
	
	public static final String MENU = "1. Pedir una carta.\n"
			+ "2. Plantarse.\n";

	public static void main(String[] args) {
	
	Baraja baraja = new Baraja();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(MENU);
	int opcion = Integer.valueOf(sc.nextLine());
	
	double totaljugador1 = 0;
	double totaljugador2 = 0;
	int contador = 0;
	
	while(opcion!=2) {
		baraja.barajar();
		if(contador%2==0) {		
			System.out.println("Su carta es "+baraja.getSiguiente(contador));
			if(baraja.getNumero(contador)<7) {
				totaljugador1+=baraja.getNumero(contador);
			}else {
				totaljugador1+=0.5;
			}
		}else {
			System.out.println("La carta de la banca es "+baraja.getSiguiente(contador));
			if(baraja.getNumero(contador)<7) {
				totaljugador2+=baraja.getNumero(contador);
			}else {
				totaljugador2+=0.5;
			}
		}
		System.out.println(MENU);
		opcion = Integer.valueOf(sc.nextLine());
		contador++;
	}
	
	if(totaljugador1<=7.5&&totaljugador2<=7.5) {
		if(totaljugador1>totaljugador2) {
			System.out.println("Ha ganado el jugador 1");
		}else if(totaljugador1<totaljugador2) {
			System.out.println("Gana la banca");
		}else {
			System.out.println("Gana la banca");
		}
	}else if(totaljugador1<=7.5&&totaljugador2>7.5){
		System.out.println("Ha ganado el jugador 1");
	}else {
		System.out.println("Gana la banca");
	}
	
	
	}
}

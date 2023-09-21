package main;

import java.util.ArrayList;
import java.util.Scanner;

import elementos.ElementType;
import elementos.JugadorException;
import elementos.PlayerType;
import logica.juego.Constantes;
import logica.juego.Juego;
import logica.juego.JuegoException;
import logica.juego.JuegoGUI;

public class mainJuego {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws JuegoException {
		// TODO Auto-generated method stub
		
		try {
			
			
			ArrayList<PlayerType> jugadores = new ArrayList<>();
			jugadores.add(PlayerType.ELFO);
			jugadores.add(PlayerType.GUERRERO);
			jugadores.add(PlayerType.MAGO);
			jugadores.add(PlayerType.OGRO);
			
			PlayerType[] ordenJugadores = new PlayerType[Constantes.NUM_JUGADORES];
			
			/**
			 * Hay que elegir qué jugador va a ser cada uno, pero no se permiten jugadores repetidos
			 */
			int numJugadores =0;
			while (numJugadores < Constantes.NUM_JUGADORES - 1 ) {
				System.out.print("Elija el tipo de jugador: ");
				int i =1;
				for (PlayerType tipo :jugadores) {
					System.out.print(" (" + i++ + ")" + tipo.name());
				}
				System.out.println(":");

				int tipo = Integer.parseInt(teclado.nextLine());
				if (tipo >=1 && tipo < jugadores.size()) {
					ordenJugadores[numJugadores++]= jugadores.get(tipo-1);
					jugadores.remove(tipo-1);
				}else {
					System.out.println("Tipo no permitido. Inténtelo de nuevo");
				}
		
				
			}
			ordenJugadores[numJugadores] = jugadores.get(0);
			Juego juego = new Juego(ordenJugadores);	
			
			System.out.println(juego);
			System.out.println(juego.imprimeNombreJugadores());
			System.out.println(juego.imprimeNombreJugadores());
			while (!juego.isTerminado()) {
				/*********************
				 * Dado. Hay que revisarlo
				 */
				juego.setDado();
				// Muestra la información
				//System.out.println(juego.setInformacion());
				System.out.println("Le toca al jugador " + juego.getNombreJugadorQueJuega() + ". El dado saca " + juego.getValorDado() + " movimientos");
				for (int i = 0; i < juego.getValorDado() && !juego.isTerminado(); i++) {
					
					char direccion;
					do {
						System.out.println("Indique a donde desea moverse: N: Norte, S: Sur, E: Este u O: Oeste");
						direccion = teclado.nextLine().charAt(0);
					}while (direccion != 'N' && direccion != 'S' && direccion != 'E' && direccion != 'O');
					
					System.out.println(juego.movePlayer(direccion));
					
					
					System.out.println(juego);
					System.out.println(juego.imprimeNombreJugadores());

				}
				juego.proximoJugador();
			}
		
		System.out.println("Juego terminado. El ganador es:" + juego.getGanador());

						
		}catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
				
	

	}

}

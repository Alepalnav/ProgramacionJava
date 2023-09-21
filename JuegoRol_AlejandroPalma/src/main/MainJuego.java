package main;

import static logicaJuego.Constantes.NUM_JUGADORES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import elementos.JugadorException;
import elementos.PlayerType;
import logicaJuego.Constantes;
import logicaJuego.Juego;
import logicaJuego.JuegoException;



/**
 * Clase principal para jugar en modo consola 
 */
public class MainJuego {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws JugadorException {
		
		try {
			
			Juego juego = new Juego(cargarJugadores());	
			mostrarResumen(juego);
			
			while (!juego.isTerminado()) {
				jugar(juego);
			}
		
			System.out.println(
					String.format("Juego terminado. El ganador es: %s", juego.getGanador()));

						
		}catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
				
	

	}

	private static String mostrarResumen(Juego juego) {
		return Arrays.asList(juego.toString(), 
				juego.imprimeNombreJugadores(), 
				juego.imprimeValoresJugadores()).toString();
	}

	private static void jugar(Juego juego) throws JuegoException, JugadorException {
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
			
			System.out.println(juego.moverJugador(direccion));
			
			
			System.out.println(juego);
			System.out.println(juego.imprimeValoresJugadores());

		}
		juego.proximoJugador();
	}

	
	//cambiar modificadores para tests
	protected static PlayerType[] cargarJugadores() {
		
		List<PlayerType> jugadores = new ArrayList<>(Arrays.asList(
				PlayerType.ELFO, 
				PlayerType.GUERRERO, 
				PlayerType.MAGO,
				PlayerType.OGRO)
			);
		PlayerType[] ordenJugadores = new PlayerType[NUM_JUGADORES];

		/**
		 * Hay que elegir qué jugador va a ser cada uno, pero no se permiten jugadores repetidos
		 */
		int numJugadores =0;
		
		while (numJugadores < Constantes.NUM_JUGADORES - 1 ) {
			
			System.out.print("Elija el tipo de jugador: ");
			System.out.println(mostrarTipoJugadoresDisponibles(jugadores));

			int tipo = Integer.parseInt(teclado.nextLine());
			
			if (tipo >=1 && tipo < jugadores.size()) {
				ordenJugadores[numJugadores++]= jugadores.get(tipo-1);
				jugadores.remove(tipo-1);
			}else {
				System.out.println("Tipo no permitido. Inténtelo de nuevo");
			}
		}
		ordenJugadores[numJugadores] = jugadores.get(0);
		return ordenJugadores;
	}

	private static String mostrarTipoJugadoresDisponibles(List<PlayerType> jugadores) {
		StringBuilder sb = new StringBuilder();

		int i=1;
		for (PlayerType tipo :jugadores) {
			sb.append(" (" ).append(i++).append( ")" ).append(tipo.name());
		}
		sb.append(":");
		return sb.toString();
	}

}

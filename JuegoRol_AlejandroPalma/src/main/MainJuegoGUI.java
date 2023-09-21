package main;

import java.util.ArrayList;
import java.util.Scanner;

import elementos.PlayerType;
import logicaJuego.Constantes;
import logicaJuego.JuegoException;
import logicaJuego.JuegoGUI;

public class MainJuegoGUI extends MainJuego{
	
	public static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {

try {
			
			ArrayList<PlayerType> jugadores = new ArrayList<>();
			jugadores.add(PlayerType.ELFO);
			jugadores.add(PlayerType.GUERRERO);
			jugadores.add(PlayerType.MAGO);
			jugadores.add(PlayerType.OGRO);
			
			PlayerType[] ordenJugadores = new PlayerType[Constantes.NUM_JUGADORES];
			
			
			int numJugadores =0;
			while (numJugadores < Constantes.NUM_JUGADORES - 1 ) {
				System.out.print("Elija el tipo de jugador: ");
				int i =1;
				for (PlayerType tipo :jugadores) {
					System.out.print(" (" + i++ + ")" + tipo.name());
				}
				System.out.println(":");

				int tipo = Integer.parseInt(teclado.nextLine());
				if (tipo >=1 && tipo <= jugadores.size()) {
					ordenJugadores[numJugadores++]= jugadores.get(tipo-1);
					jugadores.remove(tipo-1);
				}else {
					System.out.println("Tipo no permitido. Inténtelo de nuevo");
				}
				
			}
			ordenJugadores[numJugadores] = jugadores.get(0);
			JuegoGUI juego = new JuegoGUI(ordenJugadores);	
						
		}catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	

	}

}

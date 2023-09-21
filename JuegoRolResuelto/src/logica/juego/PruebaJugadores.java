package logica.juego;

import elementos.Jugador;
import elementos.PlayerType;

public class PruebaJugadores {
	public static void main(String[] args) {
	
	//Jugador jugador1 = new Jugador(Constantes.ELFO);
	Juego juego1 = new Juego(PlayerType.values());
	//prueba para saber si se crean los jugadores
	System.out.println(juego1.imprimeNombreJugadores());
	System.out.println(juego1.imprimeValoresJugadores());
	
	System.out.println(juego1.getNombreJugadorQueJuega());//ELFO
	juego1.proximoJugador();//Cambia al jugador siguiente creado.
	System.out.println(juego1.getNombreJugadorQueJuega());//GUERRERO
    juego1.setDado();
    System.out.println(juego1.isTerminado());// tiene que devolver en este caso false.
    juego1.proximoJugador();
    Jugador j1 = new Jugador(PlayerType.ELFO);
   // j1.encuentraDinero();
    //j1.encuentraGema();
   // j1.encuentraPocion();
    System.out.println(j1.resumen());
    juego1.getGanador();
}
}

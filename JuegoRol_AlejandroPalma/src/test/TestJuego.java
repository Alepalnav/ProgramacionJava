package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import elementos.PlayerType;
import logicaJuego.Juego;

class TestJuego {

	@Test
	void testImprimeNombresJugadores() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		assertEquals("El tipo del jugador es: ELFO y es el jugador numero: 1\n"
				+ "El tipo del jugador es: GUERRERO y es el jugador numero: 2\n"
				+ "El tipo del jugador es: MAGO y es el jugador numero: 3\n"
				+ "El tipo del jugador es: OGRO y es el jugador numero: 4\n", juego.imprimeNombreJugadores());
	}
	
	@Test
	void testImprimeValoresJugadores() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		assertEquals("Jugador numero: 1 Dinero: 0 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 2 Dinero: 0 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 3 Dinero: 0 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 4 Dinero: 0 Gemas: 0 Pociones: 0\n", juego.imprimeValoresJugadores());
	}
	
	@Test
	void testJugadorUltimaPosicion() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		juego.proximoJugador();
		juego.proximoJugador();
		juego.proximoJugador();
		
		assertEquals("OGRO", juego.getNombreJugadorQueJuega());
	}

}

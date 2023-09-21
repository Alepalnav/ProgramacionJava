package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import elementos.PlayerType;
import logica.juego.Constantes;
import logica.juego.Juego;

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
	/**
	 * Debe darnos mal por que el jugador 1 y el 3 son el mismo tipo, al dar mal y estar formulado con assertNotEquals, es correcto nuestro test.
	 */
	@Test
	void testImprimeNombresJugadoresMal() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		assertNotEquals("El tipo del jugador es: MAGO y es el jugador numero: 1\n"
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
	/**
	 * Pues nos debe de dar bien el test porque esta formulado con un assertNotEquals y los 
	 * personajes aparecen con 0 objetos no con 1 objetos gemas por ejemplo.
	 */
	@Test
	void testImprimeValoresJugadoresMal() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		assertNotEquals("Jugador numero: 1 Dinero: 1 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 2 Dinero: 1 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 3 Dinero: 1 Gemas: 0 Pociones: 0\n"
				+ "Jugador numero: 4 Dinero: 1 Gemas: 0 Pociones: 0\n", juego.imprimeValoresJugadores());
	}
/**
 * Nos dirá el ultimo jugador en crear que es OGRO.
 */
	@Test
	void testJugadorUltimaPosicion() {
		PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
		Juego juego = new Juego(jugadores);
		juego.proximoJugador();
		juego.proximoJugador();
		juego.proximoJugador();
		
		assertEquals("OGRO", juego.getNombreJugadorQueJuega());
	}
	/**
	 * Nos dirá el ultimo jugador en crear que es OGRO, al formularlo con un assertNotEquals, el test funcionará correctamente.
	 */
		@Test
		void testJugadorUltimaPosicionMal() {
			PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
			Juego juego = new Juego(jugadores);
			juego.proximoJugador();
			juego.proximoJugador();
			juego.proximoJugador();
			
			assertNotEquals("MAGO", juego.getNombreJugadorQueJuega());
		}
		
		@Test
		void testJugadorPrimeraPosicion() {
			PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
			Juego juego = new Juego(jugadores);
			
			
			assertEquals("ELFO", juego.getNombreJugadorQueJuega());
		}
		/**
		 * El test es correcto puesto que el primero es ELFO, no MAGO.
		 */
		@Test
		void testJugadorUltimaPrimeraPosicionMal() {
			PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
			Juego juego = new Juego(jugadores);
			juego.proximoJugador();
			
			
			assertNotEquals("MAGO", juego.getNombreJugadorQueJuega());
		}
		
		@Test
		void testValorDadoCorrecto() {
			PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
			Juego juego = new Juego(jugadores);	
				juego.setDado();
				assertTrue(juego.getValorDado()>=1 && juego.getValorDado()<=Constantes.ELFO_VELOCIDAD);
			
		}
		@Test
		void testDecrementacionDado() {
			PlayerType[] jugadores = {PlayerType.ELFO, PlayerType.GUERRERO, PlayerType.MAGO, PlayerType.OGRO};
			Juego juego = new Juego(jugadores);	
			juego.setDado();
			int dado = juego.getValorDado();
			juego.decrementaDado();
			assertEquals(dado-1, juego.getValorDado());
		}
		
		
}

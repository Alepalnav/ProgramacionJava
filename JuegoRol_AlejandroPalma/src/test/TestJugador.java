package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import elementos.Jugador;
import elementos.PlayerType;

class TestJugador {

	@Test
	public void testDeJugadorTieneObjetos() {
		Jugador jugador = new Jugador(PlayerType.MAGO);
		jugador.encuentraDinero();
		jugador.encuentraGema();
		jugador.encuentraPocion();
		assertTrue(jugador.getDinero()==1 && jugador.getGemas()==1 && jugador.getPociones()==1 &&
				jugador.getNombre().equalsIgnoreCase("MAGO"));
	}

}

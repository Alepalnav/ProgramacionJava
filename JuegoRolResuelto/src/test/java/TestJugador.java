package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import elementos.Jugador;
import elementos.JugadorException;
import elementos.PlayerType;

public class TestJugador {

	
	
	@Test
	public void testDeJugadorTieneObjetos() {
		Jugador jugador = new Jugador(PlayerType.MAGO);
		jugador.encuentraDinero();
		jugador.encuentraGema();
		jugador.encuentraPocion();
		assertTrue(jugador.getDinero()==1 && jugador.getGemas()==1 && jugador.getPociones()==1 &&
				jugador.getNombre().equalsIgnoreCase("MAGO"));
	}
	@Test
	public void testDeJugadorNoTieneObjetos() {
		Jugador jugador = new Jugador(PlayerType.MAGO);
		assertTrue(jugador.getDinero()==0 && jugador.getGemas()==0 && jugador.getPociones()==0 &&
				jugador.getNombre().equalsIgnoreCase("MAGO"));
	}
	
	@Test
	public void testResumenJugador() {
		Jugador jugador = new Jugador(PlayerType.GUERRERO);
		jugador.encuentraDinero();
		jugador.encuentraGema();
		jugador.encuentraPocion();
		assertEquals("Nombre: GUERRERO Gemas: 1 Dinero: 1 Pociones: 1", jugador.resumen());
	}
	@Test
	public void testResumenJugadorSinObjetos() {
		Jugador jugador = new Jugador(PlayerType.GUERRERO);
		assertEquals("Nombre: GUERRERO Gemas: 0 Dinero: 0 Pociones: 0", jugador.resumen());
	}
	/**
	 * No puede ser el dinero negativo.
	 */
	@Test
	public void testSetDineroIncorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		try {
			jugador.setDinero(-1000);
			fail("Dinero es negativo, debe saltar una excepcion.");
			assert(false);
		} catch (JugadorException e) {
			assert(true);
			System.out.println("Excepción: " + e.getMessage());
		}
	}
	/**
	 * debe dar correctamente, puesto que el dinero es mayor que 0.
	 */
	@Test
	public void testSetDineroCorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		jugador.setDinero(1);
		assertEquals(jugador.getDinero(), 1);
	}
	@Test
	public void testSetGemaCorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		jugador.setGemas(1);
		assertEquals(jugador.getGemas(), 1);
	}
	
	@Test
	public void testSetGemasIncorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		try {
			jugador.setGemas(-1000);
			fail("Gemas es negativo, debe saltar una excepcion.");
			assert(false);
		} catch (JugadorException e) {
			assert(true);
			System.out.println("Excepción: " + e.getMessage());
		}
	}
	@Test
	public void testSetPocionCorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		jugador.setPociones(1);
		assertEquals(jugador.getPociones(), 1);
	}
	@Test
	public void testSetPocionesIncorrecto() {
		Jugador jugador = new Jugador(PlayerType.ELFO);
		try {
			jugador.setPociones(-1000);
			fail("Gemas es negativo, debe saltar una excepcion.");
			assert(false);
		} catch (JugadorException e) {
			assert(true);
			System.out.println("Excepción: " + e.getMessage());
		}
	}
	
}

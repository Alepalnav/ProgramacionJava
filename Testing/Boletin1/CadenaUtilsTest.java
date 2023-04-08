package Testing.Boletin1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTest {
	CadenaUtils c = new CadenaUtils();

	@Test
	void testToMayusculas() {
		assertEquals("HOLA",c.toMayusculas("hola"));
	}
	
	@Test
	void testToMinusculas() {
		assertEquals("hola",c.toMinusculas("HOLA"));
	}
	
	@Test
	void testEstaEnMinusculas() {
		assertTrue(c.estaEnMinusculas("hola"));
	}
	
	@Test
	void testEstaEnMayusculas() {
		assertTrue(c.estaEnMayusculas("HOLA"));
	}

	@Test
	void testEsCapicua() {
		assertTrue(c.esCapicua("3223"));
	}
	
	@Test
	void testEsPalindromo() {
		assertTrue(c.esCapicua("hjh"));
	}
}

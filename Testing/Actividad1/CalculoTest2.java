package Testing.Actividad1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoTest2 {
	Calculo c = new Calculo();

	@Test
	void testSuma() {
		assertEquals(2, c.suma(2, 2));
		assert(c.suma(2, 2)==4);
	}
	
	@Test
	void testSuma2() {
		assertEquals(c.suma(2, 2), 2);
	}

}

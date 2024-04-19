package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatrice {

	@Test
	void testSomme() {
		Calculatrice c = new Calculatrice();
		assertEquals(5,c.somme(2, 3));
	}

	@Test
	void testProduit() {
		Calculatrice c = new Calculatrice();
		assertEquals(6,c.produit(2, 3));
	}
}

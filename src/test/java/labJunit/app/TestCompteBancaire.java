package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCompteBancaire {

    @Test
    public void testCrediter() {
        // Création d'un compte avec un solde initial de 1000
        CompteBancaire compte = new CompteBancaire(1000);

        // Créditer un montant positif
        compte.crediter(500);
        assertEquals(1500, compte.getSolde(), 0);

        // Créditer un montant négatif (ne devrait pas affecter le solde)
        compte.crediter(-200);
        assertEquals(1500, compte.getSolde(), 0);
    }

    @Test
    public void testDebiter() {
        // Création d'un compte avec un solde initial de 1000
        CompteBancaire compte = new CompteBancaire(1000);

        // Débiter un montant inférieur ou égal au solde
        compte.debiter(500);
        assertEquals(500, compte.getSolde(), 0);

        // Débiter un montant supérieur au solde (ne devrait pas affecter le solde)
        compte.debiter(1000);
        assertEquals(500, compte.getSolde(), 0);

        // Débiter un montant négatif (ne devrait pas affecter le solde)
        compte.debiter(-200);
        assertEquals(500, compte.getSolde(), 0);
    }
}
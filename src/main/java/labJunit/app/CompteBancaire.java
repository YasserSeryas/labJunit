package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void crediter(double montant) {
        if (montant > 0) { // Vérifier si le montant crédité est positif
            solde += montant;
            System.out.println("Montant crédité : " + montant);
            System.out.println("Nouveau solde : " + solde);
        } else {
            System.out.println("Montant à créditer doit être positif.");
        }
    }

    public void debiter(double montant) {
        if (montant > 0) { // Vérifier si le montant débité est positif
            if (montant <= solde) {
                solde -= montant;
                System.out.println("Montant débité : " + montant);
                System.out.println("Nouveau solde : " + solde);
            } else {
                System.out.println("Solde insuffisant pour effectuer cette opération.");
            }
        } else {
            System.out.println("Montant à débiter doit être positif.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : " + solde);
    }

    public static void main(String[] args) {
        CompteBancaire monCompte = new CompteBancaire(1000);

        monCompte.crediter(300);

        monCompte.debiter(400);

        monCompte.afficherSolde();
    }
}

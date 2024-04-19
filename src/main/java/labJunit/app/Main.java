package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		
		double s = c.somme(10, 20);
		System.out.println("La somme de 10 et 20 : "+s);
		
		double p = c.produit(10, 20);
		System.out.println("Le produit de 10 et 20 : "+p);

	}

}

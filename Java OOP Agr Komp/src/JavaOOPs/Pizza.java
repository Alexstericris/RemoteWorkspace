package JavaOOPs;

public class Pizza {

	private double preisKlein;
	private double preisGross;
	private Pizzasorte pizzasorte;

	public void setPreisKlein(double PREISKLEIN) {
		preisKlein = PREISKLEIN;
		System.out.println("Neue Preis klein " + PREISKLEIN);
	}

	public double getPreisKlein() {
		return preisKlein;
	}
	public void setPreisGross(double PREISGROSS) {
		preisGross = PREISGROSS;
		System.out.println("Neue Preis Groﬂ " + PREISGROSS);
	}
	public double getPreisGross() {
		return preisGross;
	}
}

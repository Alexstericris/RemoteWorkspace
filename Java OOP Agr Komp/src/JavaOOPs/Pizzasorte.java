package JavaOOPs;

public class Pizzasorte extends Pizza {

	private String sorte;
	
	public Pizzasorte(String Sorte) {
		this.sorte=Sorte;
		
	}
	
	public void setSorte(String Sorte) {
		this.sorte=Sorte;
		System.out.println("Sorte geändert zu "+Sorte);
	}
	public String getSorte() {
		return sorte;
	}

	public String toString() {
		return "Pizzasorte = " + sorte;
	}
}

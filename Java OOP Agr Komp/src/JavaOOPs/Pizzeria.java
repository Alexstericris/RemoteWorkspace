package JavaOOPs;

import java.util.ArrayList;

public class Pizzeria {

	private String name;
	private String adresse;
	private Pizzasorte pizza;
	private ArrayList<Pizzasorte> pizzen;
	
	public Pizzeria(String Name,String Adresse,ArrayList<Pizzasorte> Pizzen) {
		this.name=Name;
		this.adresse=Adresse;
		pizzen=Pizzen;
		
		
	}
	public void addPizzen(Pizzasorte PSORTE) {
		pizzen.add(PSORTE);
	}
	public void pizzenZeigen(ArrayList<Pizzasorte> pizzen) {
		for(Pizzasorte i:pizzen) {
			System.out.println(i);
		}
	}

	
}

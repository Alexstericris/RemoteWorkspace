package JavaOOPs;
import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
	ArrayList<Pizzasorte> pslist=new ArrayList<Pizzasorte>();
	
	Pizzeria p1=new Pizzeria("guisto","Am gurken",pslist);
	//ma nugu
	//gude
	Pizzasorte ps1=new Pizzasorte("Margherita");
	p1.addPizzen(ps1);
	Pizzasorte ps2=new Pizzasorte("Salami");
	p1.addPizzen(ps2);
	Pizzasorte ps3=new Pizzasorte("Schinken");
	p1.addPizzen(ps3);

	p1.pizzenZeigen(pslist);
	
	ps3.setPreisGross(20.0);
	ps2.setPreisGross(15.00);
	System.out.println(ps2+" Preis Gross = "+ps2.getPreisGross());
	System.out.println(ps3.getPreisGross());

	}
}


public class Bankautomat {

	public static void main(String[] args) {

		Kunde kunde1 = new Kunde("Heinz", 123, 100);
		System.out.println(kunde1);
		Kunde kunde2 = new Kunde("Franz", 122, 1111);
		System.out.println(kunde2);
		System.out.println(kunde2.count);
		kunde1.überweisen(kunde2, 100);
		System.out.println("Dein neuer Kontostand ist: " + kunde2.getKontostand());
		System.out.println("Dein neuer Kontostand ist: " + kunde1.getKontostand());
		kunde2.geldAbheben();
		System.out.println("Dein neuer Kontostand ist: " + kunde2.getKontostand());
	}
}

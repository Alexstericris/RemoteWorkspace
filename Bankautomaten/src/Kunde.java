import java.util.Scanner;

public class Kunde {
	private String name;
	public static int count = 0;
	private int kontonummer;
	private int kontostand;
	private int limit;
	public Scanner sc = new Scanner(System.in);

	public int getCount(int count) {
		return count;
	}

	public Kunde(String name, int kontonummer, int kontostand) {
		this.name = name;
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		count++;

	}

	public String toString() {
		return "Kunde [name=" + name + ", kontonummer=" + kontonummer + ", kontostand=" + kontostand + ", limit="
				+ limit + ",count=" + count + "]";
	}

	public void geldAbheben() {
		System.out.println("Wv Geld Abheben?");
		int abziehen = sc.nextInt();
		if (kontostand < abziehen) {
			System.out.println("Du verlangst mehr als dein Guthaben. \nWillst du dein Konto überziehen?\n");
			if (sc.next().equalsIgnoreCase("J")) {
				kontostand -= abziehen;
			} else {
				geldAbheben();
			}
		} else {
			kontostand-=abziehen;
		}
	}

	public void einzahlen(double einzahlen) {
		kontostand+=einzahlen;
	}
	
	public void überweisen(Kunde Kunde,double überweisen) {
		Kunde.kontostand+=überweisen;
		kontostand-=überweisen;
	}
	
	
	public int getKontonummer() {
		return kontonummer;
	}

	public int getKontostand() {
		return kontostand;
	}
}

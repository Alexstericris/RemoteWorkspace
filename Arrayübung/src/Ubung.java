
import java.util.*;

public class Ubung {
	public static void main(String[] args) {
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		int[] zahlen = new int[49];
		int random;
		int random2;
		int meinzahl;
		int count = 0;
		int m;
		int ausgegeben[] = new int[6];

		for (int j = 0; j < zahlen.length; j++) {
			zahlen[j] = 0;
		}
		for (int i = 0; i < 6; i++) {
			random = (int) (Math.random() * 49);
			if (zahlen[random] == 1) {
				random2 = (int) (Math.random() * 49);
				while (random == random2) {
					random2 = (int) (Math.random() * 49);
				}
				zahlen[random2] = 1;
			} else
				zahlen[random] = 1;
		}
		System.out.println("Wähle 6 Zahlen zwischen 1 und 49 ");
		int x = 0;
		for (m = 0; m < zahlen.length; m++) {
			if (zahlen[m] == 1) {
				meinzahl = sc.nextInt();
				while(meinzahl<1||meinzahl>49) {
					System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
					meinzahl = sc.nextInt();
				}
				System.out.println(meinzahl);
				if (meinzahl == m + 1) {
					count++;
				}
				if (x < 6) {
					ausgegeben[x] = m + 1;
					x++;
				}
			}
		}

		System.out.println("Du hast " + count + " Zahlen erwischt");
		Arrays.sort(ausgegeben);
		for (int i = 0; i < 6; i++) {
			System.out.print(ausgegeben[i]+" ");
		}

	}
}

import java.util.*;

import sun.applet.Main;

public class patru {

	public static Scanner sc = new Scanner(System.in);

	public static int[] feld = new int[9];

	public static int count = 0;

	public static boolean turn(int count) {
		if (count % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void feldUpdate(int[] feld) {
		int zahl = sc.nextInt();
		while (zahl < 1 || zahl > 9) {
			System.out.println("Deine Zahl ist Falsch! Nimm eine Zahl zwischen 1-9");
			zahl = sc.nextInt();
		}
		if (turn(count) == false) {
			while (feld[zahl - 1] > 0) {
				System.out.println("Feld ist belegt! W‰hle ein anderen.");
				zahl = sc.nextInt();
			}
			feld[zahl - 1] = 1;
		} else {
			while (feld[zahl - 1] > 0) {
				System.out.println("Feld ist belegt! W‰hle ein anderen.");
				zahl = sc.nextInt();
			}
			feld[zahl - 1] = 2;
		}
		for (int i = 0; i < 9; i++) {
			if (feld[i] == 0) {
				System.out.print("|___|");
			} else {
				if (feld[i] == 1) {
					System.out.print("|_X_|");
				} else {
					if (feld[i] == 2)
						System.out.print("|_O_|");
				}
			}
			if (i == 2 || i == 5 || i == 8) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		String antwort = "j";
		while (antwort.equalsIgnoreCase("j")) {
			for (int i = 0; i < feld.length; i++) {
				feld[i] = 0;
			}
			for (count = 2; count < 11; count++) {
				turn(count);
				if (turn(count) == false) {
					System.out.println("X ist dran");
				} else {
					System.out.println("O ist dran");
				}
				System.out.println("W‰hle ein Feld zwischen 1-9 wo du dein Zeichen setzen willst");

				feldUpdate(feld);
				if (count > 3) {
					if ( // Zeilen
					feld[0] == 2 && feld[1] == 2 && feld[2] == 2 || feld[3] == 2 && feld[4] == 2 && feld[5] == 2
							|| feld[6] == 2 && feld[7] == 2 && feld[8] == 2
							// Schr‰g
							|| feld[0] == 2 && feld[4] == 2 && feld[8] == 2
							|| feld[2] == 2 && feld[4] == 2 && feld[6] == 2
							// Spalten
							|| feld[0] == 2 && feld[3] == 2 && feld[6] == 2
							|| feld[1] == 2 && feld[4] == 2 && feld[7] == 2
							|| feld[2] == 2 && feld[5] == 2 && feld[8] == 2) {
						System.out.println("O hat gewonnen");
						break;
					} else {
						if ( // Zeilen
						feld[0] == 1 && feld[1] == 1 && feld[2] == 1 || feld[3] == 1 && feld[4] == 1 && feld[5] == 1
								|| feld[6] == 1 && feld[7] == 1 && feld[8] == 1
								// Schr‰g
								|| feld[0] == 1 && feld[4] == 1 && feld[8] == 1
								|| feld[2] == 1 && feld[4] == 1 && feld[6] == 1
								// Spalten
								|| feld[0] == 1 && feld[3] == 1 && feld[6] == 1
								|| feld[1] == 1 && feld[4] == 1 && feld[7] == 1
								|| feld[2] == 1 && feld[5] == 1 && feld[8] == 1) {
							System.out.println("X hat gewonnen");
							break;
						}
					}

				}
			}

			System.out.println("Willst du nochmal spielen? J oder N ?");
			antwort = sc.next();
		}
		System.out.println("OK :(.Hoffe du hattest Spaﬂ.");
		System.exit(0);
	}
}

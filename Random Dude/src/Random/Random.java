package Random;

import java.util.*;

public class Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int[] Lotteriezahlen= new int[50]; int[] Gluckszahlen= new int[6];
		 * Lotteriezahlen[1]=sc.nextInt(); System.out.println(Lotteriezahlen[1]);
		 */

		int w, x, y, z, v;
		w = (int) (Math.random() * 49) + 1;
		x = (int) (Math.random() * 49) + 1;
		y = (int) (Math.random() * 49) + 1;
		z = (int) (Math.random() * 49) + 1;
		v = (int) (Math.random() * 49) + 1;
		while (w == x || w == y || w == z || w == v || y == z || y == v || y == x || x == z || x == v || z == v) {
			w = (int) (Math.random() * 49) + 1;
			x = (int) (Math.random() * 49) + 1;
			y = (int) (Math.random() * 49) + 1;
			z = (int) (Math.random() * 49) + 1;
			v = (int) (Math.random() * 49) + 1;
		    
		}
		System.out.println("Gib 5 verschiedene Zahlen zwischen 1 und 49 an");
		int a = sc.nextInt();
	
		while (a < 1 || a > 49) {
			System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
			a = sc.nextInt();
		}

		int b = sc.nextInt();
		while (b < 1 || b > 49) {
			System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
			b = sc.nextInt();
		}
		while (a == b) {
			System.out.println("Die Zahl hast du schon genommen, nimm eine andere");
			b = sc.nextInt();
		}
		int c = sc.nextInt();
		while (c < 1 || c > 49) {
			System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
			c = sc.nextInt();
		}
		while (c == a || c == b) {
			System.out.println("Die Zahl hast du schon genommen, nimm eine andere");
			c = sc.nextInt();
		}
		int d = sc.nextInt();
		while (d < 1 || d > 49) {
			System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
			d = sc.nextInt();
		}
		while (d == a || d == b || d == c) {
			System.out.println("Die Zahl hast du schon genommen, nimm eine andere");
			d = sc.nextInt();
		}
		int e = sc.nextInt();
		while (e < 1 || e > 49) {
			System.out.println("Du hast eine zu hohe Zahl genommen.\nNimm bitte eine Zahl zwischen 1 und 49\n");
			e = sc.nextInt();
		}
		while (e == a || e == b || e == c || e == d) {
			System.out.println("Die Zahl hast du schon genommen, nimm eine andere");
			e = sc.nextInt();
		}
	  System.out.println(w + " " + x + " " + y + " " + z + " " + v);
	  
	  int count = 0;
		if (w == a || w == b || w == c || w == d || w == e || x == a || x == b || x == c || x == d || x == e || y == a
				|| y == b || y == c || y == d || y == e || z == a || z == b || z == c || z == d || z == e || v == a
				|| v == b || v == c || v == d || v == e) {
			if (w == a || w == b || w == c || w == d || w == e) {
				count++;
			}	
			if (x == a || x == b || x == c || x == d || x == e) {
				count++;
			}
			if (y == a || y == b || y == c || y == d || y == e) {
				count++;
			}
			if (z == a || z == b || z == c || z == d || z == e) {
				count++;
			}
			if (v == a || v == b || v == c || v == d || v == e) {
				count++;
			}

			if (count == 1) {
				System.out.println("Du hast " + count + " Zahl erwischt");
			} else {
				System.out.println("Du hast " + count + " Zahlen erwischt");
			}
			if (count > 0 && count < 5) {
				System.out.println("Du hast nicht alle Zahlen, du hast verloren");
			}
		}
		if (count == 0) {
			System.out.println("Du hast keine Zahlen erwischt, du hast verloren");
		}
		if (count == 5) {
			System.out.println("Du bist Millionär!!!");
		}	
	do {
		w=(int)(Math.random()*49)+1;
		System.out.print(w+ " ");
	}while(a!=w); 
	System.out.println();
	do {
		x=(int)(Math.random()*49)+1;
	    System.out.print(x+" ");
	}while(b!=x);
	System.out.println();
	do {
		y=(int)(Math.random()*49)+1;
	    System.out.print(y+" ");
	}while(c!=y);
	System.out.println();
	do {
		z=(int)(Math.random()*49)+1;
	    System.out.print(z+" ");
	}while(d!=z);
	System.out.println();
	do {
		v=(int)(Math.random()*49)+1;
	    System.out.print(v+" ");
	}while(e!=v);
	}
}

package hello;

import java.util.*;

public class hello {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); double a=sc.nextDouble(); double
		 * b=sc.nextDouble(); double s= (a*Math.pow(b,2))/2; System.out.println(s);
		 */
		// sort ohne arrays
		/*
		 * int x=5, y=3,z=1; if(x<y&&x>z) { System.out.println(x); if(y<z) {
		 * System.out.println(y); System.out.println(z); }else { System.out.println(z);
		 * System.out.println(y); } } if(y<x&&y<z) { System.out.println(y); if(x<z) {
		 * System.out.println(x); System.out.println(z); }else { System.out.println(z);
		 * System.out.println(x); } } if(z<x||z<y) { System.out.println(z); if(x<y) {
		 * System.out.println(x); System.out.println(y); }else { System.out.println(y);
		 * System.out.println(x); } }
		 */
		/*
		 * for (int x = 5; x < 31; x++) { if (x % 2 != 0) { System.out.println(x +
		 * " ist ungerade."); } else { System.out.println(x + " ist gerade."); } }
		 */
		/*
		 * Sort ohne Arrays
		 * 
		 * int x=5,y=3,z=1; for(int i=0;i<10;i++) { if(x==i) System.out.println(x);
		 * if(y==i) System.out.println(y); if(z==i) System.out.println(z); }
		 */
		/*
		 * int a=1,b=2,c=3; if(++a>b++||a-->0) { c++; }else c--;
		 * System.out.println(a+" "+b+" "+c);
		 */
		/*
		 * int fac=0; for(int i=0;i<10;i++) { fac+=i; System.out.println(fac); }
		 */
		/*
		 * for(int i=0;i<10;i++) { for(int j=0;j<10;j++) { if(i<10) {
		 * System.out.print(j+i*10+" |");} } System.out.println();
		 * System.out.println("----------------------------");
		 */

		// Aufgabe 2
		/*
		 * Scanner sc=new Scanner(System.in); int jahr=sc.nextInt();
		 * if(jahr%4!=0||jahr%100==0) { if(jahr%400!=0) {
		 * System.out.println("Das jahr "+jahr+" ist kein Schaltjahr"); } else {
		 * System.out.println("Das jahr "+jahr+" ist ein Schaltjahr"); } }else {
		 * System.out.println("Das jahr "+jahr+" ist ein Schaltjahr"); }
		 * 
		 */ // String �bung
		/*
		 * String moin="moin man"; moin.charAt(1); System.out.println(moin.charAt(0+1));
		 */
		// methoden �bung
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Geben Sie ein Zahl ein"); double x= sc.nextDouble();
		 * System.out.println("Geben sie eine Potenz ein"); double y= sc.nextDouble();
		 * hoch(x,y); } public static void hoch(double x,double y) { x= Math.pow(x,y);
		 * System.out.println(x); }
		 */
		/*
		 * int x=3; int y=7; gude(x,y); } public static void gude(int x, int y) { int
		 * sum=0; for(int i=x;i<=y;i++) { sum=sum+i; if(i ==y) {
		 * System.out.println(sum); } }
		 */

		// Tabelle
		/*
		 * int x = 0; int y = 0; for (int i = 0; i < 10; i++) { if (y==i&&y>0) {
		 * System.out.print(y+ " "); }else { System.out.print(" "); } y++; for (int j =
		 * 0; j < 10; j++) { x++; if(x<11) { System.out.print(x+" "); }else {
		 * System.out.print(" "); }
		 * 
		 * 
		 * } System.out.println(); }
		 */
		// Fibonaci Zahl :(
		/*
		 * Scanner sc=new Scanner(System.in); int fib=0; int zahl=sc.nextInt(); int
		 * zahl2=0; for(int i=0;i<12;i++) { fib=zahl+zahl2; zahl2=zahl; zahl=fib;
		 * System.out.print(fib+ " "); }
		 */
		/*
		 * Scanner sc=new Scanner(System.in); int anzahl=sc.nextInt(); int sum=0;
		 * for(int i=0; i<anzahl;i++) { int x=sc.nextInt(); sum+=x;
		 * System.out.print(sum+" "); }
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("wie viele randomzahlen willschte");
		int x = sc.nextInt();
		int[] y = new int[x];
		for (int i = 0; i < y.length; i++) {
			y[i] = (int) (Math.random() * 49);
			if (i == y.length - 1) {

				Arrays.sort(y);
				for (int j = 0; j < y.length; j++) {
					System.out.print(y[j] + " ");
				}
			}
		}
	}*///
 
}
import java.util.*;
public class Geldautomat {
   public static void main(String[]args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Geben Sie bitte ihrem Betrag an");
	   double kontostand=500;
	   double abheben= sc.nextDouble();
       double zinsensatz=1.1;
	   System.out.println("Sind sie sicher, dass sie "+abheben+"� abheben wollen?");
       if(kontostand>=abheben) {
    	   kontostand-=abheben;
    	   String confirmation=sc.next();
    	   if(confirmation.equalsIgnoreCase("ja")) {
    		   System.out.println("Sie haben "+abheben+" � abgehoben. \nSie haben noch  "+kontostand+" � auf ihrem Konto \n" );
    	   }
    	   else {
    		  if(confirmation.equalsIgnoreCase("nein")||confirmation.equalsIgnoreCase("no")) {
    			  System.out.println("Sie haben nichts abgehoben");
    		 
    		  }
    	   }
	   }
       else {
    	   abheben-=kontostand;
    	   System.out.println("Sie wollen zu viel geld abheben.\n Sie w�rden mit "+abheben+"� ihr Konto �berziehen. \n\n Wollen Sie ihr Konto �berziehen?\n");
    	   System.out.println("Zinsensatz liegt actuell bei 10%");
    	   boolean x;
    	   String confirmation=sc.next();
    	   if(confirmation.equalsIgnoreCase("ja")) { 
    		   x=true;
    	   if(x==true) {
    		   double �berziehung= abheben*zinsensatz;
    		   double zusatz=�berziehung-abheben;
    		   System.out.println("Du hast dein Konto �berzogen.\nDein jetziger Kontostand ist bei -"+abheben+"\n\n In eine Woche musst du "+zusatz+"� abgeben.\n Sonst wird der Betrag pro Woche um 0.5% erh�ht");
    	   }
    	   }
    	   else {
    		   System.out.println("Du hast dein Konto nicht �berzogen");
    	   }
       }
   }
}

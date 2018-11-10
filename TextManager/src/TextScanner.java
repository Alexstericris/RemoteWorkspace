import java.io.*;
import java.util.*;

public class TextScanner {

	private Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("textBeispiel.txt"));
		}
		catch(Exception e){
		    System.out.println("could not find file");	
		}
	}
	
	public void readFile() {
		while(sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			
			System.out.printf("%s %s %s\n", a,b,c);
		}
	}
	
	public void closeFile() {
		sc.close();
	}
	
}

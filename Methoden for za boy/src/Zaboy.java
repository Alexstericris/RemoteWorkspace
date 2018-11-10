import java.util.*;

public class Zaboy {
	
	public Scanner sc=new Scanner(System.in);
	public String name;
    public double grosse;
    public int alter;
    
    public Zaboy() {
    	this.grosse=1.50;
    	this.alter=10;
    	
    }
    
    public String setName(String name) {
        System.out.println("gib name ein");
    	name=sc.next();
    	return name;
    }
    public void getName(String name) {
    	System.out.println("Name= "+name);
    }
    public double getGrosse(double grosse) {
    	return grosse;
    }
    public int getAlter(int alter) {
    	return alter;
    }
 
}

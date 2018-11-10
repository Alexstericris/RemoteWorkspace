import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TextManagerMain {
	public static void main(String[] args) {
		
		TextManagerGUI GUI=new TextManagerGUI();
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		/*int choice = JOptionPane.showConfirmDialog(null,"Willst du dat?");
		if(choice==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null,"Oki boy");
		}
		if (choice==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Oh, Schade");
		}*/
		
		/*File file=new File("C:\\Users\\Marius\\eclipse\\java-oxygen\\eclipse\\Workspace\\TextManager\\src\\textBeispiel.txt");
		
		try {
			
			Scanner sc=new Scanner(file);
			String erstesWort=sc.next();
			String zweitesWort=sc.next();
			String drittesWort=sc.next();
		
			
			System.out.printf("1: %s \n", erstesWort);
			System.out.printf("2: %s \n", zweitesWort);
			System.out.printf("3: %s \n", drittesWort);
			
			sc.close();
		}catch(IOException ex) {
			System.out.printf("Error: %s\n",ex);
		}*/
/*
		TextScanner textScan = new TextScanner();
		textScan.openFile();
		textScan.readFile();
		textScan.closeFile();
		
		
	*/	
	}
}

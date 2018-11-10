package learngui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class clacla extends JFrame {
	
	private JTextField name;
	private JTextField dieFrage;
	private JTextField dieAntwort;
	private JPasswordField passwordf1;
	private JPasswordField passwordf2;
	private JLabel item1;

	
	public clacla() {

		super("Ma Titel");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is bruh");
	    item1.setToolTipText("this hovers over bruh"); add(item1);
		
		name=new JTextField(15);
		add(name);
		
		dieFrage=new JTextField("Who's yar mama?");
		dieFrage.setEditable(false);
		add(dieFrage);
		
		dieAntwort=new JTextField("Gib die Antwort ein!");
		add(dieAntwort);
		
		passwordf1=new JPasswordField(10);
		add(passwordf1);
		
		passwordf2= new JPasswordField(10);
		add(passwordf2);
		
		theHandler handler=new theHandler();
		name.addActionListener(handler);
		dieFrage.addActionListener(handler);
		dieAntwort.addActionListener(handler);
		passwordf1.addActionListener(handler);
		passwordf2.addActionListener(handler);
	}
	
	private class theHandler implements ActionListener{
		

		public void actionPerformed(ActionEvent event) {
			String string="";
			
			if(event.getSource()==name)
				string=String.format("Name: %s",event.getActionCommand());
			if(event.getSource()==dieFrage)
				string=String.format("Frage: %s", event);
			if(event.getSource()==dieAntwort)
				string=String.format("Antwort: %s", event.getActionCommand());
			if(event.getSource()==passwordf1)
				string=String.format("Pass1: %s", event.getActionCommand());
			if(event.getSource()==passwordf2)
				string=String.format("Pass2: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
			
		}
	}
	/*
	 * private JLabel item1;
	 * 
	 * public clacla() { super("The title"); setLayout(new FlowLayout());
	 * 
	 * item1 = new JLabel("this is bruh");
	 * item1.setToolTipText("this hovers over bruh"); add(item1); }
	 */
	/*
	 * private JTextField item1; private JTextField item2; private JTextField item3;
	 * 
	 * private JPasswordField passwordField;
	 * 
	 * 
	 * public clacla() {
	 * 
	 * super("Ther Tetel"); setLayout(new FlowLayout());
	 * 
	 * item1 = new JTextField(10); add(item1);
	 * 
	 * item2 = new JTextField("Enter text here"); add(item2);
	 * 
	 * item3 = new JTextField("uneditable", 20); item3.setEditable(false);
	 * 
	 * passwordField = new JPasswordField("Ma pass"); add(passwordField);
	 * 
	 * thehandler handler = new thehandler(); item1.addActionListener(handler);
	 * item2.addActionListener(handler); item3.addActionListener(handler);
	 * passwordField.addActionListener(handler); } private class thehandler
	 * implements ActionListener{
	 * 
	 * public void actionPerformed(ActionEvent event) {
	 * 
	 * String string="";
	 * 
	 * if(event.getSource()==item1) string=String.format("field 1: %s",
	 * event.getActionCommand()); else if(event.getSource()==item2)
	 * string=String.format("field 2: %s", event.getActionCommand()); else
	 * if(event.getSource()==item3) string=String.format("field 3: %s",
	 * event.getActionCommand()); else if(event.getSource()==passwordField)
	 * string=String.format("password field is: %s", event.getActionCommand());
	 * 
	 * JOptionPane.showMessageDialog(null, string); }
	 * 
	 * }
	 */

}

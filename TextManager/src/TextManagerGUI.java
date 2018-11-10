import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.*;

public class TextManagerGUI extends JFrame {

	public TextManagerGUI(){
		
		super("Text Manager");
		setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(800, 600);
		
		//Make Normal Window Extended
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Making the Programm Fullscreen like in Games
		/*Toolkit tk= Toolkit.getDefaultToolkit(); //getting Toolkit in order to get Height and Width of the Screen
		
		        int height=tk.getScreenSize().height;
		        int width=tk.getScreenSize().width;*/
		        
	
		
	}
}

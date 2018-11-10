 package learngui;
/*import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
import javax.swing.JComponent;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.util.List;

public class gugu {
	public static void main(String[]args) {
	
	     
	String en=JOptionPane.showInputDialog("Enter first numer");
	String zn=JOptionPane.showInputDialog("Enter second number");
	int num1= Integer.parseInt(en);
	int num2= Integer.parseInt(zn);
	int sum=num1+num2;
	JOptionPane.showMessageDialog(null, "The answer is "+ sum);
	
	
	
	
	
	clacla dude=new clacla();
	dude.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	dude.setSize(1200,768);
	dude.setVisible(true);

	
	}
	public static void main(String[]args) {
		nixFileDataFlavor=new DataFlavor("text/uri-list;class=java.lang.String");
		List<File> droppedFiles=(List<File>)transferable.getTransferData(DataFlavor.javaFileListFlavor);
	}
}*/

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.util.ArrayList;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
 
/**
 * @author Stefan, https://st-page.de
 * 
 */
public class DragAndDrop extends JFrame
{
 
    private static final long serialVersionUID = 1L;
 
    public DragAndDrop()
    {
    	setSize(new Dimension(691, 363));
    	setPreferredSize(new Dimension(300, 200));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Java Drag And Drop");
	SpringLayout springLayout = new SpringLayout();
	getContentPane().setLayout(springLayout);
 
	JLabel lblDraganddrop = new JLabel("Drag And Drop");
	springLayout.putConstraint(SpringLayout.NORTH, lblDraganddrop, 10, SpringLayout.NORTH, getContentPane());
	springLayout.putConstraint(SpringLayout.WEST, lblDraganddrop, 10, SpringLayout.WEST, getContentPane());
	springLayout.putConstraint(SpringLayout.SOUTH, lblDraganddrop, 315, SpringLayout.NORTH, getContentPane());
	springLayout.putConstraint(SpringLayout.EAST, lblDraganddrop, -10, SpringLayout.EAST, getContentPane());
	lblDraganddrop.setHorizontalTextPosition(SwingConstants.CENTER);
	lblDraganddrop.setHorizontalAlignment(SwingConstants.CENTER);
	lblDraganddrop.setBorder(new LineBorder(new Color(0, 0, 0)));
	lblDraganddrop.setAlignmentX(Component.CENTER_ALIGNMENT);
	lblDraganddrop.setVerticalAlignment(SwingConstants.CENTER);
	lblDraganddrop.setVerticalTextPosition(SwingConstants.CENTER);
	lblDraganddrop.setFont(new Font("Tahoma", Font.PLAIN, 48));
	getContentPane().add(lblDraganddrop);
	
	setVisible(true);
	
	new DropTarget(lblDraganddrop, new DropTargetListener()
	{
	    @Override
	    public void drop(DropTargetDropEvent dtde)
	    {
		try
		{
		    Transferable tr = dtde.getTransferable();
		    DataFlavor[] flavors = tr.getTransferDataFlavors();
		    ArrayList<File> fileNames = new ArrayList<File>();
		    
		    for (int i = 0; i < flavors.length; i++)
		    {
			if (flavors[i].isFlavorJavaFileListType())
			{
			    dtde.acceptDrop(dtde.getDropAction());
			    @SuppressWarnings("unchecked")
			    java.util.List<File> files = (java.util.List<File>) tr.getTransferData(flavors[i]);
			    for (int k = 0; k < files.size(); k++)
			    {
				fileNames.add(files.get(k));
				fileNames.get(k).toString();
				// Die Dateien werden mit dem spezifischen Programm geöffnet. 
				/*Desktop.getDesktop().open(files.get(k));
				// Der Dateiname wird in der Comandozeile ausgegeben.*/
				System.out.println(fileNames.get(k));
			    }
			    }
			    dtde.dropComplete(true);
			}
		    
		    return;
		}
		catch (Throwable t)
		{
		    t.printStackTrace();
		}
		dtde.rejectDrop();
		
	    }
 
	    @Override
	    public void dragEnter(DropTargetDragEvent dtde)
	    {}
 
	    @Override
	    public void dragOver(DropTargetDragEvent dtde)
	    {}
 
	    @Override
	    public void dropActionChanged(DropTargetDragEvent dtde)
	    {}
 
	    @Override
	    public void dragExit(DropTargetEvent dte)
	    {}
 
	});
    }
 
    /**
     * Hier wird das Programm ohne weitere Argumente gestartet.
     * @param args
     */
   
}
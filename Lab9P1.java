import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P1 extends JFrame{
	Label l;
	
	Lab9P1(){
		super("Tabbed pane Demo");
		JTabbedPane jtp = new JTabbedPane(3);
		//JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		jtp.addTab("Tab1", new Label ("Tabbed Pane 1"));
		jtp.addTab("Tab2", new Label ("Tabbed Pane 2"));
		jtp.addTab("Tab3", new Label ("Tabbed Pane 3"));
		jtp.setTabPlacement(SwingConstants.TOP);
		
		add(jtp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}	
        public static void main(String...args){
		new Lab9P1() ;
	}
	}

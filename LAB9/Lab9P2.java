import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P2  extends JFrame{
	Label l;
	
	Lab9P2(){
		super("JTable Demo");
		String [ ] heading = {"Name","Course","Roll No"};
		String [ ] [ ] data = {
							   {"DELL" , "CSE" , "45678"},
							   {"CELL" , "CSM", "90424"},
							   {"HELL" , "CSD", "34124"},
							   {"WELL", "CSIT", "24678"},
		}; 
		
		JTable jt = new JTable(data , heading);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		//add(jt);
	
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}	
        public static void main(String...args){
		new Lab9P2() ;
	}
	}

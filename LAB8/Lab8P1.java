import java.awt.*;
import java.awt.event.*;

class Lab8P1 extends Frame implements ActionListener{
	JLabel l;
	Lab8P1(){
		super("Demonstration of MenuBar");
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		l=new Label();
		l.setPreferredSize(new Dimension(150,200));
		l.setFont(new Font("Arial",Font.BOLD,30));
		add(l);
		MenuBar mb=new MenuBar();
		setMenuBar(mb);
		String[] menus={"File","Edit","Help"};
		String[][] mi={{"Open","Save","Close"},{"Cut","Copy","Paste"},{"About","Update","License"}};
		int x=0,y=0;
		for(String s:menus){
			y=0;
			Menu m=new Menu(s);
			for(int i=0;i<3;i++){
				MenuItem mmi=new MenuItem(mi[x][y]);
				mmi.addActionListener(this);
				m.add(mmi);
				y++;
			}
			x++;
			mb.add(m);
		}
		
		setSize(400,400);
		setVisible(true);
		addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					dispose();
				}
			}
		);
	}
	public void actionPerformed(ActionEvent ae){
		String mstr=ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);
		}else{
			l.setText(mstr);
		
		}
	}
	public static void main(String...args){
		new Lab8P1();
	}
}

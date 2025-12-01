import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
	TextField tf;
	Button b;
	String operator="";
	int n1=0,n2=0,output=0;
	Calculator(){
		GridBagLayout gb=new GridBagLayout();
		setLayout(gb);
		GridBagConstraints gc=new GridBagConstraints();
		String[] ss={"9","8","7","+","6","5","4","-","3","2","1","*","0","C","=","/"};
		int x=0;
		int y=0;
		gc.fill=GridBagConstraints.BOTH;
		for(String s:ss){
			b=new Button(s);
			b.setFont(new Font("Arial",Font.BOLD,20));
			b.addActionListener(this);
			gc.ipadx=15;
			gc.ipady=15;
			gc.gridx=x;
			gc.gridy=y;
			gc.insets=new Insets(10,10,10,10);
			add(b,gc);
			x++;

			if(x==4){
				x=0;
				y++;
			}
		}
		tf=new TextField();
		tf.setFont(new Font("Arial",Font.BOLD,20));
		gc.ipadx=15;
		gc.ipady=15;
		gc.gridx=0;
		gc.gridy=y;
		gc.gridwidth=4;
		gc.insets=new Insets(10,10,10,10);
		add(tf,gc);

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
		String val=ae.getActionCommand();
		if(val.charAt(0)>='0' && val.charAt(0)<='9'){
			tf.setText(tf.getText()+val);
		}else if(val.equals("C")){
			tf.setText("");
		}else if(val.equals("=")){
			n2=Integer.parseInt(tf.getText());
			switch(operator){
				case "+":
					output=n1+n2;
					break;
				case "-":
					output=n1-n2;
					break;
				case "*":
					output=n1*n2;
					break;
				case "/":
					if(n2==0){
						tf.setText("Error:div/Zero");
						return;
					}else{
					output=n1+n2;
					break;
					}
				default:
					System.out.println("Error");
			}
			tf.setText(String.valueOf(output));
		}else{
			n1=Integer.parseInt(tf.getText());
			operator=ae.getActionCommand();
			tf.setText("");
		}
	}
	public static void main(String...args){
		new Calculator();
	}
}

LABimport java.awt.event.*;
import java.awt.*;
class Lab7P1{
      public static void main(String...args){
            final int[] a={1};
            Frame f = new Frame();  //create frame object
            FlowLayout fl = new FlowLayout(); 
            f.setLayout(fl);
            f.setSize(200,400);
            TextField tf = new TextField(20);  //create textfield
            //tf.setColumn(20);
            Button b = new Button();
            b.setLabel("click");
            b.setSize(20,40);
            Label l = new Label();
            //l.setText(tf.getText());
            l.setPreferredSize(new Dimension(200,200));
            
            
            f.setVisible(true);
            f.add(tf);
            f.add(b);
            f.add(l);
            b.addActionListener(
                  new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                              System.out.println("Hello"); 
                              //tf.setText("Hello");  
                              l.setText(tf.getText() + "-" + a[0]);
                              a[0]++;
                        }
                  }
            );
            f.addWindowListener(
                  new WindowAdapter(){
                        public void windowClosing(WindowEvent we){
                              f.dispose();
                        }
                  }
            );
      }
}

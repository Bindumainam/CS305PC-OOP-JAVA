import javax.swing.*; 
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class FactorialApplet extends JApplet implements ActionListener { 
private JTextFieldinputField; 
private JTextFieldoutputField; 
private JButton computeButton; 
@Override 
public void init() { 
setLayout(new FlowLayout()); 
add(new JLabel("Enter Integer:")); 
inputField = new JTextField(10); 
add(inputField); 
computeButton = new JButton("Compute"); 
computeButton.addActionListener(this); 
add(computeButton); // Button named "Compute" is clicked  
19 
add(new JLabel("Factorial Value:")); 
outputField = new JTextField(15); 
outputField.setEditable(false); 
add(outputField);  
} 
@Override 
public void actionPerformed(ActionEvent e) { 
if (e.getSource() == computeButton) { 
try { 
int n = Integer.parseInt(inputField.getText()); 
if (n < 0 || n > 20) { 
outputField.setText("Input must be 0‐20"); 
} else { 
int fact = calculateFactorial(n); 
outputField.setText(String.valueOf(fact)); 
} 
} catch (NumberFormatException ex) { 
outputField.setText("Invalid Integer Input"); 
} 
} 
} 
// Recursive factorial function 
private long calculateFactorial(int n) { 
if (n == 0) { 
return 1; 
} 
return n * calculateFactorial(n ‐ 1); 
}
}

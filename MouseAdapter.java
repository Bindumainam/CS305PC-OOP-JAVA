import javax.swing.*; 
import java.awt.*; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
public class MouseAdapterDemo extends JFrame { 
private JLabel l; 
public MouseAdapterDemo() { 
setTitle("Mouse Events Demo (Adapter)"); 
setSize(400, 300); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setLayout(new BorderLayout()); 
l = new JLabel("Move or Click the Mouse", SwingConstants.CENTER); 
l.setFont(new Font("Arial", Font.BOLD, 16)); 
add(l, BorderLayout.CENTER); 
this.addMouseListener(new CustomMouseAdapter()); 
this.addMouseMotionListener(new CustomMouseMotionAdapter()); 
setVisible(true); 
} 
// Custom MouseAdapter class  
private class CustomMouseAdapter extends MouseAdapter { 
@Override 
public void mouseClicked(MouseEvent e) { 
updateLabel("Mouse Clicked"); 
} 
@Override 
public void mousePressed(MouseEvent e) { 
updateLabel("Mouse Pressed"); 
} 
@Override 
public void mouseReleased(MouseEvent e) { 
updateLabel("Mouse Released"); 
} 
@Override 
public void mouseEntered(MouseEvent e) { 
updateLabel("Mouse Entered Window"); 
} 
@Override 
public void mouseExited(MouseEvent e) { 
updateLabel("Mouse Exited Window"); 
} 
} 
27 
// Custom MouseMotionAdapter class 
private class CustomMouseMotionAdapter extends MouseAdapter { 
@Override 
public void mouseMoved(MouseEvent e) { 
updateLabel("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")"); 
} 
@Override 
public void mouseDragged(MouseEvent e) { 
updateLabel("Mouse Dragged at (" + e.getX() + ", " + e.getY() + 
")"); 
} 
} 
private void updateLabel(String eventName){ 
l.setText(eventName); 
} 
public static void main(String[] args) { 
new MouseAdapterDemo(); 
} 
} 

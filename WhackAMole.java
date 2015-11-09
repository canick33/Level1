import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class WhackAMole implements ActionListener {
	JFrame f;
	JPanel p;
	JButton[] b = new JButton[25];
	
 public static void main (String[] args)
{
	WhackAMole w = new WhackAMole();
}
 public WhackAMole()
 {
	 f = new JFrame();
	 p = new JPanel();
	 f.setVisible(true); f.setSize(500, 500);
	 for(int i = 0; i<25; i++){ 
		 b[i] = new JButton();
		 b[i].addActionListener(this);}
	 
	 
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	for(int i = 0;i<25;i++)
	
}
}

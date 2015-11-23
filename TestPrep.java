package yo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class TestPrep implements ActionListener {
 JFrame j;
 JPanel l;
 JButton b1;
 JButton b2;
 JButton b3;
 public static void main (String[] args)
 {
	 TestPrep t = new TestPrep();
	 
 }
 public TestPrep()
 {
	 j = new JFrame();
	 j.setVisible(true);
	 l = new JPanel();
	 b1 = new JButton("mess");
	 b2 = new JButton("num");
	 b3 = new JButton("exit");
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 l.add(b1);
	 l.add(b2);
	 l.add(b3);
	 j.add(l);
	 j.setSize(500,500);

 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		JOptionPane.showMessageDialog(null, "HI");
	}
	else if(e.getSource()==b2)
	{
		Random r = new Random(100);
		int x = r.nextInt();
		JOptionPane.showMessageDialog(null, ""+ x);
	}
	else if(e.getSource() ==b3)
	{
		System.exit(7);;
	}
	
}
}

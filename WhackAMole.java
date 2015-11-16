package a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
public class WhackAMole implements ActionListener {

	int score = 0;
	
 public static void main (String[] args)
{
	WhackAMole w = new WhackAMole();
}
 public WhackAMole()
 {
	

	 Random r = new Random();
	 int y = r.nextInt(24);

	 drawButtons(y);
	 
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton j = (JButton)e.getSource();
	if(j.getText().equals( "MOLE")){
		score = score+1;
		speak("mole Hit");
		if(score ==10)
		{
			speak("yay you win");

		}
	}
	else
	{
      speak("kill yourself");
		score = score-1;
	}
	 Random r = new Random();
	 int x = r.nextInt(24);
	 drawButtons(x);
	}
public void drawButtons(int r)
{
	 JFrame f = new JFrame();
		JPanel p = new JPanel();
		

		 f.setSize(500,500);
		 f.setVisible(true);
		 f.add(p);
	for(int i = 0;i<24;i++)
	{
		JButton b = new JButton();
		b.addActionListener(this);
		p.add(b);
		
		if( r==i)
		{
			b.setText("MOLE");
		}
	}
	
}
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}
}


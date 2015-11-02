import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;


public class TypeTutor implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel letter;
	JLabel score;
	JTextField input;
	int correct,asked;
	char q = 'a';


	public static void main (String[] args)
	{
		TypeTutor t = new TypeTutor();
		
	}
	public TypeTutor()
	{
		frame = new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		panel = new JPanel();
		letter = new JLabel("a");
		score = new JLabel("score");
		input = new JTextField();
		input.addKeyListener(this);
		frame.add(panel);
		panel.add(letter);
		panel.add(score);
		panel.add(input);
		

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		 String x = input.getText();
		 char anwser = x.charAt(0);
		asked = asked +1;

		 if(anwser == q)
		 {
			correct = correct + 1;
		 }
		 score.setText(""+ correct +"/"+asked);
			Random r = new Random();
			int w = r.nextInt(26)+97;
			 q = (char)w;
			letter.setText("" +q);
			input.setText("");




	}
}

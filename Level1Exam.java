package exam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class Level1Exam implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton y;
	JButton r;
	JButton b;
	JButton g;
	
	
	public static void main (String[] args)
	{
		Level1Exam l = new Level1Exam();
	}
	public Level1Exam()
	{
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		y = new JButton();
		r = new JButton();
		b = new JButton();
		g = new JButton();
		y.setBackground(Color.YELLOW);
		y.setOpaque(true);
		r.setBackground(Color.RED);
		r.setOpaque(true);
		b.setBackground(Color.BLUE);
		b.setOpaque(true);
		g.setBackground(Color.GREEN);
		g.setOpaque(true);
		y.addActionListener(this);
		r.addActionListener(this);
		b.addActionListener(this);
		g.addActionListener(this);
		panel.add(y);
		panel.add(r);
		panel.add(b);
		panel.add(g);
		frame.add(panel);
		frame.setSize(500, 500);

		
		
	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==y)
		{
			speak("yellow");			
		}
		if(e.getSource()==r)
		{
			speak("red");			
		}
		if(e.getSource()==b)
		{
			speak("blue");			
		}
		if(e.getSource()==g)
		{
			speak("green");			
		}
		
	}

}

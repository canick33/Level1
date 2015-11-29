package GUI.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class practice implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton up,down,left,right;
	String recent = "";

	public static void main (String[] args)
	{
		practice p = new practice();
	}
	public practice()
	{
		JFrame frame = new JFrame();
		panel = new JPanel();
		up = new JButton("up");
		down = new JButton("down");
		left = new JButton("left");
		right = new JButton("right");
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		frame.setVisible(true);
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==up)
		{
			if(!recent.equals("up"))
			{
				System.out.println("up");
				recent="up";
			}
		}
		if(e.getSource()==down)
		{
			if(!recent.equals("down"))
			{
				System.out.println("down");
				recent="down";

			}
		}
		if(e.getSource()==right)
		{
			if(!recent.equals("right"))
			{
				System.out.println("right");
				recent="right";

			}
		}
		if(e.getSource()==left)
		{
			if(!recent.equals("left"))
			{
				System.out.println("left");
				recent="left";

			}
		}
			
		}
	}
	



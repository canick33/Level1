import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BasicCalc implements ActionListener {
	JFrame f;
	JPanel p;
	JButton mult;
	JButton add;
	JButton sub;
	JButton div;
	JTextField anws;
	JTextField inp1;
	JTextField inp2;
	int x,y;
	public static void main (String[] args)
	{
		BasicCalc c = new BasicCalc();
	}
	
	public BasicCalc()
	{
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(1920, 1080);
		p = new JPanel();
		sub = new JButton("sub");
		add = new JButton("Add");
		mult = new JButton("Mult");
		div = new JButton("div");
		mult.addActionListener(this);
		add.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		anws = new JTextField("anwser");
		inp1 = new JTextField("input1");
		inp2 = new JTextField("input2");
		f.add(p);
		p.add(mult);
		p.add(sub);
		p.add(div);
		p.add(add);
		p.add(inp1);
		p.add(inp2);
		p.add(anws);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String x1 = inp1.getText();
		int x= Integer.parseInt(x1);
		String y1 = inp2.getText();
		int y= Integer.parseInt(y1);

		if(e.getSource() == add)
		{
			int z = x+y;
			anws.setText("" + z);
			JOptionPane.showMessageDialog(null,""+z);
		}
		if(e.getSource() == mult)
		{
			int z = x*y;
			anws.setText("" + z);
			JOptionPane.showMessageDialog(null,""+z);

		}
		if(e.getSource() == sub)
		{
			int z = x-y;
			anws.setText("" + z);
			JOptionPane.showMessageDialog(null,""+z);

		}
		if(e.getSource() == div)
		{
			float z = x/y;
			anws.setText("" + z);
			JOptionPane.showMessageDialog(null,""+z);

		}
	}

}

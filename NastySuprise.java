package GUI.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class NastySuprise implements ActionListener{
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	public static void main(String[] args)
	{
		NastySuprise n = new NastySuprise();
		
	}
	public NastySuprise()
	{
		f = new JFrame();
		p = new JPanel();
		b1 = new JButton("treat");
		b1.addActionListener(this);	
		b2 = new JButton("trick");
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		f.setVisible(true);
		f.add(p);
		f.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			showPictureFromTheInternet("http://www.dogwallpapers.net/wallpapers/siberian-husky-puppies-photo.jpg");
		}
		else if(e.getSource()==b2)
		{
			showPictureFromTheInternet("http://slodive.com/wp-content/uploads/2012/10/scary-clown-pictures/devil-clown-pennywise.jpg");
		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

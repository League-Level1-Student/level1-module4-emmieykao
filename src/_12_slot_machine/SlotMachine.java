package _12_slot_machine;

import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	void setup() {
		Random ran=new Random();
		int x=ran.nextInt(3);
		int y=ran.nextInt(3);
		int z=ran.nextInt(3);
		if(x==0) {
			try {
				label1=createLabelImage("cherry3.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(y==0) {
			try {
				label2=createLabelImage("cherry3.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(z==0) {
			try {
				label3=createLabelImage("cherry3.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(x==1) {
			try {
				label1=createLabelImage("lime2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(y==1) {
			try {
				label2=createLabelImage("lime2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(z==1) {
			try {
				label3=createLabelImage("lime2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(x==2) {
			try {
				label1=createLabelImage("passionfruit2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(y==2) {
			try {
				label2=createLabelImage("passionfruit2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(z==2) {
			try {
				label3=createLabelImage("passionfruit2.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		if(x==0&&y==0&&z==0) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
		else if(x==1&&y==1&&z==1) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
		else if(x==2&&y==2&&z==2) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        java.net.URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
}

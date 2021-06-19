package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JTextField  entry=new JTextField();
JLabel label=new JLabel();
JButton button=new JButton();
void setup() {

	panel.add(entry);
	panel.add(button);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	button.setText("Translate");
	
}
}

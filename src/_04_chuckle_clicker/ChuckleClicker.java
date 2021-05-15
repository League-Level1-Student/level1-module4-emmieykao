package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton joke=new JButton();
JButton punchline=new JButton();

public void makeButtons(){
	frame.setVisible(true);
	System.out.println("make buttons");
	joke.setText("joke");
	panel.add(joke);
	panel.add(punchline);
	punchline.setText("punchline");
	joke.addActionListener(this);
	punchline.addActionListener(this);
	frame.add(panel);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.equals(joke)) {
		JOptionPane.showMessageDialog(null, "I had an argument with a 90° angle.");
	}
	if(buttonPressed.equals(punchline)) {
		JOptionPane.showMessageDialog(null, "Turns out it was right.");
	}
}
}

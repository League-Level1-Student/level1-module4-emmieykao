package _11_whack_a_mole;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WhackaMole {
JFrame frame=new JFrame();
JPanel panel=new JPanel();

JButton button1=new JButton();
JButton button2=new JButton();
JButton button3=new JButton();
JButton button4=new JButton();
JButton button5=new JButton();
JButton button6=new JButton();
JButton button7=new JButton();
JButton button8=new JButton();
JButton button9=new JButton();
JButton button10=new JButton();
JButton button11=new JButton();
JButton button12=new JButton();

void setup() {
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button10);
	panel.add(button11);
	panel.add(button12);
	panel.setLayout(new GridLayout(3,4));
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
}
public void drawButtons() {
	Random ran=new Random();
	int x= ran.nextInt(12);
	if(x==0) {
		button1.setText("Mole!");
	}
	if(x==1) {
		button2.setText("Mole!");
	}
	if(x==2) {
		button3.setText("Mole!");
	}
	if(x==3) {
		button4.setText("Mole!");
	}
	if(x==4) {
		button5.setText("Mole!");
	}
	if(x==5) {
		button6.setText("Mole!");
	}
	if(x==6) {
		button7.setText("Mole!");
	}
	if(x==7) {
		button8.setText("Mole!");
	}
	if(x==8) {
		button9.setText("Mole!");
	}
	if(x==9) {
		button10.setText("Mole!");
	}
	
	if(x==10) {
		button11.setText("Mole!");
	}
	if(x==11) {
		button12.setText("Mole!");
	}
}
}

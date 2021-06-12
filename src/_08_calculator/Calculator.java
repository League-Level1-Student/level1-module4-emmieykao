package _08_calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton add=new JButton();
JButton sub=new JButton();		
JButton mul=new JButton();
JButton div=new JButton();
JTextField num1=new JTextField(5);
JTextField num2=new JTextField(5);
static JLabel label1=new JLabel();
static JLabel label2=new JLabel();
void setup() {
	panel.add(num1);
	panel.add(num2);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(label1);
	panel.add(label2);
	panel.setLayout(new GridLayout(3,4));
add.setText("+");
sub.setText("-");
mul.setText("x");
div.setText("÷");
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
	
}
public int add(int a,int b) {

return a+b;
}
public int sub(int a,int b) {

return a-b;
}
public int mul(int a,int b) {

return a*b;
}
public int div(int a,int b) {

return a/b;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String numx
}

}

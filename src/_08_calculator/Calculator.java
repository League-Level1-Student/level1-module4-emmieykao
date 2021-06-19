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
JLabel label1=new JLabel();

void setup() {
	panel.add(num1);
	panel.add(num2);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(label1);
label1.setSize(100, 50);

	panel.setLayout(new GridLayout(4,3));
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
	JButton buttonPressed = (JButton) e.getSource();
	// TODO Auto-generated method stub
if (buttonPressed==add) {
	String xasstring=num1.getText();
	int x=Integer.parseInt(xasstring);
	String yasstring=num2.getText();
	int y=Integer.parseInt(yasstring);
	int i=add(x,y);
	String iasstring=(i+ " ");
	label1.setText(iasstring);
}
if (buttonPressed==sub) {
	String xasstring=num1.getText();
	int x=Integer.parseInt(xasstring);
	String yasstring=num2.getText();
	int y=Integer.parseInt(yasstring);
	int i=sub(x,y);
	String iasstring=(i+ " ");
	label1.setText(iasstring);
}
if (buttonPressed==mul) {
	String xasstring=num1.getText();
	int x=Integer.parseInt(xasstring);
	String yasstring=num2.getText();
	int y=Integer.parseInt(yasstring);
	int i=mul(x,y);
	String iasstring=(i+ " ");
	label1.setText(iasstring);
}
if (buttonPressed==div) {
	String xasstring=num1.getText();
	int x=Integer.parseInt(xasstring);
	String yasstring=num2.getText();
	int y=Integer.parseInt(yasstring);
	int i=div(x,y);
	String iasstring=(i+ " ");
	label1.setText(iasstring);
}
}

}

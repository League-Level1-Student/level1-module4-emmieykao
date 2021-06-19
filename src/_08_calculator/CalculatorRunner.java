package _08_calculator;

import javax.swing.JOptionPane;

public class CalculatorRunner {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Dividing does NOT work if your quotient isn't a whole number!");
		new Calculator().setup();	
	}

}

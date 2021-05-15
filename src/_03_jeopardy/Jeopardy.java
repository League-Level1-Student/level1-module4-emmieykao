package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton, sixthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private Clip jeopardyThemeClip;



	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
frame.setVisible(true);
		// 2. Give your frame a title
frame.setTitle("Jeopardy!");
		// 3. Create a JPanel variable to hold the header using the createHeader method
JPanel math=createHeader("Math!");
		// 4. Add the header component to the quizPanel
quizPanel.add(math);
		// 5. Add the quizPanel to the frame
frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
firstButton=createButton("100");
		// 7. Add the firstButton to the quizPanel
quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
secondButton=createButton("200");
thirdButton=createButton("400");
fourthButton=createButton("600");
fifthButton=createButton("800");
sixthButton=createButton("1000");
		// 10. Add the secondButton to the quizPanel
quizPanel.add(secondButton);
quizPanel.add(thirdButton);
quizPanel.add(fourthButton);
quizPanel.add(fifthButton);
quizPanel.add(sixthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
firstButton.addActionListener(this);
secondButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
thirdButton.addActionListener(this);
fourthButton.addActionListener(this);
fifthButton.addActionListener(this);
sixthButton.addActionListener(this);

		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
JButton button=new JButton();
		// Set the text of the button to the dollarAmount
button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
buttonCount++;
		// Return your new button instead of the temporary button

		return button;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		//JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
if(buttonPressed==firstButton) {
			// Call the askQuestion() method
 askQuestion("What is ((123^2-√(456)+789)^0+10)? No calculators!", "10", 100);
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

firstButton.setText("");
}
		// If the buttonPressed was the secondButton
if(buttonPressed==secondButton) {
askQuestion("In a 30-60-90 triangle, if the hypotenuse is 1 unit long, how long is the side opposite the 60° angle? No calculators!", "√3", 200);
updateScore();
secondButton.setText("");
}

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)
if(buttonPressed==thirdButton) {
askQuestion("What is the value of log(0.1)? No calculators!", "-1", 400);
updateScore();
thirdButton.setText("");
}
if(buttonPressed==fourthButton) {
askQuestion("What is the probability that all members of a 15-person class have different birthdays? Round to the nearest tenth of a percent. Calculators are permitted.", "74.7%", 600);
updateScore();
fourthButton.setText("");
}
if(buttonPressed==fifthButton) {
askQuestion("In many states, automobile license plates display six characters — three letters followed by a three-digit number, as in SAS-311. Would this system work adequately in California? Calculators are permitted.", "no", 800);
updateScore();
fifthButton.setText("");
}
if(buttonPressed==sixthButton) {
askQuestion("Find coordinates x and y that are equivalent to polar coordinates r = 8 and θ = 112. Round to the nearest thousandth. Calculators are permitted.", "(-2.997, 7.417)", 1000);
updateScore();
sixthButton.setText("");
}
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		String answer=JOptionPane.showInputDialog(null, question);
		
		// Stop the theme music when they have entered their response. 
		stopJeopardyTheme();
		// If the answer is correct
if(answer.equals(correctAnswer)){

			// Increase the score by the prizeMoney
score=score+prizeMoney;
			// Pop up a message to tell the user they were correct
JOptionPane.showMessageDialog(null, "You are correct!");
updateScore();

}
		// Otherwise
else {
			// Decrement the score by the prizeMoney
score=score-prizeMoney;
			// Pop up a message to tell the user they were wrong and give them the correct answer
JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is "+correctAnswer+".");
		// Call the updateScore() method
updateScore();
}
	}

	public void playJeopardyTheme() {
		String fileName = "src/_03_jeopardy/jeopardy.wav";
		// Note: use .wav files
		try {
			jeopardyThemeClip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
			jeopardyThemeClip.open(inputStream);
			jeopardyThemeClip.start();
		} catch (Exception e) {
			System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
		}
	}

	public void stopJeopardyTheme() {
		jeopardyThemeClip.stop();

	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}

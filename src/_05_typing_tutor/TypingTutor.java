package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
public static void main(String[] args) {
	
}
void setup(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
char currentLetter;
label.setText(currentLetter);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.addKeyListener(null);
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}

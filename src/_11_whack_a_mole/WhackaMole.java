package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WhackaMole implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();

JButton molebutton;
Random ran=new Random();
int x= ran.nextInt(12);
int num=0;
Date date=new Date();

void setup() {
		panel.setLayout(new GridLayout(3,4));
		frame.add(panel);
		
		frame.setVisible(true);
		drawButtons(x);
		frame.pack();
	}
	
	


public void drawButtons(int randomnumber) {
for (int i = 0; i < 12; i++) {
	JButton button=new JButton();
	panel.add(button);
	button.addActionListener(this);
	if(randomnumber==i) {
		molebutton=button;
		molebutton.setText("Mole!");
	}
}

}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==molebutton) {
		num++;
		frame.dispose();
		frame=new JFrame();
		panel=new JPanel();
		x=ran.nextInt(12);
		setup();

		}
	else {
		speak("you missed.");
	}
	if(num==10) {
		endGame(date, 10);
		System.exit(0);
	}

}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
}

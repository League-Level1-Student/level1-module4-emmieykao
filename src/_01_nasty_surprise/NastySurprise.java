package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton trick=new JButton();
		JButton treat=new JButton();
		
		void setup(){
		trick.setText("Trick!");
		treat.setText("Treat!");
		trick.addActionListener(this);
		treat.addActionListener(this);
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton buttonPressed = (JButton) arg0.getSource();
			// TODO Auto-generated method stub
			if (buttonPressed==(trick)) {
				showPictureFromTheInternet("https://images.squarespace-cdn.com/content/v1/5a3adeb11f318d9dd2dfadaa/1527611880550-6DUOWKQ67ULOTK1ODMLQ/ke17ZwdGBToddI8pDm48kFVfgRqeiJbezCllpJQtY_0UqsxRUqqbr1mOJYKfIPR7LoDQ9mXPOjoJoqy81S2I8N_N4V1vUb5AoIIIbLZhVYxCRW4BPu10St3TBAUQYVKciN1LM1HpqVwNixpz1hCKq8qoxvRXzjNTQ09MieJKwtnXQQXYw_DH5ZQqvplaE488/puppies.jpg");
			}
			if(buttonPressed==(treat)) {
				showPictureFromTheInternet("https://www.jing.fm/clipimg/detail/47-471289_ghost-that-are-not-scary.png");
			}
		}
		private void showPictureFromTheInternet(String imageUrl) {
		    try {
		        URL url = new URL(imageUrl);
		        Icon icon = new ImageIcon(url);
		        JLabel imageLabel = new JLabel(icon);
		        JFrame frame = new JFrame();
		        frame.add(imageLabel);
		        frame.setVisible(true);
		        frame.pack();
		    } catch (MalformedURLException e) {
		        e.printStackTrace();
		    }
		}

}

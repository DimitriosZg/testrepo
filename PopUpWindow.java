package tl14;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PopUpWindow {
	
	private JFrame frame;
	
	public PopUpWindow(){
		frame = new JFrame("Starting Game");
		frame.setVisible(true);
		int inset = 50;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(inset, inset,
                  screenSize.width  - inset*2,
                  screenSize.height - inset*2);
		Container contentPane1 = frame.getContentPane();
		JLabel label1 = new JLabel("Επιλογές παιχνιδιού");
		ButtonGroup radio = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Offline game", true);
		JRadioButton rb2 = new JRadioButton("Online game", false);
		frame.pack();
		label1.setVisible(true);
		rb1.setVisible(true);
		rb2.setVisible(true);
		radio.add(rb1);
		radio.add(rb2);
		contentPane1.setLayout(new BoxLayout(contentPane1, BoxLayout.Y_AXIS));
		contentPane1.add(label1);
		contentPane1.add(rb1);
		contentPane1.add(rb2);
	}
}

package tl14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class MainFrame {
	
	private JFrame frame;
	
	public MainFrame() {
		frame = new JFrame("Starting Window");
		frame.setVisible(true);
		int inset = 50;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(inset, inset,
                  screenSize.width  - inset*2,
                  screenSize.height - inset*2);
		Container contentPane1 = frame.getContentPane();
		Container contentPane2 = frame.getContentPane();
        JButton button1 = new JButton("Start Game");
        JButton button2 = new JButton("Roll");
        ImageIcon image1 = new ImageIcon("boardBG.jpg");
        JLabel label1 = new JLabel(image1);
        frame.pack();
        button1.setVisible(true);
        button2.setVisible(true);
        label1.setVisible(true);
        contentPane1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        contentPane2.setLayout(new BorderLayout());
        contentPane2.add(contentPane1, BorderLayout.NORTH);
        contentPane1.add(button1);
        contentPane2.add(label1, BorderLayout.CENTER);
        
        
	}
}

                               
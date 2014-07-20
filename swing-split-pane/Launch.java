import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JButton;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JSplitPane jp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JButton("Top"), new JButton("Bottom"));
		f.getContentPane().add(jp, BorderLayout.NORTH);
		jp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JButton("Left"), new JButton("Right"));
		f.getContentPane().add(jp, BorderLayout.SOUTH);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

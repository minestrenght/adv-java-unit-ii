import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        JPanel ep = new JPanel();
        ep.add(new JButton("Button"));
        ep.add(new JButton("Button"));
        JPanel wp = new JPanel();
        wp.setLayout(new BorderLayout());
        wp.add(new JButton("Button"), BorderLayout.WEST);
        wp.add(new JButton("Button"), BorderLayout.EAST);
        f.getContentPane().add(ep, BorderLayout.EAST);
        f.getContentPane().add(wp, BorderLayout.WEST);
		f.pack();//set auto width, height
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

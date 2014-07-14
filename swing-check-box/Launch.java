import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JCheckBox cb = new JCheckBox("Veg", true);//default checked
		f.getContentPane().add(cb, BorderLayout.EAST);
        cb = new JCheckBox("Non-Veg");
		f.getContentPane().add(cb, BorderLayout.WEST);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

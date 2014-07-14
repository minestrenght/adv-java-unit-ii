import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JTextField tf = new JTextField("Its a JTextField");
		f.getContentPane().add(tf, BorderLayout.NORTH);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JPasswordField pf = new JPasswordField();
		f.getContentPane().add(pf, BorderLayout.NORTH);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

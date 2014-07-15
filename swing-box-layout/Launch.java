import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JButton b = new JButton("Click me !");
		Container c = f.getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
        c.add(new JButton("One"));
        c.add(new JButton("Two"));
        c.add(new JButton("Three"));
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

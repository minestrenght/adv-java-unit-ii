import java.io.File;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JEditorPane;

public class Launch {

    public static void main(String[] args) throws Exception {
		JFrame f = new JFrame("My Swing Frame");
		URL url = Launch.class.getClassLoader().getResource("index.html");
		f.getContentPane().add(new JEditorPane(url));
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

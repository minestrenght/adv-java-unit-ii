import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        JTextArea ta = new JTextArea(3, 25);//<-- rows, cols
        ta.setText("without scroll");
        f.getContentPane().add(ta, BorderLayout.NORTH);
        ta = new JTextArea(3, 25);
        ta.setText("with scroll");
        f.getContentPane().add(new JScrollPane(ta), BorderLayout.SOUTH);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

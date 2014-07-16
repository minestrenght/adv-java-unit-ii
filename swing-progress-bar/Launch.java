import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		Container c = f.getContentPane();

        JProgressBar pb = new JProgressBar();
        pb.setValue(25);
        c.add(pb, BorderLayout.NORTH);

        pb = new JProgressBar(JProgressBar.VERTICAL, 0, 10);
        pb.setValue(7);
        c.add(pb, BorderLayout.EAST);

        pb = new JProgressBar(JProgressBar.VERTICAL, 0, 10);
        pb.setValue(4);
        pb.setStringPainted(true);
        c.add(pb, BorderLayout.WEST);

        pb = new JProgressBar();
        pb.setValue(75);
        pb.setStringPainted(true);
        c.add(pb, BorderLayout.SOUTH);

		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

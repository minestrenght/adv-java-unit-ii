import javax.swing.JFrame;
import javax.swing.JTextPane;

import javax.swing.text.StyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import java.awt.Color;

public class Launch {

    public static void main(String[] args) throws Exception {
        JTextPane tp = new JTextPane();
        StyledDocument sd = tp.getStyledDocument();
        Style st = tp.addStyle("mine-style", null);
        StyleConstants.setForeground(st, Color.BLUE);
        sd.insertString(sd.getLength(), "hello ", st);
        StyleConstants.setForeground(st, Color.MAGENTA);
        sd.insertString(sd.getLength(), "world ", st);
        StyleConstants.setForeground(st, Color.RED);
        sd.insertString(sd.getLength(), "!!", st);
		JFrame f = new JFrame("My Swing Frame");
		f.getContentPane().add(tp);
        f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

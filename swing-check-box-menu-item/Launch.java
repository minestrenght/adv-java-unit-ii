import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Options");
        m.add(new JCheckBoxMenuItem("Sound"));
        m.add(new JCheckBoxMenuItem("Music"));
        mb.add(m);
        f.setJMenuBar(mb);//frame can have only 1 menu bar
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

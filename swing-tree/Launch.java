import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        DefaultMutableTreeNode sub = new DefaultMutableTreeNode("Subjects");
        JTree tree = new JTree(sub);
		f.getContentPane().add(tree);
        sub.add(new DefaultMutableTreeNode("English"));
        sub.add(new DefaultMutableTreeNode("Hindi"));
        DefaultMutableTreeNode maths = new DefaultMutableTreeNode("Maths");
        sub.add(maths);
        maths.add(new DefaultMutableTreeNode("Algebra"));
        maths.add(new DefaultMutableTreeNode("Geometry"));
        tree.setShowsRootHandles(true);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}

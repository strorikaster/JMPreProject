import javax.swing.*;
import java.awt.*;

/**
 * Created by A.Zotov on 18.01.2017.
 */
public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width = 800, dimension.height = 600);
        //frame.setSize(800,600); можно использовать как вариант, так даже проще
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setVisible(true);
    }
}

package awt_programs;
import java.awt.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class CanvasExample {

    public CanvasExample() {
        Frame f = new Frame("Canvas Example");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CanvasExample();
    }
}

class MyCanvas extends Canvas {

    public MyCanvas() {
        setBackground(Color.GREEN);
        setSize(300, 200);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}

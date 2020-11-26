package awt_programs;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class ButtonExample {

    public static void main(String[] args) {
        Frame f = new Frame("Button");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcomet to Java Class");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

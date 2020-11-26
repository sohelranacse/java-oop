package swing_programs;

import javax.swing.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class ButtonExample2 {

    ButtonExample2() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample2();
    }
}

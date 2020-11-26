package swing_programs;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */

class FactorialExm extends JFrame {

    JTextField t1, t2;

    FactorialExm() {
        JLabel l1 = new JLabel("Enter Number: ");
        JLabel l2 = new JLabel("Factorial of Input Number: ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        JPanel p = new JPanel(new GridLayout(3, 2));
        JButton b = new JButton("Find");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = t1.getText();
                int num = Integer.parseInt(number);
                long fac = num;
                for (int i = num; i > 1; i--) {
                    fac = fac * (i - 1);
                }
                t2.setText(Long.toString(fac));

            }
        });
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b);
        add(p);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        FactorialExm f = new FactorialExm();
    }
}

package awt_programs;

import java.awt.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class AWTAssociation {

    AWTAssociation() {
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        AWTAssociation f = new AWTAssociation();
    }
}

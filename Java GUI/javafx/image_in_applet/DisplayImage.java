package image_in_applet;
import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet {

    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(), "richard.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 300, 300, this);
    }
}

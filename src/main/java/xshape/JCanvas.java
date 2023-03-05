package xshape;

import java.awt.*;
import javax.swing.*;

class JCanvas extends JPanel {

    XShape xshape = null;

    public JCanvas(XShape xs) {
        this.xshape = xs;
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        AwtContext.instance().graphics(g);
        this.xshape.draw();
    }
}

package xshape;

import java.awt.*;
import javax.swing.*;

import ui.factories.ShapeFactory;
import ui.factories.awt.ShapeFactoryAwt;



public class AwtApp extends XShape {
    class JCanvas extends JPanel {
        XShape _xshape = null;
        public JCanvas(XShape xs) {
            _xshape = xs;
        }
        public void paint(Graphics g) {
            super.paint(g);
            AwtContext.instance().graphics(g);
            _xshape.draw();
        }
    }
    
    @Override
    protected ShapeFactory createFactory() {
        return new ShapeFactoryAwt();
    }

    @Override
    void run() {
        JCanvas jc = new JCanvas(this);
        jc.setBackground(Color.WHITE);
        jc.setPreferredSize(new Dimension(500, 500));
        GUIHelper.showOnFrame(jc, "XShape Swing/AWT Rendering");        
    }
}


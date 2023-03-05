package xshape;

import java.awt.*;

import ui.factories.ShapeFactory;
import ui.factories.awt.ShapeFactoryAwt;



public class AwtApp extends XShape {
    
    
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


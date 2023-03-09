package xshape;

import java.awt.*;

import ui.factories.ShapeFactory;
import ui.factories.awt.ShapeFactoryAwt;
import events.*;



public class AwtApp extends XShape {
    
    @Override
    protected ShapeFactory createFactory() {
        return new ShapeFactoryAwt();
    }

    @Override
    void run() {
        AwtCanvas jc = new AwtCanvas(this);

        jc.setBackground(Color.WHITE);
        jc.setPreferredSize(new Dimension(500, 500));
        
        new AwtMouseEvents(jc); //gestion du click
        
        GUIHelper.showOnFrame(jc, "XShape Swing/AWT Rendering");        
    }

}


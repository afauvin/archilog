package xshape;

import java.awt.*;

import Windows.AwtWindow;
import Windows.Windows;
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
        JCanvas jc = new JCanvas(this);

        jc.setBackground(Color.WHITE);
        jc.setPreferredSize(new Dimension(500, 500));
        
       
        new AwtMouseClickManagement(jc); //gestion du click
        new AwtMoveShape(jc); //gestion du déplacement des formes
        GUIHelper.showOnFrame(jc, "XShape Swing/AWT Rendering");        
    }
}


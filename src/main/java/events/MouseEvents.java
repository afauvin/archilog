package events;

import xshape.XShape;
import xshape.AwtApp;
import xshape.JCanvas;

import java.awt.event.*;

public abstract class MouseEvents extends MouseAdapter{

    private XShape xs;
    private JCanvas jc;
    private AwtApp awtapp;

    public MouseEvents (XShape shape)
    {
        super();
        this.xs = shape;
        this.jc = new JCanvas(this.xs);
        this.awtapp = new AwtApp();
        this.awtapp.setAwtCanvas(jc);
    }

    public void awtMouseClick()
    {                
        jc.addMouseListener(this);
    }
    
}

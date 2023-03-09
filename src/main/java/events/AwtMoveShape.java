package events;

import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.*;

import ui.shapes.Shape;
import xshape.AwtCanvas;

import java.awt.geom.Point2D;

public class AwtMoveShape extends MouseAdapter  {

    protected Shape drawable;
    //protected JCanvas canvas;
    protected AwtCanvas canvas;
    
    public AwtMoveShape(AwtCanvas canvas) {
        super();
        this.canvas = canvas;
        canvas.addMouseListener(this);
        canvas.addMouseMotionListener(this);
    }

    
    public void mouseDragged(MouseEvent e) {
        Shape tmp;
        if (drawable != null) {
            tmp = drawable.position(new Point2D.Double(e.getX(),e.getY()));  
            this.canvas.repaint();
        }
    }

    
    public void mousePressed(MouseEvent e) {
        List selectedDrawables = this.canvas.getDrawables().findDrawables(new Point2D.Double(e.getX(), e.getY()) ); 
        if (selectedDrawables.size() == 0)
            return;
        drawable = (Shape) selectedDrawables.get(0);
    }

    public void mouseReleased(MouseEvent e) {
        drawable = null;
    }

}
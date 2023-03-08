package events;

import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.*;
import xshape.JCanvas;

import ui.shapes.Shape;
import java.awt.geom.Point2D;

public class AwtMoveShape extends MouseAdapter  {

    protected Shape drawable;
    protected JCanvas canvas;
    
    public AwtMoveShape(JCanvas canvas) {
        super();
        this.canvas = canvas;
        canvas.addMouseListener(this);
        canvas.addMouseMotionListener(this);
    }

    
    public void mouseDragged(MouseEvent e) {
        Shape tmp;
        if (drawable != null) {
            tmp = drawable.position(new Point2D.Double(e.getX(),e.getY()));  
            canvas.repaint();
        }
    }

    
    public void mousePressed(MouseEvent e) {
        List selectedDrawables = canvas.findDrawables(new Point2D.Double(e.getX(), e.getY()) ); 
        if (selectedDrawables.size() == 0)
            return;
        drawable = (Shape) selectedDrawables.get(0);
    }

    public void mouseReleased(MouseEvent e) {
        drawable = null;
    }

}
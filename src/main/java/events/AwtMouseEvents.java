package events;

import java.util.List;

import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.event.*;

import ui.shapes.Shape;
import ui.shapes.awt.RectangleAwt;
import xshape.AwtCanvas;

import java.awt.geom.Point2D;


public class AwtMouseEvents extends MouseAdapter {

    protected Shape drawable;
    protected AwtCanvas canvas;

    public AwtMouseEvents(AwtCanvas canvas) {
        super();
        this.canvas = canvas;
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            leftClickAction(e);
        } else {
            rightClickAction(e);
        }
    }

    public void rightClickAction(MouseEvent e) {
        Shape rect = createDrawable(e);
        this.canvas.getDrawables().addDrawable(rect);
        this.canvas.repaint(); 
    }


     /* left clicks management */
     public void leftClickAction(MouseEvent e) {

    }
    /* function that returns a new rectangle awt of fixed size (100 * 50) */
    public Shape createDrawable(MouseEvent e) {
        return new RectangleAwt(e.getX(), e.getY(), 100, 50) ;
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

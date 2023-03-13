package events;

import java.util.List;

import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.event.*;

import ui.shapes.Drawables;
import ui.shapes.Shape;
import ui.shapes.awt.RectangleAwt;
import xshape.AwtCanvas;

import java.awt.geom.Point2D;


public class AwtMouseEvents extends MouseAdapter implements ItfMouseEvents {

    private Shape drawable;
    private AwtCanvas canvas;
    private MouseEvents absMe;

    public AwtMouseEvents(AwtCanvas canvas) {
        super();
        this.canvas = canvas;
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.absMe = new MouseEvents(canvas);
    }


    public Drawables getDrawablesWin()
    {
        return this.absMe.getDrawablesWin();
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
   
//    public void mouseDragged(MouseEvent e) {
//        Shape tmp;
//        if (drawable != null) {
//            tmp = drawable.position(new Point2D.Double(e.getX(),e.getY()));  
//            this.canvas.repaint();
//        }
//    }

    public void mouseDragged(MouseEvent e) {
        this.absMe.mouseDragged(e.getX(), e.getY());
        this.canvas.repaint();
    }
    
   // public void mousePressed(MouseEvent e) {
   //     List selectedDrawables = this.canvas.getDrawables().findDrawables(new Point2D.Double(e.getX(), e.getY()) ); 
   //     if (selectedDrawables.size() == 0)
   //         return;
   //     drawable = (Shape) selectedDrawables.get(0);
   // }

    public void mousePressed(MouseEvent e) {
        this.absMe.mousePressed(e.getX(), e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        drawable = null;
    }

    @Override
    public void mouseClicked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void rightClickAction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rightClickAction'");
    }

    @Override
    public void leftClickAction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leftClickAction'");
    }

    @Override
    public Shape createDrawable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDrawable'");
    }



    @Override
    public void mouseReleased() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }


    @Override
    public void mouseDragged(double posX, double posY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }


    @Override
    public void mousePressed(double posX, double posY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

       


}

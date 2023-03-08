package xshape;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import ui.shapes.Shape;

import java.awt.geom.Point2D;
import javax.swing.*;

public class JCanvas extends JPanel {

    XShape xshape = null;
    private List drawables = new LinkedList();

    public JCanvas(XShape xs) {
        this.xshape = xs;
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        AwtContext.instance().graphics(g);
        this.xshape.draw();

        //AF ajout de ces deux formes de bases dans notre itérateur, ce qui va permettre de les faire bouger via les mouvelents de souris
        for (Shape theShape:this.xshape.shapes)
        {
            this.addDrawable(theShape);
        }

        for (Iterator iter = drawables.iterator(); iter.hasNext();) {
            Shape d = (Shape) iter.next();
           d.draw();    
        } 
    }

        public void addDrawable(Shape theShape) {
            drawables.add(theShape);
            repaint();
        }

        public void removeDrawable(Shape d) {
            drawables.remove(d);
            repaint();
        }

        public void clear() {
            drawables.clear();
            repaint();
        }

        public List findDrawables(Point2D p) {
            List l = new ArrayList();
            for (Iterator iter = drawables.iterator(); iter.hasNext();) {
                Shape element = (Shape) iter.next();
                //if(element.equals(p)){
                //if (element.position().getX() < p.getX() && (element.position().getX() + element.size().getX() < p.getX()) ) 
                if (( element.position().getX() - ( element.size().getX() / 2 ) <= p.getX() ) && ( element.position().getX() + ( element.size().getX() / 2 ) >= p.getX() ) )
                {
                    if (( element.position().getY() - ( element.size().getY() / 2 ) <= p.getY() ) && ( element.position().getY() + ( element.size().getY() / 2 ) >= p.getY() ) )
                    {
                        l.add(element);
                    }
                }

                        
            }
            return l;

        }

        public boolean isFree(Rectangle rect) {
            for (Iterator iter = drawables.iterator(); iter.hasNext();) {
                Shape element = (Shape) iter.next();
               // if(element.getRectangle().intersects(rect)){
               //     return false;
               // }
            }
            return true;
        }

        public boolean isAlone(Shape drawable) {
            // Rectangle rect = drawable.getRectangle();
             for (Iterator iter = drawables.iterator(); iter.hasNext();) {
                 Shape element = (Shape) iter.next();
             //    if(!element.equals(drawable) &&  element.getRectangle().intersects(rect)) {
             //        return false;
             //    }
             }
             return true;
         }
}
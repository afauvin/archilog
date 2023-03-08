package ui.shapes;

import java.util.LinkedList;
import java.util.List;

import javafx.scene.Group;
import javafx.scene.Scene;
import xshape.JfxScene;

import java.util.ArrayList;
import java.util.Iterator;

import java.awt.geom.Point2D;

public class Drawables implements ItfDrawables{

    private List drawables = new LinkedList();

    public void addDrawable(Shape theShape) {
        drawables.add(theShape);
        //repaint();        
    }

    public void removeDrawable(Shape d) {
        drawables.remove(d);
//        repaint();
    }

    public void clear() {
        drawables.clear();
//        repaint();
    }

    public List findDrawables(Point2D p) {
        List l = new ArrayList();
        for (Iterator iter = drawables.iterator(); iter.hasNext();) {
            Shape element = (Shape) iter.next();

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

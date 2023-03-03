package xshape;

import java.awt.*;
import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import java.awt.geom.Point2D;
import javafx.scene.input.MouseEvent;

class GUIHelper {
    public static void showOnFrame(JComponent component, String frameName) {
        JFrame frame = new JFrame(frameName);
       
        WindowAdapter wa = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        };
 //       frame.addMouseListener();
        frame.addWindowListener(wa);
        frame.getContentPane().add(component);
        frame.pack();

        frame.setVisible(true);
    }
}



public class AwtApp extends XShape {
    
    
    class JCanvas extends JPanel {
        XShape _xshape = null;
        private List drawables = new LinkedList();

        public JCanvas(XShape xs) {
            _xshape = xs;
        }
        public void paint(Graphics g) {
            super.paint(g);
            AwtContext.instance().graphics(g);
            _xshape.draw();  //AF ca créé dans la classe Xshape les deux carrés de bases qui seront rangés dans un tableau de shapes

           //AF ajout de ces deux formes de bases dans notre itérateur, ce qui va permettre de les faire bouger via les mouvelents de souris
            for (Shape theShape:_xshape._shapes)
           {
                this.addDrawable(theShape);
           }

            for (Iterator iter = drawables.iterator(); iter.hasNext();) {
                Shape d = (Shape) iter.next();
                d.draw();    
            }        
        }

        public void addDrawable(Shape d) {
            drawables.add(d);
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
    
    @Override
    protected ShapeFactory createFactory() {
        return new ShapeFactoryAwt();
    }

    @Override
    void run() {
        JCanvas jc = new JCanvas(this);
        jc.setBackground(Color.WHITE);
        new SimpleMouseListener(jc);  //gestion simple de la souris sur le canvas
        new MoveDrawableMouseListener(jc);  //gestion un peu plus complexe de la souris sur le canvas
        jc.setPreferredSize(new Dimension(500, 500));
        GUIHelper.showOnFrame(jc, "XShape Swing/AWT Rendering");         
    }

    public void mousePressed(MouseEvent e) {  
      System.out.printf("Bouton %s pressé sur le nœud");  
    }  


}


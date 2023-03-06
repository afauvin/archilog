package xshape;

import java.awt.Point;
import java.awt.event.MouseEvent;

import java.awt.event.*;
import xshape.AwtApp.JCanvas;
import javax.swing.SwingUtilities;


public class AwtMouseClickManagement extends MouseAdapter {

    protected JCanvas canvas;

    public AwtMouseClickManagement(JCanvas canvas) {
        super();
        this.canvas = canvas;
        canvas.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            leftClickAction(e);
        } else {
            rightClickAction(e);
        }
    }

    protected void rightClickAction(MouseEvent e) {
        Point p = e.getPoint();
        Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
            canvas.addDrawable(rect);
        //}
    }


     /* left clicks management */
    protected void leftClickAction(MouseEvent e) {
        //Point p = e.getPoint();
        //Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
        //    canvas.addDrawable(rect);
        //}

    }


    /* function that returns a new rectangle awt of fixed size (100 * 50) */
    private Shape createDrawable(MouseEvent e) {
        return new RectangleAwt(e.getX(), e.getY(), 100, 50) ;
    }


//    protected void rightClickAction(MouseEvent e) {
//        System.out.printf("Right click\n");
//    }

//    protected void leftClickAction(MouseEvent e) {
//        System.out.printf("left click\n");

//    }


}
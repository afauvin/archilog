package xshape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

import javafx.geometry.Point2D;
import xshape.AwtApp.JCanvas;

public class SimpleMouseListener extends JCanvasMouseListener {

    public SimpleMouseListener(JCanvas canvas) {
        super(canvas);

    }

    protected void rightClickAction(MouseEvent e) {
        Point p = e.getPoint();
        Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
            canvas.addDrawable(rect);
        //}
    }

    protected void leftClickAction(MouseEvent e) {
        //Point p = e.getPoint();
        //Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
        //    canvas.addDrawable(rect);
        //}

    }

    //Il faut CREER UN NOUVEAU RECTANGLE POUR LE CLICK DROIT
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
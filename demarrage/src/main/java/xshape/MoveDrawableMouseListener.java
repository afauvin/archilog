package xshape;

import java.awt.event.MouseEvent;
import java.util.List;

import java.awt.geom.Point2D;
import xshape.AwtApp.JCanvas;

public class MoveDrawableMouseListener extends JCanvasMouseAdapter {

    //protected IMovableDrawable drawable;
    protected Shape drawable;

    
    public MoveDrawableMouseListener(JCanvas canvas) {
        super(canvas);
    }

    
    public void mouseDragged(MouseEvent e) {
        Shape tmp;
        if (drawable != null) {
            tmp = drawable.position(new Point2D.Double(e.getX(),e.getY()));   //FAIRE un point 2D
            canvas.repaint();
        }
    }

    
    public void mousePressed(MouseEvent e) {
        List selectedDrawables = canvas.findDrawables(new Point2D.Double(e.getX(), e.getY()) ); //FAIRE UN POINT 2D
        if (selectedDrawables.size() == 0)
            return;
        drawable = (Shape) selectedDrawables.get(0);
    }

    public void mouseReleased(MouseEvent e) {
        drawable = null;
    }

}
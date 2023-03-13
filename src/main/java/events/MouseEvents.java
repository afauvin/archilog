package events;

import ui.shapes.Drawables;
import ui.shapes.Shape;
import xshape.AbsWindows;
import java.awt.geom.Point2D;
import java.util.List;

public class MouseEvents implements ItfMouseEvents {
    
    private AbsWindows win;
    private Shape drawable;

    public MouseEvents(AbsWindows windows)
    {
        super();
        this.win = windows;
    }

    public Drawables getDrawablesWin()
    {
        return this.win.getDrawables();
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


    public Shape mouseDragged(double posX, double posY) {
        Shape tmp;
        tmp = this.drawable.position(new Point2D.Double(posX, posY));  
        return tmp;
    }


    public void mousePressed(double posX, double posY) {
        List selectedDrawables = this.win.getDrawables().findDrawables(new Point2D.Double(posX, posY) ); 
        if (selectedDrawables.size() == 0)
            return;
        this.drawable = (Shape) selectedDrawables.get(0);
    }

    @Override
    public void mouseReleased() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }


}

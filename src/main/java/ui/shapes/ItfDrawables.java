package ui.shapes;

import java.util.List;

import java.awt.geom.Point2D;

public interface ItfDrawables {

    public void addDrawable(Shape theShape) ;

    public void removeDrawable(Shape d) ;

    public void clear() ;

    public List findDrawables(Point2D p) ;

    public boolean isFree(Rectangle rect) ;

    public boolean isAlone(Shape drawable) ;
    
    
}

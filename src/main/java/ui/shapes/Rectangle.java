package ui.shapes;

import java.awt.geom.Point2D;

public abstract class Rectangle implements Shape {
    private Point2D pos  = new Point2D.Double(0, 0);
    private Point2D size = new Point2D.Double(1, 1);
    
    @Override
    public Point2D size() {
        return (Point2D) this.size.clone();
    }

    @Override
    public Shape size(Point2D vec) {
        this.size = (Point2D) vec.clone();
        return this;
    }

    @Override
    public Point2D position() {
        return (Point2D) this.pos.clone();
    }

    @Override
    public Shape position(Point2D position) {
        this.pos = (Point2D) position.clone();
        return this;
    }

    @Override
    public Shape translate(Point2D vec) {
        this.pos.setLocation(this.pos.getX() + vec.getX(),
                this.pos.getY() + vec.getY());
        return this;
    }
}

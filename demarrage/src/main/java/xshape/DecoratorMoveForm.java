package xshape;

import java.awt.geom.Point2D;

public class DecoratorMoveForm implements Shape{

private Shape shape;

public DecoratorMoveForm(Shape shape){
    this.shape = shape;
}

    public void draw() {
        this.shape.draw();
    }


    public Point2D size() {
        return this.shape.size();
    }


    public Shape size(Point2D vec) {
        return this.shape.size(vec);
    }

    public Point2D position() {
        return this.shape.position();
    }


    public Shape position(Point2D position) {
        return this.shape.position(position);
    }


    public Shape translate(Point2D vec) {
        return this.shape.translate(vec);
    }
    
    
}

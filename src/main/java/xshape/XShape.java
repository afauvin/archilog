package xshape;

import java.awt.geom.Point2D;

import ui.factories.ShapeFactory;
import ui.shapes.Shape;

public abstract class XShape {

    private ShapeFactory factory = null;
    Shape[] shapes = null;

    //method factory to delegate instanciation of Shapefactory to subclass
    protected abstract ShapeFactory createFactory();
    //Handler to start the GUI
    abstract void run();

    private void createScene() {
        Shape shape = this.factory.createRectangle(100, 100, 50, 50);
        Shape shape2 = this.factory.createRectangle(250, 250, 75, 20);
        shape.translate(new Point2D.Double(100, 50));
        Shape[] tmp = { shape, shape2 };
        this.shapes = tmp;
    }

    public void draw() {
        if (this.shapes == null) {
            this.factory = createFactory();
            createScene();
        }

        for (Shape s : this.shapes)
            s.draw();
    }

}

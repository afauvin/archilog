package ui.factories.awt;

import ui.factories.ShapeFactory;
import ui.shapes.Rectangle;
import ui.shapes.awt.RectangleAwt;

public class ShapeFactoryAwt implements ShapeFactory {

    /**
     * Constructor
     */
    public ShapeFactoryAwt() {
    }

    /**
     * Rectangle creation
     */
    @Override
    public Rectangle createRectangle(double posX, double posY, 
    double height, double width) {
        return new RectangleAwt(posX, posY, height, width);
    }
}

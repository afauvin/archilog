package ui.factories.javaFx;

import javafx.scene.Group;
import ui.factories.ShapeFactory;
import ui.shapes.Rectangle;
import ui.shapes.javaFx.RectangleFx;

public class ShapeFactoryFx implements ShapeFactory {
    Group grp;

    /**
     * Constructor
     * @param root
     */
    public ShapeFactoryFx(Group root) {
        this.grp = root;
    }

    /**
     * Rectangle creation
     */
    @Override
    public Rectangle createRectangle(double posX, double posY, 
    double height, double width) {
        return new RectangleFx(posX, posY, height, width, grp);
    } 
}

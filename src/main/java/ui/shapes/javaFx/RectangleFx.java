package ui.shapes.javaFx;

import java.awt.geom.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import ui.shapes.Rectangle;

public class RectangleFx extends Rectangle {

	javafx.scene.shape.Rectangle adapted = new javafx.scene.shape.Rectangle();
    Group grp = null;

	public RectangleFx(double posX, double posY, double height, double width, Group grp) {
		position(new Point2D.Double(posX, posY));
		size(new Point2D.Double(width, height));
		this.grp = grp;
		this.grp.getChildren().add(this.adapted);
	}

	@Override
	public void draw() {
		Point2D pos = position();
		Point2D size = size();
		this.adapted.setX(pos.getX()- size.getX()/2);
		this.adapted.setY(pos.getY()- size.getY()/2);
		this.adapted.setWidth(size.getX());
		this.adapted.setHeight(size.getY());
		this.adapted.setFill(Color.BLUE);
	}
}

package xshape;

import java.awt.geom.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class RectangleFx extends Rectangle {

	javafx.scene.shape.Rectangle _adapted = new javafx.scene.shape.Rectangle();
    Group _grp = null;

	public RectangleFx(double posX, double posY, double height, double width, Group grp) {
		position(new Point2D.Double(posX, posY));
		size(new Point2D.Double(width, height));
		_grp = grp;
		_grp.getChildren().add(_adapted);
	}

	@Override
	public void draw() {
		Point2D pos = position();
		Point2D size = size();
		_adapted.setX(pos.getX()- size.getX()/2);
		_adapted.setY(pos.getY()- size.getY()/2);
		_adapted.setWidth(size.getX());
		_adapted.setHeight(size.getY());
		_adapted.setFill(Color.BLUE);

		//ajout evenement mouse dragged
		_adapted.setOnMouseDragged(mouseEvent -> {
			_adapted.setX(mouseEvent.getX()) ;
			_adapted.setY(mouseEvent.getY());
		}); 
//		_adapted.setOnMouseClicked(mouseEvent -> System.out.printf("Bouton %s cliqué sur le nœud, %d click(s) %f x %f.", mouseEvent.getButton(), mouseEvent.getClickCount(), mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMouseDragged(mouseEvent -> System.out.printf("La souris effectue un cliquer-tirer sur le nœud %f x %f.", mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMouseEntered(mouseEvent -> System.out.printf("La souris entre sur le nœud %f x %f.", mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMouseExited(mouseEvent -> System.out.printf("La souris sort du nœud %f x %f.", mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMouseMoved(mouseEvent -> System.out.printf("La souris se déplace sur le nœud %f x %f.", mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMousePressed(mouseEvent -> System.out.printf("Bouton %s pressé sur le nœud %f x %f.", mouseEvent.getButton(), mouseEvent.getX(), mouseEvent.getY()).println()); 
//        _adapted.setOnMouseReleased(mouseEvent -> System.out.printf("Bouton %s relâché sur le nœud %f x %f.", mouseEvent.getButton(), mouseEvent.getX(), mouseEvent.getY()).println()); 
	}
}

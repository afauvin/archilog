package ui.shapes.awt;

import java.awt.geom.Point2D;

import ui.shapes.Rectangle;
import xshape.AwtContext;

import java.awt.*;

public class RectangleAwt extends Rectangle {

	/**
	 * Constructor
	 * @param posX
	 * @param posY
	 * @param height
	 * @param width
	 */
	public RectangleAwt(double posX, double posY, double height, double width) {
		super.position(new Point2D.Double(posX, posY));
		super.size(new Point2D.Double(width, height));
	}

	/**
	 * Drawing the rectangle
	 */
	@Override
	public void draw() {
        Graphics g = AwtContext.instance().graphics();
        Color c = g.getColor();
		Point2D pos = position();
		Point2D size = size();
        g.setColor(Color.BLUE);
        g.fillRect((int)(pos.getX() - size.getX()/2),
        (int)(pos.getY() - size.getY()/2),        
        (int)(size.getX()),
        (int)(size.getY()));
        g.setColor(c);
	}

}

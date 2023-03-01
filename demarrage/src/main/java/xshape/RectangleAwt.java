package xshape;

import java.awt.geom.Point2D;
import java.awt.*;

public class RectangleAwt extends Rectangle {


	int nbClick = 0;


	public RectangleAwt(double posX, double posY, double height, double width) {
		super.position(new Point2D.Double(posX, posY));
		super.size(new Point2D.Double(width, height));
	}





	@Override
	public void draw() {
//		int xnew=0;
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
		
 
//fonctionne mais pas en dynamique --> il faudrait etre capable de faire un repaint
//		while (xnew < 100 ){
//			g.fillRect((int)(pos.getX() + xnew - size.getX()/2),
//			(int)(pos.getY() - size.getY()/2),        0
//			(int)(size.getX() +xnew),
//			(int)(size.getY()));
//			++xnew;
//		}


        
	}


}

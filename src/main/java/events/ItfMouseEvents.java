package events;

import ui.shapes.Shape;

public interface ItfMouseEvents {

    public void mouseClicked() ;
    public void rightClickAction();
    public void leftClickAction();
    public Shape createDrawable();
    public Shape mouseDragged(double posX, double posY);
    public void mousePressed(double posX, double posY);
    public void mouseReleased();
}

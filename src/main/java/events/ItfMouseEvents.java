package events;

import org.w3c.dom.events.MouseEvent;

import ui.shapes.Shape;

public interface ItfMouseEvents {

    public void mouseClicked(MouseEvent e) ;
    public void rightClickAction(MouseEvent e);
    public void leftClickAction(MouseEvent e);
    public Shape createDrawable(MouseEvent e);
    public void mouseDragged(MouseEvent e);
    public void mousePressed(MouseEvent e);
    public void mouseReleased(MouseEvent e);
}

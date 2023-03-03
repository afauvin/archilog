package xshape;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.w3c.dom.events.MouseEvent;
import xshape.AwtApp.JCanvas;

public class JCanvasMouseAdapter extends JCanvasMouseListener implements MouseMotionListener{

    public JCanvasMouseAdapter(JCanvas canvas) {
        super(canvas);
        canvas.addMouseMotionListener(this);
        
    }
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
    }

}
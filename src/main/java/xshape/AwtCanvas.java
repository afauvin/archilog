package xshape;

import java.util.Iterator;

import events.AwtMouseEvents;

import java.awt.*;

import ui.shapes.Shape;
import ui.shapes.Drawables;

//public class AwtCanvas extends JPanel {
public class AwtCanvas extends AbsWindows {

    private XShape xshape = null;
    private Drawables drawables;

    public AwtCanvas(XShape xs) {
        this.xshape = xs;
        this.drawables = new Drawables();
    }

    public AwtCanvas getWindow(){
        return this;
    }

    public Drawables getDrawables()
    {
        return this.drawables;
    }

    public void paint(Graphics g) {
        super.paint(g);
        AwtContext.instance().graphics(g);
        
        
        this.xshape.draw(); 

        /* Allows you to redraw everything in the array of drawables */
        for (Iterator iter = this.drawables.getDrawablesList().iterator(); iter.hasNext();) {
            Shape d = (Shape) iter.next();
           d.draw();    
        } 

        //AF ajout de ces deux formes de bases dans notre itérateur, ce qui va permettre de les faire bouger via les mouvelents de souris
 //       for (Shape theShape:this.xshape.shapes)
 //       {
 //           this.addDrawable(theShape);
 //       }

    }


}
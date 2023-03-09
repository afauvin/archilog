package events;

import java.util.List;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import ui.shapes.Drawables;
import ui.shapes.Shape;
import ui.shapes.javaFx.RectangleFx;
import xshape.FxApplication;
import xshape.JfxScene;

import java.awt.geom.Point2D;

public class JfxMouseEvents {
    private Shape drawable;
    private JfxScene jfxscene;

    private Drawables drawables;

    
    public JfxMouseEvents(JfxScene jfxscene) {
        //super(jfxscene);
        super();

        this.drawables = jfxscene.getDrawables();
        this.jfxscene = jfxscene;
        //this.drawables = super.getDrawablesWin();
    }       

    public void mouseDragged(MouseEvent e) {
        this.jfxscene.getWindow().setOnMouseDragged(mouseEvent -> {            
                Shape tmp;
                if (drawable != null) {
                    tmp = drawable.position(new Point2D.Double(mouseEvent.getX(),mouseEvent.getY()));  
                    tmp.draw();
                }
            });
        }
   
    public void mousePressed(MouseEvent e) {
            this.jfxscene.getWindow().setOnMousePressed(mouseEvent -> {
                System.out.printf("Bouton %s cliqué sur le nœud, %d click(s) %f x %f.", mouseEvent.getButton(), mouseEvent.getClickCount(), mouseEvent.getX(), mouseEvent.getY()).println();
                List selectedDrawables = this.drawables.findDrawables(new Point2D.Double(mouseEvent.getX(), mouseEvent.getY()) ); 
                if (selectedDrawables.size() == 0)
                    return;
                drawable = (Shape) selectedDrawables.get(0);     
        });
    }

    public void mouseReleased(MouseEvent e) {
        drawable = null;
    }



    public void mouseClicked(MouseEvent e) {
        this.jfxscene.getWindow().setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                leftClickAction(mouseEvent);
            } else {
                rightClickAction(mouseEvent);
            }
        });
    }

    public void rightClickAction(MouseEvent e) {
        Shape rect = createDrawable(e);
        rect.draw();
        this.jfxscene.getDrawables().addDrawable(rect);
    }


     /* left clicks management */
     public void leftClickAction(MouseEvent e) {
    }


    /* function that returns a new rectangle awt of fixed size (100 * 50) */
    public Shape createDrawable(MouseEvent e) {
        return new RectangleFx(e.getX(), e.getY(), 100, 50, FxApplication.root);
    }
 
}

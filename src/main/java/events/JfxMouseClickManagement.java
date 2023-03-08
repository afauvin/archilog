package events;

import javax.swing.SwingUtilities;

import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import ui.shapes.*;
import ui.shapes.javaFx.RectangleFx;
import xshape.FxApplication;
import xshape.JfxScene;
import javafx.scene.input.MouseEvent;

public class JfxMouseClickManagement {

    private Scene scene;
    private JfxScene jfxscene;

    public JfxMouseClickManagement(JfxScene jfxscene) {
        super();
        this.scene = jfxscene.getWindow();
        this.jfxscene = jfxscene;
    }

    public void mouseClicked(MouseEvent e) {
        this.scene.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                leftClickAction(mouseEvent);
            } else {
                rightClickAction(mouseEvent);
            }
        });
    }

    protected void rightClickAction(MouseEvent e) {
        //Point p = e.getPoint();
        Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
            rect.draw();
            this.jfxscene.getDrawables().addDrawable(rect);
        //}
    }


     /* left clicks management */
    protected void leftClickAction(MouseEvent e) {
        //Point p = e.getPoint();
        //Shape rect = createDrawable(e);
        //if (canvas.isFree(rect.getRectangle())) {   /// FONCTION NE MARCHE PAS
        //    canvas.addDrawable(rect);
        //}

    }


    /* function that returns a new rectangle awt of fixed size (100 * 50) */
    private Shape createDrawable(MouseEvent e) {
        return new RectangleFx(e.getX(), e.getY(), 100, 50, FxApplication.root);
    }


//    protected void rightClickAction(MouseEvent e) {
//        System.out.printf("Right click\n");
//    }

//    protected void leftClickAction(MouseEvent e) {
//        System.out.printf("left click\n");

//    }
    
}

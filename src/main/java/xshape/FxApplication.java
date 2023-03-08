package xshape;
import events.JfxMouseClickManagement;
import events.JfxMoveShape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;

public class FxApplication extends Application {
    public static Group root = new Group ();
    public static JfxScene jfxWindow;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("XShape JavaFx Rendering");
        //Scene scene = new Scene(root, 500, 500);
        
        //ajout evenement sur la scene
        this.jfxWindow = new JfxScene(root, 500, 500);
        JfxMoveShape mouseMouve = new JfxMoveShape(jfxWindow);
        JfxMouseClickManagement mouseClick = new JfxMouseClickManagement(jfxWindow);
        mouseMouve.mousePressed(null);
        mouseMouve.mouseDragged(null);

        mouseClick.mouseClicked(null);
        
        //primaryStage.setScene(scene);
        primaryStage.setScene(jfxWindow.getWindow());
        primaryStage.show();
    }
}
package xshape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxApplication extends Application {
    public static Group root = new Group ();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("XShape JavaFx Rendering");
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
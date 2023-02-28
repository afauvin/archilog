import javafx.application.Application;
import javafx.scene.web.WebView;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class BuilderJfx extends Application implements BuilderWindows{

    private Stage primaryStage;
    private Group root;

    
    public void createNewWindows() {
        primaryStage.setMinHeight(500); //virer les magics numbers
		primaryStage.setMinWidth(1000); //virer les magics numbers
    }

    public void showWindow(){
       launch();
       //start(primaryStage);
    }


    public void createRectangle(){
        Rectangle rectangle = new Rectangle(0, 0, 50, 50);
        this.root = new Group(rectangle);
        Scene scene = new Scene(this.root, 595, 300, Color.BEIGE);
        primaryStage.setTitle("Drawing Rectangle");
        primaryStage.setScene(scene);
    }

    public void moveRectangle(){

    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setMinHeight(500); //virer les magics numbers
        primaryStage.setMinWidth(1000); //virer les magics numbers
        
        //Rectangle rectangle = new Rectangle(0, 0, 50, 50);
        //this.root = new Group(rectangle);

        //if (this.root != null)
        //{
        //    Scene scene = new Scene(this.root, 595, 300, Color.BEIGE);
        //    primaryStage.setTitle("Drawing Rectangle");
        //    primaryStage.setScene(scene);
        //}
        

        primaryStage.show();
    }

    
}

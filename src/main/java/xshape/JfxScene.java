package xshape;

import javafx.scene.Group;
import javafx.scene.Scene;
import ui.shapes.Drawables;

public class JfxScene {
    
    private Scene scene;
    private Drawables drawables;
     
    public JfxScene(Group root, double wdt, double hgt)
    {
        this.scene = new Scene(root, 500, 500);
        this.drawables = new Drawables();
    }

    public Scene getWindow(){
        return this.scene;
    }

    public Drawables getDrawables()
    {
        return this.drawables;
    }

    public void setScene(Scene scene)
    {
        this.scene = scene;
    }
    
}

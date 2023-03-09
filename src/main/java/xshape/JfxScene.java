package xshape;

import javafx.scene.Group;
import javafx.scene.Scene;

public class JfxScene extends AbsWindows{
    
    private Scene scene;
    //private Drawables drawables;
     
    public JfxScene(Group root, double wdt, double hgt)
    {
        this.scene = new Scene(root, 500, 500);
        //this.drawables = new Drawables();
    }

    public Scene getWindow(){
        return this.scene;
    }



    //public Drawables getDrawables()
    //{
    //    return this.drawables;
    //}

    
}

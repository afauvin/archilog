package xshape;

import javax.swing.JPanel;

import ui.shapes.Drawables;


public abstract class AbsWindows extends JPanel  implements ItfWindows{

    private Drawables drawables;

    public AbsWindows(){
        this.drawables = new Drawables();
    }


    public Drawables getDrawables()
    {
        return this.drawables;
    }
    
}

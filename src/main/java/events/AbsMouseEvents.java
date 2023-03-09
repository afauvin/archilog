package events;


import ui.shapes.Drawables;
import xshape.AbsWindows;

public abstract class AbsMouseEvents implements ItfMouseEvents {
    
    private AbsWindows win;

    public AbsMouseEvents(AbsWindows windows)
    {
        super();
        this.win = windows;
    }

    public Drawables getDrawablesWin()
    {
        return this.win.getDrawables();
    }

}

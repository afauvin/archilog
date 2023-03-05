package xshape;

import java.awt.Graphics;

import javax.management.RuntimeErrorException;
/*
* Singleton to share Graphics between all AWT implementation and to 
* prevent to poluate the Shape interface.
*/
public class AwtContext {

    static private AwtContext singleton = null;

    private Graphics graphics = null;

    /**
     * [SINGLETON]Intstance
     * @return 
     */
    static public AwtContext instance() {
        if (singleton == null)
            singleton = new AwtContext();
        return singleton;
    }

    /**
     * Default constructor
     */
    private AwtContext() {
    }

    /**
     * Graphic list
     * @return
     */
    public Graphics graphics() {
        if (graphics == null) 
            throw new RuntimeErrorException(null, "Graphics has not been set contex is not valid");
        return graphics;
    }
  
    /**
     * Graphics setter
     * @param g
     * @return
     */
    public AwtContext graphics(Graphics g) {
        graphics = g;
        return this;
    }
}

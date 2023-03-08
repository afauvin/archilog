package events;

import xshape.XShape;

public abstract class MouseEvents {

    private XShape xs;

    public MouseEvents (XShape shape)
    {
        this.xs = shape;
    }
    
}

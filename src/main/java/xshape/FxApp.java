package xshape;

import ui.factories.ShapeFactory;
import ui.factories.javaFx.ShapeFactoryFx;

public class FxApp extends XShape {

    @Override
    protected ShapeFactory createFactory() {
        return new ShapeFactoryFx(FxApplication.root);
    }
    @Override
    void run() {
        draw();
        FxApplication.launch(FxApplication.class);
    }
}
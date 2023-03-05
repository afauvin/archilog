package ui.factories;

import ui.shapes.Rectangle;

public interface ShapeFactory {
    Rectangle createRectangle(double posX, double posY, double height, double width);
}


package ru.kpfu.itis.group907.Baybikov.screens.classes;

import javafx.geometry.Orientation;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;


public class Stick extends Rectangle {
    private final int HEIGHT = 2;
    private final int WIDTH = 25;

    public Stick(Orientation orientation) {
        if (orientation == Orientation.HORIZONTAL) {
            super.setHeight(HEIGHT);
            super.setWidth(WIDTH);
        }
        else {
            super.setHeight(WIDTH);
            super.setWidth(HEIGHT);
        }

        super.setFill(Color.BLACK);
    }
}

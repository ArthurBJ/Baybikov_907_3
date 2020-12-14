package ru.kpfu.itis.group907.Baybikov.screens.classes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Dot extends Circle {
    private final double RADIUS = 1;
    private final Color color = Color.BLACK;

    public Dot() {
        super.setRadius(RADIUS);
        super.setFill(color);
    }
}

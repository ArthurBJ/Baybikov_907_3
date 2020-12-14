package ru.kpfu.itis.group907.Baybikov.gameplay.models;

import java.util.ArrayList;


public class Ship {
    private int length;
    private ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    public Ship(int length, ArrayList<Coordinates> coordinates) {
        this.length = length;
        this.coordinates = coordinates;
    }

    public int getLength() {
        return length;
    }

    public ArrayList<Coordinates> getCoordinates() {
        return coordinates;
    }
}

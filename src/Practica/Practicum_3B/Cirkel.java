package Practica.Practicum_3B;

import java.text.MessageFormat;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        if (rad < 1) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
    }

    @Override
    public String toString() {
        return String.format("cirkel (%1$s, %2$s) met radius: %3$s", xPositie, yPositie, radius);
    }
}

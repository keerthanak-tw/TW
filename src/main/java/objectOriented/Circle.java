package objectOriented;

import processing.core.PApplet;

public class Circle {
    private final int height;
    private final int speed;
    private final int diameter;
    private final processing.core.PApplet PApplet;
    private int position;

    public Circle(int height, int speed, int diameter, PApplet PApplet) {
        this.height = height;
        this.speed = speed;
        this.diameter = diameter;
        this.position = 0;
        this.PApplet = PApplet;
    }

    public void draw() { PApplet.ellipse(position, height, diameter, diameter); }

    public void move() { position += speed; }
}

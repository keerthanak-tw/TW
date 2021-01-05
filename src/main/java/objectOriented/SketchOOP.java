package objectOriented;

import processing.core.PApplet;

public class SketchOOP extends PApplet {

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private static final int DIAMETER = 10;
    private static final Circle[] circle = new Circle[4];

    public static void main(String[] args){
        PApplet.main("objectOriented.SketchOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 0; i < 4; i++) {
            circle[i] = new Circle(HEIGHT*(i+1)/5, i+1, DIAMETER, this);
        }
    }

    @Override
    public void draw() {
        drawCircle();
        moveCircle();
    }

    private void drawCircle() {
        for (int i = 0; i < 4; i++) {
            circle[i].draw();
        }
    }

    private void moveCircle() {
        for (int i = 0; i < 4; i++) {
            circle[i].move();
        }
    }
}

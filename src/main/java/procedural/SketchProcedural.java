package procedural;

import processing.core.PApplet;

public class SketchProcedural extends PApplet {

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private static final int DIAMETER = 10;
    private final int[] height = new int[4];
    private final int[] speed = new int[4];
    private final int[] position = new int[4];

    public static void main(String[] args){
        PApplet.main("procedural.SketchProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    private void heightInitialisation() {
        for (int i = 0; i < 4; i++) {
            height[i] = HEIGHT * (i+1) / 5;
        }
    }

    private void speedInitialisation() {
        for (int i = 0; i < 4; i++) {
            speed[i] = i+1;
        }
    }

    private void positionInitialisation() {
        for (int i = 0; i < 4; i++) {
            position[i] = 0;
        }
    }

    @Override
    public void setup(){
        heightInitialisation();
        speedInitialisation();
        positionInitialisation();
    }

    @Override
    public void draw() {
        drawCircle();
        moveCircle();
    }

    private void moveCircle() {
        for (int i = 0; i < 4; i++) {
            position[i] += speed[i];
        }
    }

    private void drawCircle() {
        for (int i = 0; i < 4; i++) {
            ellipse(position[i], height[i], DIAMETER, DIAMETER);
        }
    }
}

import processing.core.PApplet;

public class Sketch_Procedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static final int heightOfBall1 = HEIGHT / 5;
    public static final int heightOfBall2 = HEIGHT * 2 / 5;
    public static final int heightOfBall3 = HEIGHT * 3 / 5;
    public static final int heightOfBall4 = HEIGHT * 4 / 5;
    public static final int speedOfBall1 = 1;
    public static final int speedOfBall2 = 2;
    public static final int speedOfBall3 = 3;
    public static final int speedOfBall4 = 4;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;

    public static void main(String[] args){
        PApplet.main("Sketch_Procedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(w, heightOfBall1, DIAMETER, DIAMETER);
        ellipse(x, heightOfBall2, DIAMETER, DIAMETER);
        ellipse(y, heightOfBall3, DIAMETER, DIAMETER);
        ellipse(z, heightOfBall4, DIAMETER, DIAMETER);
        w+= speedOfBall1;
        x+= speedOfBall2;
        y+= speedOfBall3;
        z+= speedOfBall4;
    }
}

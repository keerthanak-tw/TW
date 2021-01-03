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
    private int positionOfBall1 = 0;
    private int positionOfBall2 = 0;
    private int positionOfBall3 = 0;
    private int positionOfBall4 = 0;

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
        ellipse(positionOfBall1, heightOfBall1, DIAMETER, DIAMETER);
        ellipse(positionOfBall2, heightOfBall2, DIAMETER, DIAMETER);
        ellipse(positionOfBall3, heightOfBall3, DIAMETER, DIAMETER);
        ellipse(positionOfBall4, heightOfBall4, DIAMETER, DIAMETER);
        positionOfBall1+= speedOfBall1;
        positionOfBall2+= speedOfBall2;
        positionOfBall3+= speedOfBall3;
        positionOfBall4+= speedOfBall4;
    }
}

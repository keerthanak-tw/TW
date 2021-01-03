import processing.core.PApplet;

public class SketchOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    CircleSetup ball1;
    CircleSetup ball2;
    CircleSetup ball3;
    CircleSetup ball4;

    public static void main(String[] args){
        PApplet.main("SketchOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new CircleSetup(HEIGHT / 5, 1,10);
        ball2 = new CircleSetup(HEIGHT *2/ 5, 2,10);
        ball3 = new CircleSetup(HEIGHT *3/ 5, 3,10);
        ball4 = new CircleSetup(HEIGHT *4/ 5, 4,10);
    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    private void drawCircle(CircleSetup circle) {
        ellipse(circle.position, circle.height, circle.diameter, circle.diameter);
        circleIncrement(circle);
    }

    private void circleIncrement(CircleSetup circle) {
        circle.position += circle.speed;
    }
}

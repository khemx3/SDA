package lab9.Q1;

public class Polygon extends Shape {
    protected int length;

    public Polygon(int x, int y, int length){
        super(x, y);
        this.length = length;
    }

    public void draw() {
        draw.drawLine(x, y, x + length, y);
        draw.drawLine(x + length, y, x + length, y + length);
        draw.drawLine(x + length, y + length, x, y + length);
        draw.drawLine(x, y + length, x, y);
    }
}

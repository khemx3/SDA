package SdaLab9.task1;
import java.util.Arrays;

public class Polygon extends Shape {
    protected int[] x;
    protected int[] y;
    int side = 0;

    public Polygon(int side , int[] x, int[] y) {

        super(x[0],y[0]);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        for(int i=0;i<side-1;i++){
            draw.drawLine(x[i],y[i],x[i+1],y[i+1]);
        }
        draw.drawLine(x[0],y[0],x[side-1],y[side-1]);
    }
    @Override
    public String toString() {
        return "Polygon{" +
                "x=" + Arrays.toString(x) +
                ", y=" + Arrays.toString(y) +
                ", side=" + side +
                '}'+"\n";
    }
}

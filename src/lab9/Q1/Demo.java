package lab9.Q1;

import java.util.LinkedList;
import java.util.List;

public class Demo {

  public static void main(String[] args) throws InterruptedException {

    List<Shape> shapes = new LinkedList<Shape>();

    shapes.add(new Rectangle(10, 10, 100, 100));
    shapes.add(new Circle(150, 150, 30));
    shapes.add(new Square(300, 150, 40));
    shapes.add(new Polygon(230,160,50));

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapPrinter());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapDataProjector());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapXML_WRITER());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

  }
}

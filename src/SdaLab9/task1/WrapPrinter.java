package SdaLab9.task1;
public class WrapPrinter extends DrawingService {

  private Printer printer;

  public WrapPrinter() {
    printer = Printer.getPrinter();
  }

  public void drawLine(int x1, int y1, int x2, int y2) {
    printer.print_line(x1, x2, y1, y2);
  }

  public void drawCircle(int x, int y, int r) {
    printer.print_circle(x, y, r);
  }

  public void drawPixel(int x,int y){printer.drawPixel(x,y);}
}

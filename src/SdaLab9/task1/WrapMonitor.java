package SdaLab9.task1;

public class WrapMonitor extends DrawingService {

  private Monitor monitor;

  public WrapMonitor() {
    monitor = Monitor.getMonitor();
  }

  public void drawLine(int x1, int y1, int x2, int y2) {
    monitor.draw_line(x1, y1, x2, y2);
  }

  public void drawCircle(int x, int y, int r) {
    monitor.draw_circle(x, y, r);
  }

  public void drawPixel(int x,int y){monitor.drawPixel(x,y);}
}

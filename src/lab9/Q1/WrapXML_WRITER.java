package lab9.Q1;

public class WrapXML_WRITER extends DrawingService{

    private XML_writer xml_writer;

    public WrapXML_WRITER() {
        xml_writer = XML_writer.getXml_writer();
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        xml_writer.drawLine(x1, y1, x2, y2);
    }

    public void drawCircle(int x, int y, int r) {
        xml_writer.drawCircle(x, y, r);
    }
}

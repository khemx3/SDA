package lab9.Q1;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class XML_writer extends JComponent {
    private static XML_writer xml_writer;

    public static XML_writer getXml_writer() {
        if (xml_writer == null) {
            xml_writer = new XML_writer();
        }
        return xml_writer;
    }

    private List<Arc> arcs;
    private List<Line> lines;

    private JFrame frame;

    private XML_writer() {
        super();

        frame = new JFrame("XML_WRITER");
        frame.setSize(400, 400);
        frame.setLocation(0, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( this );

        arcs  = new LinkedList<Arc>();
        lines = new LinkedList<Line>();

        frame.setVisible(true);
    }

    public synchronized void drawLine(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
    }

    public synchronized void drawCircle(int x, int y, int r) {
        arcs.add(new Arc(x, y, r));
    }

    public synchronized void paint(Graphics g) {
        g.setColor(Color.green);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }

        for (Arc arc : arcs) {
            g.drawArc(arc.x, arc.y, arc.r*2, arc.r*2, 0, 360);
        }
    }
}

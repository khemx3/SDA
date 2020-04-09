package SdaLab9.task1;

import java.util.LinkedList;
import java.util.List;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Test {
  public static final String xmlFilePath = "src/Sdalab9/Task1/xml/xmlfile.xml";

  public static void main(String[] args) throws InterruptedException {
    try {
      DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
      Document document = documentBuilder.newDocument();

      Element root = document.createElement("Shape");
      document.appendChild(root);

      Element r = document.createElement("Rectangle");
      Element c = document.createElement("Circle");
      Element p = document.createElement("Polygon");
      root.appendChild(r);
      root.appendChild(c);
      root.appendChild(p);

      List<Shape> shapes = new LinkedList<Shape>();

      Rectangle a = new Rectangle(10, 10, 200, 100);
      Rectangle b = new Rectangle(110, 110, 300, 200);
      Circle nc = new Circle(250, 250, 30);
      shapes.add(a);
      shapes.add(b);
      shapes.add(nc);

      int[] x = {10, 50, 90, 120, 150, 170};
      int[] y = {170, 180, 200, 150, 130, 10};
      Polygon d = new Polygon(6, x, y);
      shapes.add(d);

      Attr attr = document.createAttribute("id");
      attr.setValue("1");
      r.setAttributeNode(attr);

      r.appendChild(document.createTextNode(a.toString()));
      r.appendChild(document.createTextNode(b.toString()));
      c.appendChild(document.createTextNode(nc.toString()));
      p.appendChild(document.createTextNode(d.toString()));


      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(xmlFilePath));

      transformer.transform(domSource, streamResult);

      System.out.println("Done creating XML File");
      for(Shape s : shapes){
        System.out.println(s.toString());
      }
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

    } catch (ParserConfigurationException pce) {
      pce.printStackTrace();
    } catch (TransformerException tfe) {
      tfe.printStackTrace();
    }


  }
}

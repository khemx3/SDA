package Lab11.lab11Visitor;

public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting "+wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting Engine");
    }
}

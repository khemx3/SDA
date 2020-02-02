package lab3.lab3Code.xmastree;

public class LEDS extends TreeDecorator{

    public LEDS(Tree tree) {
        this.tree=tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", LEDs";
    }

    @Override
    public double cost() {
        return tree.cost() + 10;
    }
}

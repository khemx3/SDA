package lab3.lab3Code.xmastree;

public class Lights extends TreeDecorator{

    public Lights(Tree tree) {
        this.tree=tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", Lights";
    }

    @Override
    public double cost() {
        return tree.cost() + 5;
    }
}

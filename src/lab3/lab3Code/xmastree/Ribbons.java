package lab3.lab3Code.xmastree;

public class Ribbons extends TreeDecorator{
    public Ribbons(Tree tree){
        this.tree = tree;
    }
    @Override
    public String getDescription() {
        return tree.getDescription() + ", Ribbons";
    }

    @Override
    public double cost() {
        return tree.cost() + 2;
    }
}

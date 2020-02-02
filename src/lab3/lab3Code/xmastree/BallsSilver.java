package lab3.lab3Code.xmastree;

public class BallsSilver extends TreeDecorator{
    public BallsSilver(Tree tree)
    {
        this.tree = tree;
    }
    @Override
    public String getDescription() {
        return tree.getDescription() + ", Balls silver";
    }

    @Override
    public double cost() {
        return tree.cost() + 3;
    }
}

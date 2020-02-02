package lab3.lab3Code.xmastree;

public class BallsRed extends TreeDecorator{

    public BallsRed(Tree tree) {
        this.tree=tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", Balls red";
    }

    @Override
    public double cost() {
        return tree.cost() +1;
    }
}

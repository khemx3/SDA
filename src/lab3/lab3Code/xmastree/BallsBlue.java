package lab3.lab3Code.xmastree;

public class BallsBlue extends TreeDecorator{

    public BallsBlue(Tree tree) {
        this.tree=tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", Balls Blue";
    }

    @Override
    public double cost() {
        return tree.cost() + 2 ;
    }
}

package lab2.task3;

public abstract class GameCharacter {
    protected GuitarBehavior guitarBehavior;
    protected SoloBehavior soloBehavior;

    public void setGuitarBehavior(GuitarBehavior guitarBehavior) {
        this.guitarBehavior = guitarBehavior;
    }

    public void setSoloBehavior(SoloBehavior soloBehavior) {
        this.soloBehavior = soloBehavior;
    }

    public void playGuitar(){
        if (guitarBehavior != null) {
            guitarBehavior.play();
        }
    }

    public void performSolo(){
        if (soloBehavior != null){
            soloBehavior.solo();
        }
    }

    public void sayName(){
        System.out.println(getName());
    }

    protected abstract String getName();
}

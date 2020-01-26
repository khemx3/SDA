package lab2.task3;

public abstract class GameCharacter {
    protected GuitarBehavior guitarBehavior;
    protected SoloBehavior soloBehavior;

    public GameCharacter setGuitarBehavior(GuitarBehavior guitarBehavior) {
        this.guitarBehavior = guitarBehavior;
        return this;
    }

    public GameCharacter setSoloBehavior(SoloBehavior soloBehavior) {
        this.soloBehavior = soloBehavior;
        return this;
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

package lab5.task2;

public abstract class AbstractBreakfast {
    private boolean condiments = false;
    abstract void prepareEggs();

    abstract void cook();

    void crackEggs(int n) {
        System.out.println("Cracking " + n + " eggs.");
    }

    void serve(){
        System.out.println("Placing the eggs on a plate.");
    }
    public void addCondiments(){
        System.out.println("Adding salt and pepper.");
    }
    public final void start(int egg){
        crackEggs(egg);
        prepareEggs();
        cook();
        if(condiments){
            addCondiments();
        }
        serve();
    }
    public void wantsCondiments(){
        condiments = true;
    }
}

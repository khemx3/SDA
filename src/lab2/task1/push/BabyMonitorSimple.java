package lab2.task1.push;

import java.util.Observable;
import java.util.Observer;

public class BabyMonitorSimple implements Observer {

    private Observable mdata;
    private String name;
    private boolean crying;

    private Baby baby ;

    public BabyMonitorSimple(String location, Baby d) {
        this.mdata=d;
        this.name=location;
        mdata.addObserver(this);
    }

    public void display() {
        if (crying) {
            System.out.println("Monitor:"+ name + " baby is crying");
        }
    }

    public void turnOff() {
        mdata.deleteObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        this.crying=((BabyRecord)o).getCrying();;
        display();
    }

}

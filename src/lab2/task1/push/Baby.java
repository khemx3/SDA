package lab2.task1.push;

import lab1.pattern.CourseRecord;
import lab1.pattern.Observer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;

public class Baby extends Observable {

    //private boolean crying=false;
    //private int level=0;
    private boolean crying;
    private int level;
    private String babyname;
    private ArrayList<String> baby_action = new ArrayList<String>();
    public Baby(String name){
        this.babyname=name;
    }

    public void setData(boolean crying,int level) {
        setChanged();
        this.notifyObservers(new BabyRecord(this.babyname,crying,level));
    }

    public String getBabyname() {
        return babyname;
    }

}

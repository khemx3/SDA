package lab2.task1.push;

public class BabyRecord {
    private String name;
    private Boolean crying;
    private int level;
    public BabyRecord(String Name, Boolean crying, int level) {
        this.name = Name;
        this.crying = crying;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Boolean getCrying() {
        return crying;
    }

    public void setCrying(Boolean crying) {
        this.crying = crying;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BabyRecord{" +
                "name='" + name + '\'' +
                ", crying=" + crying +
                '}';
    }
}

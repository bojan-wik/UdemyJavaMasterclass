package section9.interfaces.exercise1.solutionfromcourse;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strenght;
    private final String weapon = "claws and fangs";

    public Monster(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "\nMonster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strenght +
                ", weapons='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strenght);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
        }
    }
}

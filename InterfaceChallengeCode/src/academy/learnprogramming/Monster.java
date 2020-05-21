package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private  String name;
    private int hitpoints;
    private int strength;

    public Monster(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength='" + strength + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitpoints);
        values.add(2, "" +this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue!=null && savedValue.size()>0){
            this.name= savedValue.get(0);
            this.hitpoints =  Integer.parseInt(savedValue.get(1));
            this.strength = Integer.parseInt(savedValue.get(2));
        }
    }
}

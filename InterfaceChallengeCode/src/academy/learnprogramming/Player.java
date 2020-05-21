package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private String weapon;
    private int strength;

    public Player(String name, int hitPoints, String weapon, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.weapon = weapon;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,""+this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue!= null && savedValue.size() >0){
            this.name = savedValue.get(0);
            this.hitPoints = Integer.parseInt(savedValue.get(1));
            this.strength = Integer.parseInt(savedValue.get(2));
            this.weapon =savedValue.get(3);
        }

    }


}

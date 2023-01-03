package academy.learnprogramming;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> valuesToSave = new ArrayList<>();
        valuesToSave.add(0,this.name);
        valuesToSave.add(1,this.weapon);
        valuesToSave.add(2, String.valueOf(this.hitPoints));
        valuesToSave.add(3, String.valueOf(this.strength));
        return valuesToSave;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.weapon = savedValues.get(1);
            this.hitPoints = Integer.parseInt(savedValues.get(2));
            this.strength = Integer.parseInt(savedValues.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

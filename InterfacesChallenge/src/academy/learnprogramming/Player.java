package academy.learnprogramming;

import java.util.ArrayList;

public class Player implements ISaveable{
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

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> valuesToSave = new ArrayList<>();
        valuesToSave.add(0,this.name);
        valuesToSave.add(1,String.valueOf(this.hitPoints));
        valuesToSave.add(2,String.valueOf(this.strength));
        valuesToSave.add(3,this.weapon);
        return valuesToSave;
    }

    @Override
    public void read(ArrayList<String> fieldsToString) {
        if(fieldsToString != null && fieldsToString.size() > 0) {
            this.name = fieldsToString.get(0);
            this.hitPoints = Integer.parseInt(fieldsToString.get(1));
            this.strength = Integer.parseInt(fieldsToString.get(2));
            this.weapon = fieldsToString.get(3);
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


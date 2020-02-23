package Spells;

public abstract class Spell {

    int strength;
    String name;

    public Spell(int strength, String name){
        this.strength = strength;
        this.name = name;
    }

    public int castSpell() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getName() {return this.name; }




}

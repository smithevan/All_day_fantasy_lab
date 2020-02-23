package mythicalcreatures;

public abstract class Creature {

    int strength;
    String name;
    int health;

    public Creature(int strength, String name, int health){
        this.strength = strength;
        this.health = health;
        this.name = name;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getName() {return this.name; }

    public int getHealth() { return this.health; }

}

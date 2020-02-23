package mythicalcreatures;

public abstract class Creature {

    int strength;
    String name;

    public Creature(int strength, String name){
        this.strength = strength;
        this.name = name;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getName() {return this.name; }

}

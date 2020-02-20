package enemies;

public abstract class Enemy {

    String name;
    int strength;


    public Enemy(String name, int strength){
        this.name = name;
        this.strength= strength;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

}

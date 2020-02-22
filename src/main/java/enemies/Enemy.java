package enemies;

public abstract class Enemy implements IEnemy {

    String name;
    int strength;
    int health;


    public Enemy(String name, int strength, int health){
        this.name = name;
        this.strength= strength;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getHealth(){
        return this.health;
    }

}

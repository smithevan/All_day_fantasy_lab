package Castle;

import enemies.Enemy;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public abstract class Room {

    String name;
    ArrayList<Enemy> enemies;

    public Room(String name){
        this.name = name;
        this.enemies = new ArrayList<Enemy>();
    }

    public String getName(){
        return this.name;
    }


}

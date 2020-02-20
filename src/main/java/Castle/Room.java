package Castle;

import Players.Player;
import enemies.Enemy;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public abstract class Room {

    String name;
    ArrayList<Enemy> enemies;
    ArrayList<Player> players;

    public Room(String name){
        this.name = name;
        this.enemies = new ArrayList<Enemy>();
        this.players = new ArrayList<Player>();
    }

    public String getName(){
        return this.name;
    }


}

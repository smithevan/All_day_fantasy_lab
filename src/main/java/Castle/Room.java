package Castle;

import Players.IPlayable;
import Players.Player;
import enemies.Enemy;
import enemies.IEnemy;
import specialPowers.IWeaponable;
import treasure.ITreasurable;

import java.util.ArrayList;

public abstract class Room {

    String name;
    ArrayList<IEnemy> enemies;
    ArrayList<IPlayable> players;
    ArrayList<ITreasurable> treasures;

    public Room(String name){
        this.name = name;
        this.enemies = new ArrayList<IEnemy>();
        this.players = new ArrayList<IPlayable>();
        this.treasures = new ArrayList<ITreasurable>();
    }

    public String getName(){
        return this.name;
    }


}

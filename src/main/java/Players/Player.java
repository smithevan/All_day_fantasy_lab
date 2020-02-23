package Players;

import specialPowers.IWeaponable;
import treasure.ITreasurable;

import java.util.ArrayList;

public abstract class Player {
     String name;
     int healingPoints;
    ArrayList<ITreasurable> treasures;


    public Player(String name, int healingPoints){
        this.name = name;
        this.healingPoints= healingPoints;
        this.treasures = new ArrayList<ITreasurable>();
    }

    public String getName(){
        return this.name;
    }

    public int getHealingPoints(){
        return healingPoints;
    }

    public int countTreasure() {return treasures.size();}

    public void addTreasure(ITreasurable treasure) { treasures.add(treasure);}

    public void addHealth(int healing) {
        healingPoints += healing;
    }






}

package Castle;

import Players.*;
import enemies.IEnemy;
import enemies.Orc;
import treasure.ITreasurable;

public class ThroneRoom extends Room{

    public ThroneRoom(String name) {
        super(name);
    }

    public int numberOfEnemies() {

        return enemies.size();

    }

    public void addOrc(Orc orc) {
        enemies.add(orc);
    }

    public void removeOrc(Orc orc) {
        enemies.remove(orc);
    }

    public void addIEnemy(IEnemy enemy) {

        enemies.add(enemy);
    }

    public void removeIEnemy(IEnemy enemy) {
        enemies.remove(enemy);
        if (enemies.size() == 0) {
            System.out.println("The Room Is Now Empty");
        }else {
            System.out.println("There are still more enemies!");
        }
    }

    public void addBarbarian(Barbarian barbarian) {
        players.add(barbarian);
    }

    public int numberOfPlayers() {
       return players.size();
    }

    public void addKnight(Knight knight) {
        players.add(knight);
    }

    public void addIPlayable(IPlayable player) {
        players.add(player);
        System.out.println("You have entered the " + getName());
        if (treasures.size() > 0 ){
            System.out.println("There is treasure here!");
        } else {
            System.out.println("There is no treasure here");
        }
        if (numberOfEnemies() > 0){
            System.out.println("There is an " + enemies.get(0).getName() + " here");
            System.out.println(player.getName()+ ": I challenge you!");
        } else {
            System.out.println("The " + getName() + " has no enemies");
        }
    }


    public void battle(IPlayable player, IEnemy enemy) {
        while (enemy.getHealth() != 0  && player.getHealingPoints() != 0) {
                if (player.getHealingPoints() != 0) {
                    player.attack(enemy);
                }
                if (enemy.getHealth() != 0) {
                    enemy.attack(player);
                }
            }
            if (player.getHealingPoints() == 0){
                System.out.println("The Player Has Been Defeated");
            } else if (enemy.getHealth() == 0) {
                System.out.println("The Enemy Has Been Defeated");
                removeIEnemy(enemy);
            }
            if (treasures.size() > 0){
                System.out.println("You have found treasure");

            }
        }

    public int getTreasure() {
        return treasures.size();
    }

    public void addTreasure(ITreasurable treasure) {
        treasures.add(treasure);
    }

    public void collectTreasure(IPlayable player) {
        for (int i = 0; i < treasures.size(); i++){
            ITreasurable treasure = treasures.remove(i);
            player.addTreasure(treasure);
            System.out.println(player.getName() + " has collected " + treasure.getName());
        }
    }
}

    //begin with weapon strength
    //begin with enemy strength
    //multiply weapon strength by random number, deduct output from enemy health
    //multiply enemy strength by random number, deduct output from player health
    //continue looping until someone is zero.


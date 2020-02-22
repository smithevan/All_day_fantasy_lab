package Castle;

import Players.Barbarian;
import Players.Dwarf;
import Players.IPlayable;
import Players.Knight;
import enemies.IEnemy;
import enemies.Orc;

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

    public void addBarbarian(Barbarian barbarian) {
        players.add(barbarian);
    }

    public int numberOfPlayers() {
       return players.size();
    }

    public void addKnight(Knight knight) {
        players.add(knight);
    }

    public String addDwarf(Dwarf dwarf) {
        if (enemies.size() > 0) {
            players.add(dwarf);
            return "I challenge thee to mortal battle";
        }else {
            players.add(dwarf);
            return "";
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
            }
        }
}

    //begin with weapon strength
    //begin with enemy strength
    //multiply weapon strength by random number, deduct output from enemy health
    //multiply enemy strength by random number, deduct output from player health
    //continue looping until someone is zero.


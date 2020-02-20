package Castle;

import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
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
            return null;
        }
    }
}

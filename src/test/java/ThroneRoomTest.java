import Castle.Dungeon;
import Castle.ThroneRoom;
import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
import Weapons.Sword;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThroneRoomTest {

    ThroneRoom throneRoom;
    Orc orc;
    Barbarian barbarian;
    Knight knight;
    Dwarf dwarf;
    Sword sword;

    @Before
    public void before(){
        throneRoom = new ThroneRoom("Throne Room");
        orc = new Orc("Orc", 10, 40);
        barbarian = new Barbarian("Barbarian", 50);
        knight = new Knight("Knight", 80);
        dwarf = new Dwarf ("Dwarf", 60);
        sword = new Sword (20);
    }

    @Test
    public void hasName(){
        assertEquals("Throne Room", throneRoom.getName());
    }

    @Test
    public void checkRoomHasNoEnemyToBegin(){
        assertEquals(0, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkCanAddOrcToRoom(){
        throneRoom.addOrc(orc);
        assertEquals(1, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkCanRemoveOrcFromRoom(){
        throneRoom.addOrc(orc);
        throneRoom.removeOrc(orc);
        assertEquals(0, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkRoomBeginsEmptyOfPlayers(){
        assertEquals(0, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddBarbarianToRoom(){
        throneRoom.addBarbarian(barbarian);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddKnightToRoom(){
        throneRoom.addKnight(knight);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddDwarfToRoom(){
        throneRoom.addDwarf(dwarf);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddIPlayableToRoom(){
        throneRoom.addIPlayable(dwarf);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddIEenemyToRoom(){
        throneRoom.addIEnemy(orc);
        assertEquals(1, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkDwarfCanAttackOrc(){
        dwarf.addWeapon(sword);
        throneRoom.addOrc(orc);
        throneRoom.addDwarf(dwarf);
        int initialHealth = orc.getHealth();
        int loss = dwarf.attack(orc);
        int battleLoss = orc.getHealth() + loss;
        assertEquals(initialHealth, battleLoss);
    }

    @Test
    public void testOrcCanAttackDwarf(){
        dwarf.addWeapon(sword);
        throneRoom.addOrc(orc);
        throneRoom.addDwarf(dwarf);
        int initialHealingPoints = dwarf.getHealingPoints();
        int loss = orc.attack(dwarf);
        int battleLoss = dwarf.getHealingPoints() + loss;
        assertEquals(initialHealingPoints, battleLoss);
    }

    @Test
    public void testOrcAndDwarfAttackUntilOneIsDefeatedIfOrcDefeated(){
        dwarf.addWeapon(sword);
        throneRoom.addIEnemy(orc);
        throneRoom.addIPlayable(dwarf);
        throneRoom.battle(dwarf, orc);
        assertEquals(0, orc.getHealth());
    }



}

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
        sword = new Sword (70);
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
    public void checkDwarfChallengesEnemyWhenEnteringRoomWithEnemy(){
        throneRoom.addOrc(orc);
        assertEquals("I challenge thee to mortal battle", throneRoom.addDwarf(dwarf));
    }
    @Test
    public void checkDwarfDoesNotChallengeEnemyWhenRoomIsEmpty(){
        assertEquals(null, throneRoom.addDwarf(dwarf));
    }

//    @Test
//    public void checkDwarfCanAttackOrc(){
//        dwarf.addSword(sword);
//        throneRoom.addOrc(orc);
//        throneRoom.addDwarf(dwarf);
//
//        assertEquals();
//
//    }

}

import Players.Dwarf;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


    Dwarf dwarf;
    Sword sword;
    Axe axe;
    Bow bow;


    @Before
        public void before(){
        dwarf = new Dwarf("Stephen", 50);
        sword = new Sword(30);
        axe = new Axe(20);
        bow = new Bow(40);
    }
    @Test
        public void hasName(){
        assertEquals("Stephen", dwarf.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(50, dwarf.getHealingPoints());
    }

    @Test
    public void testWeaponsArrayBeginsEmpty(){
//
        assertEquals(0, dwarf.weaponCount() );
    }
    @Test
    public void testCanAddSword(){
        dwarf.addSword(sword);
        assertEquals(1, dwarf.weaponCount() );
    }

    @Test
    public void testCanAddAxe(){
        dwarf.addAxe(axe);
        assertEquals(1, dwarf.weaponCount() );
    }

    @Test
    public void testCanAddBow(){
        dwarf.addBow(bow);
        assertEquals(1, dwarf.weaponCount());
    }
}

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
    Axe axe2;
    Sword sword2;


    @Before
        public void before(){
        dwarf = new Dwarf("Stephen", 50);
        sword = new Sword(30);
        axe = new Axe(20);
        bow = new Bow(40);
        axe2 = new Axe(10);
        sword2 = new Sword(10);
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

    @Test
    public void testDwarfCanTakeDamage() {
        int injury = 20;
        dwarf.takeDamage(injury);
        assertEquals(30, dwarf.getHealingPoints());
    }

//    @Test
//    public void testDwarfCanUseWeapon() {
//        dwarf.addAxe(axe);
//        int attackStrength = axe.useWeapons();
//        assertEquals(20, attackStrength);
//    } Testing if a weapon returns a random integer between 1 and the full strength value

    @Test
    public void testDwarfCanUseMultipleWeapons(){
        dwarf.addAxe(axe2);
        dwarf.addSword(sword2);
        int attackStrength = dwarf.attack();
        assertEquals(20, attackStrength);
    }



}

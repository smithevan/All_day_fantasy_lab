import Players.Barbarian;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import specialPowers.IWeaponable;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Sword sword;
    Axe axe;
    Bow bow;


    @Before
    public void before(){
        barbarian = new Barbarian("Sigurd", 60);
        sword = new Sword(30);
        axe = new Axe (20);
        bow = new Bow(40);
    }

    @Test
    public void hasName(){
        assertEquals("Sigurd", barbarian.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(60, barbarian.getHealingPoints());
    }

    @Test
    public void testWeaponsArrayBeginsEmpty(){
//
        assertEquals(0, barbarian.weaponCount() );
    }
    @Test
    public void testCanAddSword(){
        barbarian.addSword(sword);
        assertEquals(1, barbarian.weaponCount() );
    }

    @Test
    public void testCanAddAxe(){
        barbarian.addAxe(axe);
        assertEquals(1, barbarian.weaponCount() );
    }

    @Test
    public void testCanAddBow(){
        barbarian.addBow(bow);
        assertEquals(1, barbarian.weaponCount());
    }

    @Test
    public void testBarbarianCanTakeDamage() {
        int injury = 20;
        barbarian.takeDamage(injury);
        assertEquals(40, barbarian.getHealingPoints());
    }

    @Test
    public void testCanAddWeapon(){
        barbarian.addWeapon(sword);
        assertEquals(1, barbarian.weaponCount());
    }
}

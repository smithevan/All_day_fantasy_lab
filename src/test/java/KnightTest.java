import Players.Knight;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Sword sword;
    Axe axe;
    Bow bow;


    @Before
    public void before(){
        knight = new Knight("Silvia", 80);
        sword = new Sword(30);
        axe = new Axe(20);
        bow = new Bow(40);
    }
    @Test
    public void hasName(){
        assertEquals("Silvia", knight.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(80, knight.getHealingPoints());
    }

    @Test
    public void testWeaponsArrayBeginsEmpty(){
//
        assertEquals(0, knight.weaponCount() );
    }
    @Test
    public void testCanAddSword(){
        knight.addSword(sword);
        assertEquals(1, knight.weaponCount() );
    }

    @Test
    public void testCanAddAxe(){
        knight.addAxe(axe);
        assertEquals(1, knight.weaponCount() );
    }

    @Test
    public void testCanAddBow(){
        knight.addBow(bow);
        assertEquals(1, knight.weaponCount());
    }

}

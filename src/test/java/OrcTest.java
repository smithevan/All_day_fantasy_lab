import Players.Dwarf;
import Players.Knight;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Dwarf dwarf;

    @Before
    public void before(){
        orc = new Orc("Orc", 10, 40);
        dwarf = new Dwarf ("Dwarf", 40);
    }
    @Test
    public void hasName(){
        assertEquals("Orc", orc.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(30, orc.getStrength());
    }

    @Test
    public void hasHealth(){
        assertEquals(40, orc.getHealth());
    }

    @Test
    public void testOrcCanTakeDamage() {
        int injury = 20;
        orc.damage(injury);
        assertEquals(20, orc.getHealth());
    }

    @Test
    public void testOrcCanDie(){
        int injury = 40;
        assertEquals(0, orc.damage(injury));
    }





}

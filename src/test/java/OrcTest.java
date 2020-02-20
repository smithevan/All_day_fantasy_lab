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

    @Before
    public void before(){
        orc = new Orc("OrcName", 30);
    }
    @Test
    public void hasName(){
        assertEquals("OrcName", orc.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(30, orc.getStrength());
    }

}

import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;


    @Before
    public void before(){
        sword = new Sword( 50);

    }
    @Test
    public void hasStrength(){
        assertEquals( 50, sword.getStrength());
    }
}

import Players.Dwarf;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {
    private Axe axe;


    @Before
    public void before(){
        axe = new Axe( 50);

    }
    @Test
    public void hasStrength(){
        assertEquals( 50, axe.getStrength());
    }

//    @Test
//    public void canUseAxe(){
//        assertEquals(20, axe.useWeapons());
//    }


}

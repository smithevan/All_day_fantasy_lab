import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    Gold gold;


    @Before
    public void before(){
        gold = new Gold( 23, "Gold");

    }
    @Test
    public void hasValue(){
        assertEquals( 23, gold.getValue());
    }

}

import Weapons.Axe;
import Weapons.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest  {
    Bow bow;


    @Before
    public void before(){
        bow = new Bow( 50);

    }
    @Test
    public void hasStrength(){
        assertEquals( 50, bow.getStrength());
    }

}

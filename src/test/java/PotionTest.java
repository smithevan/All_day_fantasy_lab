import HealingTools.Potion;
import org.junit.Before;
import org.junit.Test;
import treasure.Gem;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;


    @Before
    public void before(){
        potion = new Potion("Athelas", 20);

    }
    @Test
    public void hasValue(){
        assertEquals( 20, potion.getStrength());
    }

}

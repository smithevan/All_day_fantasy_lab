import Spells.Lightening;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LighteningTest {


    Lightening lightening;


    @Before
    public void before(){
        lightening = new Lightening( 50, "Lightening");

    }

    @Test
    public void hasStrength(){
        assertEquals( 50, lightening.getStrength());
    }


//    @Test
//    public void testLighteningCanBeCast() {
//        int attackStrength = lightening.castSpell();
//        assertEquals(50, attackStrength);
//    }  works, but cannot test a random number

}

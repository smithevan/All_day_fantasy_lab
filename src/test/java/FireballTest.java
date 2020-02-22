import Spells.Fireball;
import Spells.Lightening;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;


    @Before
    public void before(){
        fireball = new Fireball( 50);

    }

    @Test
    public void hasStrength(){
        assertEquals( 50, fireball.getStrength());
    }


//    @Test
//    public void canCastSpell(){
//        assertEquals(20, fireball.castSpell());
//    }

}

import org.junit.Before;
import org.junit.Test;
import treasure.Gem;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class GemTest {

    Gem gem;


    @Before
    public void before(){
        gem = new Gem( 23, "Gem");

    }
    @Test
    public void hasValue(){
        assertEquals( 23, gem.getValue());
    }

}

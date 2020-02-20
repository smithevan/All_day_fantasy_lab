import Castle.Dungeon;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;

    @Before
    public void before(){
        dungeon = new Dungeon("Dungeon");
    }
    @Test
    public void hasName(){
        assertEquals("Dungeon", dungeon.getName());
    }

}

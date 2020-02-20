import Castle.Dungeon;
import Castle.ThroneRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThroneRoomTest {

    ThroneRoom throneRoom;

    @Before
    public void before(){
        throneRoom = new ThroneRoom("Throne Room");
    }

    @Test
    public void hasName(){
        assertEquals("Throne Room", throneRoom.getName());
    }

}

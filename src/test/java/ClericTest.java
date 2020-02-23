import HealingTools.Herbs;
import HealingTools.Potion;
import Players.Cleric;
import Players.Wizard;
import Spells.Fireball;
import Spells.Lightening;
import mythicalcreatures.Dragon;
import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Wizard wizard;
    private Potion potion;
    private Herbs herbs;



    @Before
    public void before(){
        cleric = new Cleric("Cleric", 80);
        wizard = new Wizard("Gandalf", 20);
        potion = new Potion("Athelas", 20);
        herbs = new Herbs("Healing Herbs", 10);
    }
    @Test
    public void hasName(){
        assertEquals("Cleric", cleric.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(80, cleric.getHealingPoints());
    }


    @Test
    public void testHealablesBeginsEmpty(){
        assertEquals(0, cleric.healableCount() );
    }

    @Test
    public void testCanAddHealables(){
        cleric.addHealable(herbs);
        assertEquals(1, cleric.healableCount());
    }

    @Test
    public void testCanRemoveHealables(){
        cleric.addHealable(potion);
        cleric.removeHealable(potion);
        assertEquals(0, cleric.healableCount());
    }

    @Test
    public void testClericCanTakeDamage() {
        int injury = 20;
        cleric.takeDamage(injury);
        assertEquals(60, cleric.getHealingPoints());
    }

//    @Test
////    public void testClericCanHealOthers(){
////        cleric.addHealable(potion);
////        cleric.heal(wizard);
////        assertEquals(30, wizard.getHealingPoints());
////    }  passes, but can't propertly test because random.  But returns randomised healing power.

}

import Players.Knight;
import Players.Wizard;
import Spells.Fireball;
import Spells.Lightening;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fireball fireball;
    Lightening lightening;


    @Before
    public void before(){
        wizard = new Wizard("Gandalf", 80);
        fireball = new Fireball(80);
        lightening = new Lightening(70);
    }
    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(80, wizard.getHealingPoints());
    }


    @Test
    public void testSpellsArrayBeginsEmpty(){
        assertEquals(0, wizard.spellsCount() );
    }

    @Test
    public void testCanAddFireball(){
        wizard.addFireball(fireball);
        assertEquals(1, wizard.spellsCount() );
    }

    @Test
    public void testCanAddLightening(){
        wizard.addLightening(lightening);
        assertEquals(1, wizard.spellsCount() );
    }

    @Test
    public void testcanAddSpells(){
        wizard.addSpell(fireball);
        assertEquals(1, wizard.spellsCount());
    }


}

import Players.Knight;
import Players.Wizard;
import Spells.Fireball;
import Spells.Lightening;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import mythicalcreatures.Dragon;
import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Fireball fireball;
    private Lightening lightening;
    private Gold gold;
    private Dragon dragon;


    @Before
    public void before(){
        wizard = new Wizard("Gandalf", 80);
        fireball = new Fireball(80, "Fireball");
        lightening = new Lightening(70, "Lightening");
        gold = new Gold (20, "Gold");
        dragon = new Dragon(100, "Drogon", 30);
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
    public void testCanAddSpells(){
        wizard.addSpell(fireball);
        assertEquals(1, wizard.spellsCount());
    }

    @Test
    public void testCanRemoveSpells(){
        wizard.addSpell(fireball);
        wizard.removeSpell(fireball);
        assertEquals(0, wizard.spellsCount());
    }

    @Test
    public void testWizardCanTakeDamage() {
        int injury = 20;
        wizard.takeDamage(injury);
        assertEquals(60, wizard.getHealingPoints());
    }

    @Test
    public void testWizardTreasureBeginsEmpty(){
        assertEquals(0, wizard.countTreasure());
    }

    @Test
    public void testWizardCanAddTreasure(){
        wizard.addTreasure(gold);
        assertEquals(1, wizard.countTreasure());
    }

    @Test
    public void testWizardCreaturesBeginsEmpty(){
        assertEquals(0, wizard.countCreatures());
    }

    @Test
    public void testWizardCanAddCreature(){
        wizard.addICreaturable(dragon);
    }

    @Test
    public void testWizardCanRemoveCreature(){
        wizard.removeIcreature(dragon);
    }





}

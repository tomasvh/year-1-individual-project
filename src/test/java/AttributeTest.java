import com.npcmaker.characterfiles.Character;
import com.npcmaker.characterfiles.skillfiles.Expertis;
import com.npcmaker.characterfiles.skillfiles.Trade;
import com.npcmaker.characterfiles.skillfiles.Trait;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AttributeTest {

    private int count = 0;
    /* Executed before every test method. */
    @BeforeEach
    public void setUp() {
            System.out.println("Run test method: "+(++count));
        }

    /* Executed after every test method. */
    @AfterEach
    public void tearDown() {
            System.out.println(" --- done with test "+count);
        }

        Character character = new Character();
        Expertis tempExpertis = new Expertis("tempExpertis", 0, 0);
        Trait tempTrait = new Trait("TempTrait", 0, 0);
        Trade tempTrade = new Trade("TempTrade", 0, 0);

    @Test public void testBasicAttribute(){
        assertEquals("Styrka",character.getBasicAttributeArrayList().get(0).getName());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());

        character.getBasicAttributeArrayList().get(0).setName("Strength");
        character.getBasicAttributeArrayList().get(0).setDice(2);
        character.getBasicAttributeArrayList().get(0).setMod(2);

        assertEquals("Strength",character.getBasicAttributeArrayList().get(0).getName());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals("2T6+2",character.getBasicAttributeArrayList().get(0).valueToString());

        character.getBasicAttributeArrayList().get(0).changeDice(1);
        character.getBasicAttributeArrayList().get(0).changeMod(2);

        assertEquals(3, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(4, character.getBasicAttributeArrayList().get(0).getMod());

        character.getBasicAttributeArrayList().get(0).reCountValue();
        assertEquals(4, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());


        assertEquals("4T6", character.getBasicAttributeArrayList().get(0).valueToString());
        }

        @Test public void testDerivedAttribute () {
            assertEquals("FörFlyttning",character.getDerivedAttributesArrayList().get(0).getName());
            assertEquals(0, character.getDerivedAttributesArrayList().get(0).getDice());
            assertEquals(0, character.getDerivedAttributesArrayList().get(0).getMod());

            character.getDerivedAttributesArrayList().get(0).setName("Movement");
            character.getDerivedAttributesArrayList().get(0).setDice(2);
            character.getDerivedAttributesArrayList().get(0).setMod(2);

            assertEquals("Movement",character.getDerivedAttributesArrayList().get(0).getName());
            assertEquals(2, character.getDerivedAttributesArrayList().get(0).getDice());
            assertEquals(2, character.getDerivedAttributesArrayList().get(0).getMod());
            assertEquals("2", character.getDerivedAttributesArrayList().get(0).modToString());

            character.getDerivedAttributesArrayList().get(0).changeDice(1);
            character.getDerivedAttributesArrayList().get(0).changeMod(2);

            assertEquals(3, character.getDerivedAttributesArrayList().get(0).getDice());
            assertEquals(4, character.getDerivedAttributesArrayList().get(0).getMod());

            character.getDerivedAttributesArrayList().get(0).reCountValue();
            assertEquals(4, character.getDerivedAttributesArrayList().get(0).getDice());
            assertEquals(0, character.getDerivedAttributesArrayList().get(0).getMod());

        }

        @Test public void testSkills () {
            assertEquals("Dansa",character.getAgilitySkillsArraylist().get(0).getName());
            assertEquals(2, character.getAgilitySkillsArraylist().get(0).getDice());
            assertEquals(0, character.getAgilitySkillsArraylist().get(0).getMod());

            character.getAgilitySkillsArraylist().get(0).setName("Vals");
            character.getAgilitySkillsArraylist().get(0).setDice(2);
            character.getAgilitySkillsArraylist().get(0).setMod(2);

            assertEquals("Vals",character.getAgilitySkillsArraylist().get(0).getName());
            assertEquals(2, character.getAgilitySkillsArraylist().get(0).getDice());
            assertEquals(2, character.getAgilitySkillsArraylist().get(0).getMod());

            character.getAgilitySkillsArraylist().get(0).changeDice(1);
            character.getAgilitySkillsArraylist().get(0).changeMod(2);

            assertEquals(3, character.getAgilitySkillsArraylist().get(0).getDice());
            assertEquals(4, character.getAgilitySkillsArraylist().get(0).getMod());

            character.getAgilitySkillsArraylist().get(0).reCountValue();
            assertEquals(4, character.getAgilitySkillsArraylist().get(0).getDice());
            assertEquals(0, character.getAgilitySkillsArraylist().get(0).getMod());
        }

        @Test public void testExpertis(){
            assertEquals("tempExpertis", tempExpertis.getName());
            assertEquals(0, tempExpertis.getDice());
            assertEquals(0,tempExpertis.getMod());

            tempExpertis.setName("fnula");
            tempExpertis.changeDice(2);
            tempExpertis.changeMod(2);

            assertEquals("fnula", tempExpertis.getName());
            assertEquals(2, tempExpertis.getDice());
            assertEquals(2,tempExpertis.getMod());

        }

        @Test public void testTrade () {
            assertEquals("TempTrade", tempTrade.getName());
            assertEquals(0, tempTrade.getDice());
            assertEquals(0,tempTrade.getMod());

            tempTrade.setName("fnula");
            tempTrade.changeDice(2);
            tempTrade.changeMod(2);

            assertEquals("fnula", tempTrade.getName());
            assertEquals(2, tempTrade.getDice());
            assertEquals(2,tempTrade.getMod());
        }

        @Test public void testTrait () {
            assertEquals("TempTrait", tempTrait.getName());
            assertEquals(0, tempTrait.getDice());
            assertEquals(0,tempTrait.getMod());

            tempTrait.setName("fnula");
            tempTrait.changeDice(2);
            tempTrait.changeMod(2);

            assertEquals("fnula", tempTrait.getName());
            assertEquals(2, tempTrait.getDice());
            assertEquals(2,tempTrait.getMod());
        }
}


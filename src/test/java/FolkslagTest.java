import com.npcmaker.characterfiles.Character;
import com.npcmaker.characterfiles.skillfiles.Attribute;
import com.npcmaker.characterfiles.skillfiles.Expertis;
import com.npcmaker.characterfiles.skillfiles.Trade;
import com.npcmaker.characterfiles.skillfiles.Trait;
import com.npcmaker.dbhelper.DbConnector;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

import static com.npcmaker.fxmlcontrollers.PreviewFXMLController.calcRandomBasicAttribute;
import static com.npcmaker.fxmlcontrollers.PreviewFXMLController.dbTableInteract;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FolkslagTest {

    public Attribute getSetObject (Set<? extends Attribute> set, String name) {
        for (Attribute element: set) {
            if (element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }



    public String getSetString (Set<String> set, String name) {
        for (String element: set) {
            if (element.equals(name)){
                return element;
            }
        }
        return null;
    }

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

    DbConnector dbConnector = new DbConnector();
    Connection conn = dbConnector.connect();

    @Test public void folkslagTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 1);
        assertEquals("Adasier", character.getPeoples());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(3, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(3, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(3, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(3, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(160, character.getHeight());
        assertEquals(55, character.getWeight());
        assertEquals("Adask", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Utbrytarkonst");
        assertEquals("Utbrytarkonst", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Alla vapen räknas som \"sargande\", Adasier kan dricka även salt vatten.", character.getSpecialTraitsArraylist().get(0));
        assertEquals(1, character.getRollsExploration());
        assertEquals(2, character.getUnitAgility());
        assertEquals("Simma", getSetString(character.getEasilyLearnedSet(), "Simma"));


    }

    @Test public void folkslagTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 2);
        assertEquals("Cirefalier", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(175, character.getHeight());
        assertEquals(70, character.getWeight());
        assertEquals("Faliska", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Handel", getSetString(character.getEasilyLearnedSet(), "Handel"));
        assertEquals(1, character.getEasilyLearned());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals("Falisk skrift", character.getWritingArraylist().get(0));
        assertEquals(1, character.getRollsIntrigue());
        assertEquals(300, character.getStartingFundsSilver());
    }

    @Test public void folkslagTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 3);
        assertEquals("Fedaki", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(3, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(160, character.getHeight());
        assertEquals(60, character.getWeight());
        assertEquals("Vannai", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Fingerfärdighet", getSetString(character.getEasilyLearnedSet(), "Fingerfärdighet"));
        assertEquals(1, character.getJadedSupernatural());
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitWild());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void folkslagTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 4);
        assertEquals("Genver", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(3, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(165, character.getHeight());
        assertEquals(65, character.getWeight());
        assertEquals("Genvero", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Känner bergen");
        assertEquals("Känner bergen", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Klättra", getSetString(character.getEasilyLearnedSet(), "Klättra"));
        assertEquals(2, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals("folkslag 4. +1T6 för alla brytrisk/amputationsslag, +2 fokus vid förtäring av extra potent motståndares mjukdelar/en gång per speltillfälle", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void folkslagTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 5);
        assertEquals("Jahann", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(165, character.getHeight());
        assertEquals(60, character.getWeight());
        assertEquals("Jahanniska", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals(2, character.getDerivedAttributesArrayList().get(4).getMod());
        assertEquals(1, character.getEasilyLearned());
        assertEquals("Berättarkonst", getSetString(character.getEasilyLearnedSet(), "Berättarkonst"));
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void folkslagTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 6);
        assertEquals("Jargier", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(165, character.getHeight());
        assertEquals(60, character.getWeight());
        assertEquals("Lägre jargiska", character.getLanguageArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(6).getMod());

    }

    @Test public void jargierTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 1);
        assertEquals("Daval, Mithrit & Tibara", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(3, character.getUnitOther());
        assertEquals(2, character.getUnitLanguage());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void jargierTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 2);
        assertEquals("Genrio", character.getProvinceTotem());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getJadedViolence());
        assertEquals(3, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());

    }

    @Test public void jargierTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 3);
        assertEquals("Jargien", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void jargierTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 4);
        assertEquals("Lemira", character.getProvinceTotem());
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals(1, character.getDerivedAttributesArrayList().get(4).getMod());
        assertEquals(1, character.getRollsIntrigue());

    }

    @Test public void jargierTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 5);
        assertEquals("Maulio", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("jargier 5. +1T6 livskraft vid infektion", character.getSpecialTraitsArraylist().get(0));
        assertEquals(1, character.getUnitTrade());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void jargierTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 6);
        assertEquals("Merun", character.getProvinceTotem());
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(100, character.getStartingFundsSilver());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void jargierTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 7);
        assertEquals("Okrana", character.getProvinceTotem());
        assertEquals(1, character.getJadedSupernatural());
        assertEquals(1, character.getRollsExploration());
        assertEquals(3, character.getUnitWild());
        assertEquals(2, character.getDerivedAttributesArrayList().get(1).getMod());
    }

    @Test public void jargierTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 8);
        assertEquals("Rankun", character.getProvinceTotem());
        assertEquals(1, character.getRollsIntrigue());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(3, character.getUnitSocial());
        assertEquals(1, character.getUnitsExpertis());
    }

    @Test public void jargierTest9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 9);
        assertEquals("Sardan", character.getProvinceTotem());
        assertEquals(1, character.getUnitTrade());
        assertEquals(1, character.getDerivedAttributesArrayList().get(5).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(3).getMod());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void jargierTest10 () {
        Character character = new Character();
        dbTableInteract(character, conn, "jargier", 10);
        assertEquals("Kolonierna & utrikes", character.getProvinceTotem());
        assertEquals(2, character.getUnitLanguage());
        assertEquals(3, character.getUnitWild());
        assertEquals(1, character.getUnitsTraits());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void folkslagTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 7);
        assertEquals("Kamorian", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(175, character.getHeight());
        assertEquals(70, character.getWeight());
        assertEquals("Kamorianska", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Spåra", getSetString(character.getEasilyLearnedSet(), "Spåra"));
        assertEquals("Vildmarksvana", getSetString(character.getEasilyLearnedSet(), "Vildmarksvana"));
        assertEquals(1, character.getRollsExploration());

    }

    @Test public void kamorianTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 1);
        assertEquals("Blodulv", character.getProvinceTotem());
        assertEquals("kamorian 1. +1 läkningstakt", character.getSpecialTraitsArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(3, character.getBasicAttributeArrayList().get(1).getMod());
    }

    @Test public void kamorianTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 2);
        assertEquals("Frostvarg", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
    }

    @Test public void kamorianTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 3);
        assertEquals("Giftorm", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getDerivedAttributesArrayList().get(1).getDice());
    }

    @Test public void kamorianTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 4);
        assertEquals("Gråvarg", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(2, character.getDerivedAttributesArrayList().get(7).getMod());

    }

    @Test public void kamorianTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 5);
        assertEquals("Korp", character.getProvinceTotem());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
    }

    @Test public void kamorianTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 6);
        assertEquals("Stenbock", character.getProvinceTotem());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
    }

    @Test public void kamorianTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 7);
        assertEquals("Svartbjörn", character.getProvinceTotem());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(1, character.getDerivedAttributesArrayList().get(5).getDice());
    }

    @Test public void kamorianTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 8);
        assertEquals("Vildsvin", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(-2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(8).getMod());

    }

    @Test public void kamorianTest9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 9);
        assertEquals("Vithjort", character.getProvinceTotem());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
    }

    @Test public void kamorianTest10 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kamorian", 10);
        assertEquals("Utvald", character.getProvinceTotem());
        assertEquals("kamorian 10. Utvald: Kan hamnskifta till totemanden.", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void folkslagTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 8);
        assertEquals("Marnakh-Tirak", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(3, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(175, character.getHeight());
        assertEquals(80, character.getWeight());
        assertEquals("Sakhra", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Dåligt rykte");
        Trait temp2 = (Trait) getSetObject(character.getTraitSet(), "Luktsinne");
        Trait temp3 = (Trait) getSetObject(character.getTraitSet(), "Mörkersyn");
        assertEquals("Dåligt rykte", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Luktsinne", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Mörkersyn", temp3.getName());
        assertEquals(4, temp3.getDice());
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getUnitSocial());
        assertEquals("folkslag 8. Alla obeväpnade attacker \"vådliga\", +1T6 motståndskraft mot infektioner, alkohol, gift.", character.getSpecialTraitsArraylist().get(0));


    }

    @Test public void folkslagTest9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 9);
        assertEquals("Missla", character.getPeoples());
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(3, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(125, character.getHeight());
        assertEquals(35, character.getWeight());
        assertEquals("La'itha", character.getLanguageArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(3).getDice());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Empatisk beröring");
        Trait temp2 = (Trait) getSetObject(character.getTraitSet(), "Luktsinne");
        assertEquals("Empatisk beröring", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Luktsinne", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Sång&Musik", getSetString(character.getEasilyLearnedSet(), "Sång&Musik"));
        assertEquals("Undvika", getSetString(character.getEasilyLearnedSet(), "Undvika"));
        assertEquals("folkslag 9. Om Misslan använder minnesytbyte med annan missla återfås 2 fokus", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void folkslagTest10 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 10);
        assertEquals("Pyar-Alv", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(170, character.getHeight());
        assertEquals(60, character.getWeight());
        assertEquals("Felya sanari", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Felya-nai", character.getWritingArraylist().get(0));
        assertEquals("jargisk skrift", character.getWritingArraylist().get(1));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(4).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Alviska ögat");
        assertEquals("Alviska ögat", temp.getName());
        assertEquals(3, temp.getDice());
        Trait temp2 = (Trait) getSetObject(character.getTraitSet(), "Nattsyn");
        assertEquals("Nattsyn", temp2.getName());
        assertEquals(4, temp2.getDice());
        Expertis temp3 = (Expertis) getSetObject(character.getExpertisSet(), "Kontakt");
        assertEquals("Kontakt", temp3.getName());
        assertEquals(4, temp3.getDice());
        assertEquals("Kulturkännedom", getSetString(character.getEasilyLearnedSet(), "Kulturkännedom"));
        assertEquals("Genomskåda", getSetString(character.getEasilyLearnedSet(), "Genomskåda"));
        assertEquals(4, character.getUnitKnowledge());
        assertEquals("folkslag 10. Livskraftslag mot blödningens svårighet för att stoppa den", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void folkslagTest11 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 11);
        assertEquals("Taup", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(3, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(195, character.getHeight());
        assertEquals(70, character.getWeight());
        assertEquals("Eirov", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Eirovisk skrift", character.getWritingArraylist().get(0));
        assertEquals("jargisk skrift", character.getWritingArraylist().get(1));
        assertEquals("valfri kunskapsfärdighet", getSetString(character.getEasilyLearnedSet(), "valfri kunskapsfärdighet"));
        assertEquals("valfri mystikfärdighet", getSetString(character.getEasilyLearnedSet(), "valfri mystikfärdighet"));
        assertEquals("1 gång per spelomgång kan personen ge ett gott råd och låta en annan person slå om ett slag. Kan sänka välmående med 1 för att få +1T6 på färdighet eller motståndsslag. Läkningstakt +1", character.getSpecialTraitsArraylist().get(0));



    }

    @Test public void folkslagTest12 () {
        Character character = new Character();
        dbTableInteract(character, conn, "folkslag", 12);
        assertEquals("Zolod-Dvärg", character.getPeoples());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getDice());
        assertEquals(0, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(135, character.getHeight());
        assertEquals(50, character.getWeight());
        assertEquals("Rukh", character.getLanguageArraylist().get(0));
        assertEquals("lägre Jargiska", character.getLanguageArraylist().get(1));
        assertEquals("Rukh-nekh", character.getWritingArraylist().get(0));
        assertEquals(-1, character.getDerivedAttributesArrayList().get(0).getDice());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Mörkersyn");
        assertEquals("Mörkersyn", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Vontars levnadsregler");
        assertEquals("Vontars levnadsregler", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Marsch", getSetString(character.getEasilyLearnedSet(), "Marsch"));
        assertEquals("Simma", getSetString(character.getHardLearnedSet(), "Simma"));
        assertEquals("Sjömannaskap", getSetString(character.getHardLearnedSet(), "Sjömannaskap"));
        Trade temp3 = (Trade) getSetObject(character.getTradeSet(), "valfritt hantverk");
        assertEquals("valfritt hantverk", temp3.getName());
        assertEquals(5, temp3.getDice());
        assertEquals(-8, character.getEncumbranceFactor());
        assertEquals("folkslag 12. Förolämpas Zoloddvärgarnas klan utan upprättelse får personen 40 nedbrytning", character.getSpecialTraitsArraylist().get(0));

    }
}


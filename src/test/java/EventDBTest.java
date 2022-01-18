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





public class EventDBTest {

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

    @Test public void farderTest1() {

        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 1);
        assertEquals("farderaventyr 1. Allvarlig Olycka", character.getEventArraylist().get(0));
    }

    @Test public void allvarligOlycka1 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 1);
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void allvarligOlycka2 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 2);
        assertEquals(-2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void allvarligOlycka3 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 3);
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void allvarligOlycka4 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 4);
        assertEquals(-2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void allvarligOlycka5 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 5);
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
    }

    @Test public void allvarligOlycka6 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 6);
        assertEquals(-2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
    }

    @Test public void allvarligOlycka7 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 7);
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
    }

    @Test public void allvarligOlycka8 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 8);
        assertEquals(-2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
    }

    @Test public void allvarligOlycka9 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 9);
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void allvarligOlycka10 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 10);
        assertEquals(-2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void allvarligOlycka11 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 11);
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void allvarligOlycka12 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 12);
        assertEquals(-2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void allvarligOlycka13 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 13);
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
    }

    @Test public void allvarligOlycka14 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 14);
        assertEquals(-2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
    }

    @Test public void allvarligOlycka15 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 15);
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
    }

    @Test public void allvarligOlycka16 () {
        Character character = new Character();
        dbTableInteract(character,conn,"allvarligolycka", 16);
        assertEquals(-2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getDice());
    }




    @Test public void farderTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 2);
        assertEquals("farderaventyr 2. Andningsteknik", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Spela död");
        assertEquals("Spela död", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("farderaventyr 2. Ignorera efterverkning omtöcknad(s.192) +3T6 för att hålla andan eller uthärda syrebrist", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 3);
        assertEquals("farderaventyr 3. Ansamlad Kunskap", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitsExpertis());
    }

    @Test public void farderTest4() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 4);
        assertEquals("farderaventyr 4. Bakhåll", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Gömma", getSetString(character.getEasilyLearnedSet(), "Gömma"));
        assertEquals("Spåra", getSetString(character.getEasilyLearnedSet(), "Spåra"));
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
    }

    @Test public void farderTest5() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 5);
        assertEquals("farderaventyr 5. Balansens mästare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Balanssinne");
        assertEquals("Balanssinne", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("farderaventyr 5. Ignorera efterverkning \"Faller\"(s.191)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest6() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 6);
        assertEquals("farderaventyr 6. Barn", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
    }

    @Test public void farderTest7() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 7);
        assertEquals("farderaventyr 7. Begravning", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Begravningsriter");
        assertEquals("Begravningsriter", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(4, character.getUnitOther());
    }

    @Test public void farderTest8() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 8);
        assertEquals("farderaventyr 8. Bevittnat massaker", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedViolence());
    }

    @Test public void farderTest9() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 9);
        assertEquals("farderaventyr 9. Bosättning I vildmarken", character.getEventArraylist().get(0));
        assertEquals("Jakt&Fiske", getSetString(character.getEasilyLearnedSet(), "Jakt&Fiske"));
        assertEquals(2, character.getUnitWild());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void farderTest10() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 10);
        assertEquals("farderaventyr 10. Bragd", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(2, character.getUnitOther());

    }

    @Test public void farderTest11() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 11);
        assertEquals("farderaventyr 11. Drabbad av pest", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Sjukligt Utseende");
        assertEquals("Sjukligt Utseende", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void farderTest12() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 12);
        assertEquals("farderaventyr 12. Dresserat djur", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Djurträning");
        assertEquals("Djurträning", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(4, character.getUnitWild());
    }

    @Test public void farderTest13() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 13);
        assertEquals("farderaventyr 13. Dryckesvisor", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Supa");
        assertEquals("Supa", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Sång&Musik", getSetString(character.getEasilyLearnedSet(), "Sång&Musik"));
    }

    @Test public void farderTest14() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 14);
        assertEquals("farderaventyr 14. Dräpt ett monster", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitAgility());
        assertEquals(3, character.getUnitWild());
    }

    @Test public void farderTest15() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 15);
        assertEquals("farderaventyr 15. En oväntad resa", character.getEventArraylist().get(0));
        assertEquals("Historia", getSetString(character.getEasilyLearnedSet(), "Historia"));
        assertEquals(4, character.getUnitWild());
    }

    @Test public void farderTest16() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 16);
        assertEquals("farderaventyr 16. Ett med naturen", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void farderTest17() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 17);
        assertEquals("farderaventyr 17. Exceptionellt föremål", character.getEventArraylist().get(0));
        assertEquals("Ett föremål kopplat till en färdighet, när föremålet används får personen +1T6 på färdigheten", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest18() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 18);
        assertEquals("farderaventyr 18. Exceptionell vildmarksutrustning", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitWild());
        assertEquals("Vildmarksutrustning(Personen får +1T6 I vildmarksfärdigheter när utrustningen används)", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest19() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 19);
        assertEquals("farderaventyr 19. Fel tid på fel plats", character.getEventArraylist().get(0));

    }


    @Test public void felTidFelPlats1 () {
        Character character = new Character();
        dbTableInteract(character,conn,"feltidfelplats", 1);
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void felTidFelPlats3 () {
        Character character = new Character();
        dbTableInteract(character,conn,"feltidfelplats", 3);
        assertEquals(4, character.getUnitWild());
    }

    @Test public void felTidFelPlats2 () {
        Character character = new Character();
        dbTableInteract(character,conn,"feltidfelplats", 2);
        assertEquals("Skumraskaffärer", getSetString(character.getEasilyLearnedSet(), "Skumraskaffärer"));
        assertEquals(2, character.getUnitCombat());
    }

    @Test public void farderTest20() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 20);
        assertEquals("farderaventyr 20. Kvicktänkt", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Flyktvägar");
        assertEquals("Flyktvägar", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void farderTest21() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 21);
        assertEquals("farderaventyr 21. Flytt från monster", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Monsterkunskap");
        assertEquals("Monsterkunskap", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(3, character.getUnitAgility());
    }

    @Test public void framlingIFara1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 1);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void framlingIFara2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 2);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitWild());
    }
    @Test public void framlingIFara3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 3);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitCombat());
    }
    @Test public void framlingIFara4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 4);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitKnowledge());
    }
    @Test public void framlingIFara5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 5);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitAgility());
    }
    @Test public void framlingIFara6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 6);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitMysteries());
    }
    @Test public void framlingIFara7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 7);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitOther());
    }
    @Test public void framlingIFara8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 8);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getUnitsTraits());
    }
    @Test public void framlingIFara9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 9);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getUnitTrade());
    }
    @Test public void framlingIFara10 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 10);
        assertEquals(-1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getUnitsExpertis());
    }
    @Test public void framlingIFara11 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 11);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitSocial());
    }
    @Test public void framlingIFara12 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 12);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitWild());
    }
    @Test public void framlingIFara13 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 13);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitCombat());
    }
    @Test public void framlingIFara14 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 14);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitKnowledge());
    }
    @Test public void framlingIFara15 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 15);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitAgility());
    }
    @Test public void framlingIFara16 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 16);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitMysteries());
    }
    @Test public void framlingIFara17 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 17);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(4, character.getUnitOther());
    }
    @Test public void framlingIFara18 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 18);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getUnitsExpertis());
    }
    @Test public void framlingIFara19 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 19);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getUnitsTraits());
    }
    @Test public void framlingIFara20 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 20);
        assertEquals(-1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getUnitTrade());
    }
    @Test public void framlingIFara21 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 21);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitSocial());
    }
    @Test public void framlingIFara22 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 22);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitWild());
    }
    @Test public void framlingIFara23 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 23);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitCombat());
    }
    @Test public void framlingIFara24 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 24);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitKnowledge());
    }
    @Test public void framlingIFara25 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 25);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitAgility());
    }
    @Test public void framlingIFara26 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 26);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitMysteries());
    }
    @Test public void framlingIFara27 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 27);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(4, character.getUnitOther());
    }
    @Test public void framlingIFara28 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 28);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getUnitsTraits());
    }
    @Test public void framlingIFara29 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 29);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getUnitTrade());
    }
    @Test public void framlingIFara30 () {
        Character character = new Character();
        dbTableInteract(character, conn, "framlingifara", 30);
        assertEquals(-1, character.getBasicAttributeArrayList().get(2).getMod());

        assertEquals(2, character.getUnitsExpertis());

    }
    @Test public void farderTest22() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 22);
        assertEquals("farderaventyr 22. Främling I fara", character.getEventArraylist().get(0));
    }

    @Test public void farderTest23() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 23);
        assertEquals("farderaventyr 23. Fångad av vildar", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitLanguage());
    }

    @Test public void farderTest24() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 24);
        assertEquals("farderaventyr 24. Färdats över haven", character.getEventArraylist().get(0));
        assertEquals("Sjömannaskap", getSetString(character.getEasilyLearnedSet(), "Sjömannaskap"));
        assertEquals(2, character.getUnitKnowledge());
        assertEquals(2, character.getUnitLanguage());
    }

    @Test public void farderTest25() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 25);
        assertEquals("farderaventyr 25. Färd genom skugglandet", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsTraits());
    }

    @Test public void randomBasicAttributeTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 1);
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
    }

    @Test public void randomBasicAttributeTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 2);
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
    }

    @Test public void randomBasicAttributeTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 3);
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
    }

    @Test public void randomBasicAttributeTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 4);
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
    }

    @Test public void randomBasicAttributeTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 5);
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
    }

    @Test public void randomBasicAttributeTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 6);
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
    }

    @Test public void randomBasicAttributeTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 7);
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
    }

    @Test public void randomBasicAttributeTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "randomgrundattribut", 8);
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
    }

    @Test public void farderTest26() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 26);
        assertEquals("farderaventyr 26. Följe med underhållare", character.getEventArraylist().get(0));
        assertEquals("Dansa", getSetString(character.getEasilyLearnedSet(), "Dansa"));
        assertEquals("Sång&Musik", getSetString(character.getEasilyLearnedSet(), "Sång&Musik"));
    }

    @Test public void farderTest27() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 27);
        assertEquals("farderaventyr 27. Följer sitt hjärta", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 27. Får 1 extra fokus tillbaka om personen agerar efter ett karaktärsdrag", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest28() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 28);
        assertEquals("farderaventyr 28. Föremål från forntida rike", character.getEventArraylist().get(0));
        assertEquals("Föremål från forntida rike värt 4T6*100s, +1T6 på slag där föremålet kommer till användning, +1T6 sociala färdigheter mot personer som är intresserade av kultur/historia", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest29() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 29);
        assertEquals("farderaventyr 29. Förhållande med person av främmande folkslag", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals("Kulturkännedom", getSetString(character.getEasilyLearnedSet(), "Kulturkännedom"));
        assertEquals(2, character.getUnitLanguage());
    }

    @Test public void farderTest30() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 30);
        assertEquals("farderaventyr 30. God hörsel", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(3).getDice());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "God Hörsel");
        assertEquals("God Hörsel", temp.getName());
        assertEquals(4, temp.getDice());

    }

    @Test public void farderTest31() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 31);
        assertEquals("farderaventyr 31. Gravt misslyckande", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(1, character.getJadedExposure());

    }

    @Test public void farderTest32() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 32);
        assertEquals("farderaventyr 32. Gömställe", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Speja", getSetString(character.getEasilyLearnedSet(), "Speja"));
    }

    @Test public void farderTest33() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 33);
        assertEquals("farderaventyr 33. Havssjäl", character.getEventArraylist().get(0));
        assertEquals("Simma", getSetString(character.getEasilyLearnedSet(), "Simma"));
        assertEquals("Sjömannaskap", getSetString(character.getEasilyLearnedSet(), "Sjömannaskap"));
        assertEquals("farderaventyr 33. Om rollpersonen börjar speltillfället på sjön eller höravstånd får denne tillbaka 2 fokus", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest34() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 34);
        assertEquals("farderaventyr 34. Hemlig identitet", character.getEventArraylist().get(0));
    }

    @Test public void dubbelBakgrundTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 1);
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void dubbelBakgrundTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 2);
        assertEquals(4, character.getUnitWild());
    }

    @Test public void dubbelBakgrundTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 3);
        assertEquals(4, character.getUnitCombat());
    }

    @Test public void dubbelBakgrundTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 4);
        assertEquals(4, character.getUnitKnowledge());
    }

    @Test public void dubbelBakgrundTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 5);
        assertEquals(4, character.getUnitAgility());
    }

    @Test public void dubbelBakgrundTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 6);
        assertEquals(4, character.getUnitMysteries());
    }

    @Test public void dubbelBakgrundTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 7);
        assertEquals(4, character.getUnitOther());
    }

    @Test public void dubbelBakgrundTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 8);
        assertEquals(2, character.getUnitsExpertis());
    }

    @Test public void dubbelBakgrundTest9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 9);
        assertEquals(2, character.getUnitTrade());
    }

    @Test public void dubbelBakgrundTest10 () {
        Character character = new Character();
        dbTableInteract(character, conn, "dubbelbakgrund", 10);
        assertEquals(2, character.getUnitsTraits());
    }

    @Test public void farderTest35() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 35);
        assertEquals("farderaventyr 35. Hittat kropp:", character.getEventArraylist().get(0));
    }

    @Test public void hittatKropp1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "hittatkropp", 1);
        assertEquals("hittatkropp 1. Plundrade kroppen", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void hittatKropp2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "hittatkropp", 2);
        assertEquals("hittatkropp 2. Återförde tillhörigheter", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitSocial());
        assertEquals(4, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(50, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void farderTest36() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 36);
        assertEquals("farderaventyr 36. Hjälpt befolkning", character.getEventArraylist().get(0));
        assertEquals("Exceptionellt föremål(1. vapen: +1T6 skada, 2. rustning: +3 pansar, 3. färdighetsbaserad: +1T6 färdighetsslag)", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest37() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 37);
        assertEquals("farderaventyr 37. Händig", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Lappa&Laga");
        assertEquals("Lappa&Laga", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitTrade());
    }

    @Test public void farderTest38() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 38);
        assertEquals("farderaventyr 38. Ihärdig", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
        assertEquals("Vildmarksvana", getSetString(character.getEasilyLearnedSet(), "Vildmarksvana"));
    }

    @Test public void farderTest39() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 39);
        assertEquals("farderaventyr 39. Infångad och torterad", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals("farderaventyr 39. +2 Livskraft vid chockslag", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest40() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 40);
        assertEquals("farderaventyr 40. Infört en tradition", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(1, character.getUnitsExpertis());
    }

    @Test public void farderTest41() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 41);
        assertEquals("farderaventyr 41. Kartsamling", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("Geografi", getSetString(character.getEasilyLearnedSet(), "Geografi"));
        assertEquals("En kartsamling (+1T6 för geografi om personen planerar resa med karta)", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest42() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 42);
        assertEquals("farderaventyr 42. Klättrare", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Klättra", getSetString(character.getEasilyLearnedSet(), "Klättra"));
    }

    @Test public void farderTest43() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 43);
        assertEquals("farderaventyr 43. Koordinerad", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 43. När personen använder en fokus för rörelsefärdigheter så får personen +1T6", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest44() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 44);
        assertEquals("farderaventyr 44. Kärnfrisk", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("farderaventyr 44. +1T6 livskraft mot infektion", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest45() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 45);
        assertEquals("farderaventyr 45. Levt I annat land", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(2, character.getUnitLanguage());

    }

    @Test public void farderTest46() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 46);
        assertEquals("farderaventyr 46. Levt I exil", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitWild());
        assertEquals(1, character.getUnitLanguage());
    }

    @Test public void farderTest47() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 47);
        assertEquals("farderaventyr 47. List", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(3, character.getUnitWild());
    }

    @Test public void farderTest48() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 48);
        assertEquals("farderaventyr 48. Lokalsinne", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Grottsystem");
        assertEquals("Grottsystem", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Orientering", getSetString(character.getEasilyLearnedSet(), "Orientering"));
    }

    @Test public void farderTest49() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 49);
        assertEquals("farderaventyr 49. Lurat döden", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals("farderaventyr 49. +1T6 självkontroll vid skräck", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest50() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 50);
        assertEquals("farderaventyr 50. Lång expedition", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitWild());

    }

    @Test public void farderTest51() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 51);
        assertEquals("farderaventyr 51. Mörkersyn", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(3).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Mörkersyn");
        assertEquals("Mörkersyn", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void farderTest52() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 52);
        assertEquals("farderaventyr 52. Möte med det övernaturliga", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedSupernatural());

    }

    @Test public void farderTest53() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 53);
        assertEquals("farderaventyr 53. Namnet förevigat", character.getEventArraylist().get(0));
    }

    @Test public void farderTest54() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 54);
        assertEquals("farderaventyr 54. Nattsyn", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(3).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Nattsyn");
        assertEquals("Nattsyn", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void farderTest55() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 55);
        assertEquals("farderaventyr 55. Omvändande händelse", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
        assertEquals("farderaventyr 55. Välj före detta karaktärsdrag", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void farderTest56() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 56);
        assertEquals("farderaventyr 56. Onaturlig storm", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 56. Kan inte vara direkt mål för mystiska verk", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest57() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 57);
        assertEquals("farderaventyr 57. Ordnar sin egen mat", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Kock");
        assertEquals("Kock", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Naturlära", getSetString(character.getEasilyLearnedSet(), "Naturlära"));
        assertEquals("Jakt&Fiske", getSetString(character.getEasilyLearnedSet(), "Jakt&Fiske"));
    }

    @Test public void farderTest58() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 58);
        assertEquals("farderaventyr 58. Orädd", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 58. +3T6 självkontroll vid skräck", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest59() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 59);
        assertEquals("farderaventyr 59. Plundringsgods", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Kränga");
        assertEquals("Kränga", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Smyga", getSetString(character.getEasilyLearnedSet(), "Smyga"));
    }

    @Test public void farderTest60() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 60);
        assertEquals("farderaventyr 60. Publikfriare", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitSocial());
        assertEquals("farderaventyr 60. Återfår 1 fokus när personen uppträder med publik", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void farderTest61() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 61);
        assertEquals("farderaventyr 61. På fiendemark", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitLanguage());
    }

    @Test public void farderTest62() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 62);
        assertEquals("farderaventyr 62. Resa över Mundana", character.getEventArraylist().get(0));
        assertEquals("Kulturkännedom", getSetString(character.getEasilyLearnedSet(), "Kulturkännedom"));

    }

    @Test public void resaOverMundanaTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "resaovermundana", 1);
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(3, character.getUnitWild());
    }

    @Test public void resaOverMundanaTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "resaovermundana", 2);
        assertEquals(-2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(3, character.getUnitWild());
    }

    @Test public void resaOverMundanaTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "resaovermundana", 3);
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(3, character.getUnitWild());
    }

    @Test public void farderTest63() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 63);
        assertEquals("farderaventyr 63. Riddjur med ekipage", character.getEventArraylist().get(0));
        assertEquals("Köra vagn", getSetString(character.getEasilyLearnedSet(), "Köra vagn"));
        assertEquals(2, character.getUnitWild());
    }

    @Test public void farderTest64() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 64);
        assertEquals("farderaventyr 64. Rikligt belönad", character.getEventArraylist().get(0));
        assertEquals("Spel&Dobbel", getSetString(character.getEasilyLearnedSet(), "Spel&Dobbel"));
        assertEquals(2, character.getUnitSocial());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void farderTest65() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 65);
        assertEquals("farderaventyr 65. Rätt tid på rätt plats:", character.getEventArraylist().get(0));
    }

    @Test public void rattTidRattPlatsTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "ratttidrattplats", 1);
        assertEquals("ratttidrattplats 1. Hittat skatt", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitWild());
        assertEquals(1, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(500, character.getStartingFundsArrayList().get(0).getMod());

    }

    @Test public void rattTidRattPlatsTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "ratttidrattplats", 2);
        assertEquals("ratttidrattplats 2. Upptäckt sammansvärjning", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void rattTidRattPlatsTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "ratttidrattplats", 3);
        assertEquals("ratttidrattplats 3. Utfört Hjältedåd", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitCombat());
    }

    @Test public void farderTest66() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 66);
        assertEquals("farderaventyr 66. Sedd som hjälte", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void farderTest67() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 67);
        assertEquals("farderaventyr 67. Skarpsynt", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals("Genomsöka", getSetString(character.getEasilyLearnedSet(), "Genomsöka"));
    }

    @Test public void farderTest68() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 68);
        assertEquals("farderaventyr 68. Skicklig hantverkare", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitTrade());
    }

    @Test public void farderTest69() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 69);
        assertEquals("farderaventyr 69. Skicklig simmare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Simma", getSetString(character.getEasilyLearnedSet(), "Simma"));
    }

    @Test public void farderTest70() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 70);
        assertEquals("farderaventyr 70. Räddat ädling", character.getEventArraylist().get(0));
        assertEquals("Hovliv", getSetString(character.getEasilyLearnedSet(), "Hovliv"));
        assertEquals(2, character.getUnitSocial());
        assertEquals(3, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void farderTest71() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 71);
        assertEquals("farderaventyr 71. Sans och vett", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());
        assertEquals(3, character.getUnitOther());
    }

    @Test public void farderTest72() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 72);
        assertEquals("farderaventyr 72. Sjökort", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("Navigation", getSetString(character.getEasilyLearnedSet(), "Navigation"));
        assertEquals("Sjömannaskap", getSetString(character.getEasilyLearnedSet(), "Sjömannaskap"));
        assertEquals("farderaventyr 72. +1T6 på navigation när sjökort används", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void farderTest73() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 73);
        assertEquals("farderaventyr 73. Skicklig jägare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Genomsöka", getSetString(character.getEasilyLearnedSet(), "Genomsöka"));
        assertEquals("Jakt&Fiske", getSetString(character.getEasilyLearnedSet(), "Jakt&Fiske"));
    }

    @Test public void farderTest74() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 74);
        assertEquals("farderaventyr 74. Skrockfull", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
    }

    @Test public void farderTest75() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 75);
        assertEquals("farderaventyr 75. Skuld till väsen", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitWild());
        assertEquals(2, character.getUnitKnowledge());

    }

    @Test public void farderTest76() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 76);
        assertEquals("farderaventyr 76. Skumma krogar", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Supa");
        assertEquals("Supa", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Slagsmål", getSetString(character.getEasilyLearnedSet(), "Slagsmål"));
        assertEquals("Spel&Dobbel", getSetString(character.getEasilyLearnedSet(), "Spel&Dobbel"));
    }

    @Test public void farderTest77() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 77);
        assertEquals("farderaventyr 77. Snabb", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(0).getDice());
        assertEquals("Hoppa", getSetString(character.getEasilyLearnedSet(), "Hoppa"));
        assertEquals(2, character.getUnitAgility());

    }

    @Test public void farderTest78() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 78);
        assertEquals("farderaventyr 78. Snabb och smidig", character.getEventArraylist().get(0));
        assertEquals(-2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(0).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(1).getMod());
    }

    @Test public void farderTest79() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 79);
        assertEquals("farderaventyr 79. Sover djupt", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 79. +2 Fokus vid varje speltillfälle, svårväckt, kan inte agera förän efter 3 SR", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest80() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 80);
        assertEquals("farderaventyr 80. Splittrat ett äktenskap", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void farderTest81() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 81);
        assertEquals("farderaventyr 81. Stor kartsamling", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Kartritare");
        assertEquals("Kartritare", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Stor kartsamling (+1T6 på Geografi och Områdeskunskap när kartorna används)", character.getEquipmentArraylist().get(0));
    }

    @Test public void farderTest82() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 82);
        assertEquals("farderaventyr 82. Stor upptäckt", character.getEventArraylist().get(0));
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void storUpptacktTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "storupptackt",1);
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void storUpptacktTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "storupptackt", 2);
        assertEquals(4, character.getUnitKnowledge());
    }

    @Test public void storUpptacktTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "storupptackt",3);
        assertEquals(4, character.getUnitWild());
    }


    @Test public void farderTest83() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 83);
        assertEquals("farderaventyr 83. Sånger och sagor", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Sång&Musik", getSetString(character.getEasilyLearnedSet(), "Sång&Musik"));
        assertEquals("Berättarkonst", getSetString(character.getEasilyLearnedSet(), "Berättarkonst"));

    }

    @Test public void farderTest84() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 84);
        assertEquals("farderaventyr 84. Talangfull", character.getEventArraylist().get(0));
        assertEquals(4, character.getEasilyLearned());
    }

    @Test public void farderTest85() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 85);
        assertEquals("farderaventyr 85. Trofé", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void farderTest86() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 86);
        assertEquals("farderaventyr 86. Tur", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 86. Ett omslag per speltillfälle", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest87() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 87);
        assertEquals("farderaventyr 87. Udda beteende", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 87. Personen har en tvångshandling(s.207)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest88() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 88);
        assertEquals("farderaventyr 88. Uppmärksam", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getDice());
        assertEquals("Speja", getSetString(character.getEasilyLearnedSet(), "Speja"));

    }

    @Test public void farderTest89() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 89);
        assertEquals("farderaventyr 89. Utforskatt bortglömd plats", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitAgility());

    }

    @Test public void farderTest90() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 90);
        assertEquals("farderaventyr 90. Vandrare", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Marsch", getSetString(character.getEasilyLearnedSet(), "Marsch"));
    }

    @Test public void farderTest91() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 91);
        assertEquals("farderaventyr 91. Vig", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Hoppa", getSetString(character.getEasilyLearnedSet(), "Hoppa"));
    }

    @Test public void farderTest92() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 92);
        assertEquals("farderaventyr 92. Vildmarkens röst", character.getEventArraylist().get(0));
        assertEquals("farderaventyr 92. När personen använder vildmarksfärdighet så får denne 1T6 bonus", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void farderTest93() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 93);
        assertEquals("farderaventyr 93. Vildmarksliv", character.getEventArraylist().get(0));
    }

    @Test public void farderTest94() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 94);
        assertEquals("farderaventyr 94. Vägvisare", character.getEventArraylist().get(0));
        assertEquals("Orientering", getSetString(character.getEasilyLearnedSet(), "Orientering"));
        assertEquals(4, character.getUnitWild());
    }

    @Test public void farderTest95() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 95);
        assertEquals("farderaventyr 95. Vän med värdshusvärd", character.getEventArraylist().get(0));
        assertEquals("Charm", getSetString(character.getEasilyLearnedSet(), "Charm"));
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void farderTest96() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 96);
        assertEquals("farderaventyr 96. Återförenat ett älskande par", character.getEventArraylist().get(0));
    }

    @Test public void farderTest97() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 97);
        assertEquals("farderaventyr 97. Älskare", character.getEventArraylist().get(0));
    }

    @Test public void farderTest98() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 98);
        assertEquals("farderaventyr 98. Överlevt förföljerser", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Vädja");
        assertEquals("Vädja", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Gömma", getSetString(character.getEasilyLearnedSet(), "Gömma"));

    }

    @Test public void farderTest99() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 99);
        assertEquals("farderaventyr 99. Övernaturlig kroppskontroll", character.getEventArraylist().get(0));
    }

    @Test public void farderTest100() {
        Character character = new Character();
        dbTableInteract(character, conn, "farderaventyr", 100);
        assertEquals("farderaventyr 100. Händelserikt liv", character.getEventArraylist().get(0));
        assertEquals(2, character.getRollsExploration());
    }

    @Test public void kunskapmysterierTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 1);
        assertEquals("kunskapmysterier 1. Analytiskt sinne", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Logik");
        assertEquals("Logik", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Kalkylera", getSetString(character.getEasilyLearnedSet(), "Kalkylera"));
        assertEquals(2, character.getUnitKnowledge());



    }

    @Test public void kunskapmysterierTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 2);
        assertEquals("kunskapmysterier 2. Apokryfiska kunskaper", character.getEventArraylist().get(0));
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals("kunskapmysterier 2. +1T6 vid fokus på sociala och kunskapsfärdigheter om det gäller religion", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 3);
        assertEquals("kunskapmysterier 3. Arvinge", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest4() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 4);
        assertEquals("kunskapmysterier 4. Asketiskt liv", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(4).getDice());
        assertEquals(2, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest5() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 5);
        assertEquals("kunskapmysterier 5. Avslöjat mörk familjehemlighet", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getUnitSocial());

    }

    @Test public void kunskapmysterierTest6() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 6);
        assertEquals("kunskapmysterier 6. Befriat kättare", character.getEventArraylist().get(0));
        assertEquals("Gömma", getSetString(character.getEasilyLearnedSet(), "Gömma"));
        assertEquals("Smyga", getSetString(character.getEasilyLearnedSet(), "Smyga"));
    }

    @Test public void kunskapmysterierTest7() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 7);
        assertEquals("kunskapmysterier 7. Besökt helgedomar", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitMysteries());

    }

    @Test public void kunskapmysterierTest8() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 8);
        assertEquals("kunskapmysterier 8. Blivit av med förbannelse", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest9() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 9);
        assertEquals("kunskapmysterier 9. Botemedel mot sjukdom, botade indivivider", character.getEventArraylist().get(0));
        assertEquals("Kirurgi", getSetString(character.getEasilyLearnedSet(), "Kirurgi"));
        assertEquals("Läkekonst", getSetString(character.getEasilyLearnedSet(), "Läkekonst"));
    }

    @Test public void kunskapmysterierTest10() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 10);
        assertEquals("kunskapmysterier 10. Ceremonimästare", character.getEventArraylist().get(0));
        assertEquals("Ceremoni", getSetString(character.getEasilyLearnedSet(), "Ceremoni"));
        assertEquals("Kanalisera", getSetString(character.getEasilyLearnedSet(), "Kanalisera"));
        assertEquals(3, character.getMysteries());
    }

    @Test public void kunskapmysterierTest11() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 11);
        assertEquals("kunskapmysterier 11. Deltagit I rit", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest12() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 12);
        assertEquals("kunskapmysterier 12. Demonisk avkomma", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedSupernatural());
    }

    @Test public void kunskapmysterierTest13() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 13);
        assertEquals("kunskapmysterier 13. Djurens frände", character.getEventArraylist().get(0));
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Djurvän");
        assertEquals("Djurvän", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void kunskapmysterierTest14() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 14);
        assertEquals("kunskapmysterier 14. Drar till sig det övernaturliga", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(2, character.getJadedSupernatural());

    }

    @Test public void kunskapmysterierTest15() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 15);
        assertEquals("kunskapmysterier 15. Drömmar från ett annat liv", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());

    }

    @Test public void kunskapmysterierTest16() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 16);
        assertEquals("kunskapmysterier 16. Elementkännare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(3).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Elementkännare");
        assertEquals("Elementkännare", temp.getName());
        assertEquals(4, temp.getDice());

    }

    @Test public void kunskapmysterierTest17() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 17);
        assertEquals("kunskapmysterier 17. En tid som död", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
        assertEquals("kunskapmysterier 17. +1T6 självkontroll vid nedbrytning", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest18() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 18);
        assertEquals("kunskapmysterier 18. Exceptionellt minne", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getDice());

    }

    @Test public void kunskapmysterierTest19() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 19);
        assertEquals("kunskapmysterier 19. Experiment", character.getEventArraylist().get(0));
    }

    @Test public void experimentTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 1);
        assertEquals(-3, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void experimentTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 2);
        assertEquals(-3, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void experimentTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 3);
        assertEquals(-3, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
    }

    @Test public void experimentTest4() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 4);
        assertEquals(-3, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void experimentTest5() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 5);
        assertEquals(-3, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void experimentTest6() {
        Character character = new Character();
        dbTableInteract(character, conn, "experiment", 6);
        assertEquals(-3, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getDice());
    }

    @Test public void kunskapmysterierTest20() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 20);
        assertEquals("kunskapmysterier 20. Familiarii", character.getEventArraylist().get(0));
        assertEquals("Naturlära", getSetString(character.getEasilyLearnedSet(), "Naturlära"));
        assertEquals(3, character.getUnitMysteries());
    }

    @Test public void kunskapmysterierTest21() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 21);
        assertEquals("kunskapmysterier 21. Formelsamling", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitMysteries());
        assertEquals("Formelsamling innehållande 5 mysterier", character.getEquipmentArraylist().get(0));
    }

    @Test public void kunskapmysterierTest22() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 22);
        assertEquals("kunskapmysterier 22. Funnit förlorad kunskap", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest23() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 23);
        assertEquals("kunskapmysterier 23. Fått medaljong", character.getEventArraylist().get(0));
        assertEquals("Medaljongen ger +1T6 på valfri färdighet en gång per speltilfälle", character.getEquipmentArraylist().get(0));
    }

    @Test public void kunskapmysterierTest24() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 24);
        assertEquals("kunskapmysterier 24. Föraktfull", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedExposure());
        assertEquals("kunskapmysterier 24. -1T6 på sociala färdígheter jämte ett specifikt folkslag(väljs)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest25() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 25);
        assertEquals("kunskapmysterier 25. Förbannelse", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest26() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 26);
        assertEquals("kunskapmysterier 26. Förbjuden kult", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest27() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 27);
        assertEquals("kunskapmysterier 27. Förbjuden kunskap, fiende:", character.getEventArraylist().get(0));
        assertEquals(6, character.getUnitMysteries());
        assertEquals(2, character.getMysteries());
    }

    @Test public void kunskapmysterierTest28() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 28);
        assertEquals("kunskapmysterier 28. Förbjuden sammanslutning", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getMod());
    }

    @Test public void kunskapmysterierTest29() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 29);
        assertEquals("kunskapmysterier 29. Förbjuden skrift", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest30() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 30);
        assertEquals("kunskapmysterier 30. Fördjupad självinsikt", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Meditera");
        assertEquals("Meditera", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void kunskapmysterierTest31() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 31);
        assertEquals("kunskapmysterier 31. Försvaga vandöd", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 31. Alla odöda får -1T6 på alla slag I närheten av personen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest32() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 32);
        assertEquals("kunskapmysterier 32. Givmild beskyddare:", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitKnowledge());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void kunskapmysterierTest33() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 33);
        assertEquals("kunskapmysterier 33. Glömd kunskap", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest34() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 34);
        assertEquals("kunskapmysterier 34. Går I sömnen", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest35() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 35);
        assertEquals("kunskapmysterier 35. Hedniska riter", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
    }

    @Test public void kunskapmysterierTest36() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 36);
        assertEquals("kunskapmysterier 36. Heligt föremål", character.getEventArraylist().get(0));
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals("Ett heligt föremål", character.getEquipmentArraylist().get(0));
    }

    @Test public void kunskapmysterierTest37() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 37);
        assertEquals("kunskapmysterier 37. Hemligt bibliotek", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest38() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 38);
        assertEquals("kunskapmysterier 38. Historisk förebild", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Historiskt namn");
        assertEquals("Historiskt namn", temp.getName());
        assertEquals(4, temp.getDice());

    }

    @Test public void kunskapmysterierTest39() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 39);
        assertEquals("kunskapmysterier 39. Hoppfull", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 39. +2T6 självkontroll vid nedbrytning", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest40() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 40);
        assertEquals("kunskapmysterier 40. Hängiven följeslagare:", character.getEventArraylist().get(0));
        assertEquals("Undervisa", getSetString(character.getEasilyLearnedSet(), "Undervisa"));
        assertEquals(2, character.getUnitKnowledge());

    }

    @Test public void kunskapmysterierTest41() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 41);
        assertEquals("kunskapmysterier 41. Insikt I köttet", character.getEventArraylist().get(0));
        assertEquals("Kirurgi", getSetString(character.getEasilyLearnedSet(), "Kirurgi"));
        assertEquals("kunskapmysterier 41. Inga komplikationer vid operationer", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest42() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 42);
        assertEquals("kunskapmysterier 42. Intensiva studier", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(-2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("2 kunskapsfärdigheter", getSetString(character.getEasilyLearnedSet(), "2 kunskapsfärdigheter"));
        assertEquals("2 Sociala färdigheter", getSetString(character.getHardLearnedSet(), "2 Sociala färdigheter"));
        assertEquals(3, character.getUnitKnowledge());
    }

    @Test public void kunskapmysterierTest43() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 43);
        assertEquals("kunskapmysterier 43. Iögonfallande drag", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitsTraits());
        assertEquals("kunskapmysterier 43. Om fokus används på kännetecken får personen +1T6", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void kunskapmysterierTest44() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 44);
        assertEquals("kunskapmysterier 44. Jordesoldatens välsignelse", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Behaga");
        assertEquals("Behaga", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Skomakare");
        assertEquals("Skomakare", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals(2, character.getUnitCombat());
    }

    @Test public void kunskapmysterierTest45() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 45);
        assertEquals("kunskapmysterier 45. Järnvilja", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());

    }

    @Test public void kunskapmysterierTest46() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 46);
        assertEquals("kunskapmysterier 46. Kastat förbannelse", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest47() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 47);
        assertEquals("kunskapmysterier 47. Kommit över hemlighet", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitKnowledge());

    }

    @Test public void kunskapmysterierTest48() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 48);
        assertEquals("kunskapmysterier 48. Koncentrerad", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 48. Om personen använder fokus på kunskapsfärdigheter får denne +1T6", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void kunskapmysterierTest49() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 49);
        assertEquals("kunskapmysterier 49. Kontakt med det mystiska", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 49. Om personen använder fokus för mystikfärdigheter får denne +1T6", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void kunskapmysterierTest50() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 50);
        assertEquals("kunskapmysterier 50. Konverterad av :", character.getEventArraylist().get(0));
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals(3, character.getUnitKnowledge());
    }

    @Test public void kunskapmysterierTest51() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 51);
        assertEquals("kunskapmysterier 51. Kraftens mästare", character.getEventArraylist().get(0));
        assertEquals(2, character.getMysteries());
    }

    @Test public void kunskapmysterierTest52() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 52);
        assertEquals("kunskapmysterier 52. Kraft för väsen", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 52. Personen behöver inte äta eller dricka om denne inte är på magidöd plats", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest53() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 53);
        assertEquals("kunskapmysterier 53. Kunskap om de mörka makterna", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("Filosofi", getSetString(character.getEasilyLearnedSet(), "Filosofi"));
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
    }

    @Test public void kunskapmysterierTest54() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 54);
        assertEquals("kunskapmysterier 54. Känslokall", character.getEventArraylist().get(0));
    }

    @Test public void kanslokallTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 1);
        assertEquals(3, character.getJadedViolence());
    }

    @Test public void kanslokallTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 2);
        assertEquals(3, character.getJadedExposure());
    }

    @Test public void kanslokallTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 3);
        assertEquals(3, character.getJadedSupernatural());
    }

    @Test public void kanslokallTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 4);
        assertEquals(2, character.getJadedViolence());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void kanslokallTest5 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 5);
        assertEquals(2, character.getJadedExposure());
        assertEquals(1, character.getJadedSupernatural());
    }

    @Test public void kanslokallTest6 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 6);
        assertEquals(2, character.getJadedSupernatural());
        assertEquals(1, character.getJadedViolence());
    }

    @Test public void kanslokallTest7 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 7);
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getJadedExposure());
    }

    @Test public void kanslokallTest8 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 8);
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getJadedSupernatural());
    }

    @Test public void kanslokallTest9 () {
        Character character = new Character();
        dbTableInteract(character, conn, "kanslokall", 9);
        assertEquals(1, character.getJadedSupernatural());
        assertEquals(1, character.getJadedViolence());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void kunskapmysterierTest55() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 55);
        assertEquals("kunskapmysterier 55. Ljusbringarens välsignelse", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Tolka religiösa skrifter");
        assertEquals("Tolka religiösa skrifter", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Uppvigla");
        assertEquals("Uppvigla", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
    }

    @Test public void kunskapmysterierTest56() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 56);
        assertEquals("kunskapmysterier 56. Lyft förbannelse", character.getEventArraylist().get(0));
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
        assertEquals(1, character.getJadedSupernatural());
        assertEquals(4, character.getUnitKnowledge());

    }

    @Test public void kunskapmysterierTest57() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 57);
        assertEquals("kunskapmysterier 57. Läkande beröring", character.getEventArraylist().get(0));
        assertEquals("Läkekonst", getSetString(character.getEasilyLearnedSet(), "Läkekonst"));
        assertEquals("kunskapmysterier 57. Om personen vårdar en annan så får denne +2 läkningstakt", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest58() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 58);
        assertEquals("kunskapmysterier 58. Lärling", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals("Undervisa", getSetString(character.getEasilyLearnedSet(), "Undervisa"));
    }

    @Test public void kunskapmysterierTest59() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 59);
        assertEquals("kunskapmysterier 59. Lärling till lärd man", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("Filosofi", getSetString(character.getEasilyLearnedSet(), "Filosofi"));
        assertEquals(3, character.getUnitKnowledge());

    }

    @Test public void kunskapmysterierTest60() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 60);
        assertEquals("kunskapmysterier 60. Lärling till mystiker", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitKnowledge());
        assertEquals(2, character.getUnitMysteries());
    }

    @Test public void kunskapmysterierTest61() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 61);
        assertEquals("kunskapmysterier 61. Medicinskt kunnande", character.getEventArraylist().get(0));
        assertEquals("Läkekonst", getSetString(character.getEasilyLearnedSet(), "Läkekonst"));
        assertEquals("Naturlära", getSetString(character.getEasilyLearnedSet(), "Naturlära"));
        assertEquals(3, character.getUnitWild());

    }

    @Test public void kunskapmysterierTest62() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 62);
        assertEquals("kunskapmysterier 62. Mentor", character.getEventArraylist().get(0));
    }

    @Test public void kunskapmysterierTest63() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 63);
        assertEquals("kunskapmysterier 63. Milargoks välsignelse", character.getEventArraylist().get(0));
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Sjukligt utseende");
        assertEquals("Sjukligt utseende", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Författa");
        assertEquals("Författa", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals("Undervisa", getSetString(character.getEasilyLearnedSet(), "Undervisa"));

    }

    @Test public void kunskapmysterierTest64() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 64);
        assertEquals("kunskapmysterier 64. Minnesförlust", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest65() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 65);
        assertEquals("kunskapmysterier 65. Mörk hemlighet, en person känner till den:", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest66() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 66);
        assertEquals("kunskapmysterier 66. Möte med det fasansfulla", character.getEventArraylist().get(0));
        assertEquals(-2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(3, character.getJadedSupernatural());
    }

    @Test public void kunskapmysterierTest67() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 67);
        assertEquals("kunskapmysterier 67. Möte med det okända", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsTraits());
        assertEquals(4, character.getUnitOther());

    }

    @Test public void kunskapmysterierTest68() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 68);
        assertEquals("kunskapmysterier 68. Mött spåkvinna och:", character.getEventArraylist().get(0));
    }

    @Test public void mottSpaKvinnaTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "mottspakvinna", 1);
        assertEquals("mottspakvinna 1. Tror på spådomen", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitMysteries());
        assertEquals(1, character.getJadedSupernatural());

    }

    @Test public void mottSpaKvinnaTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "mottspakvinna", 2);
        assertEquals("mottspakvinna 2. Tror på egna ödet", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitKnowledge());

    }

    @Test public void kunskapmysterierTest69() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 69);
        assertEquals("kunskapmysterier 69. Mött svartkonstnär och:", character.getEventArraylist().get(0));
    }

    @Test public void mottSvartKonstnarTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "mottsvartkonstnar", 1);
        assertEquals("mottsvartkonstnar 1. Överlämnat till inkvisitionen", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitSocial());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void mottSvartKonstnarTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "mottsvartkonstnar", 2);
        assertEquals("mottsvartkonstnar 2. Dragit lärdom av svartkonstnären", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitMysteries());
    }

    @Test public void kunskapmysterierTest70() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 70);
        assertEquals("kunskapmysterier 70. Närvaro", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(2).getDice());
    }

    @Test public void kunskapmysterierTest71() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 71);
        assertEquals("kunskapmysterier 71. Offerriter", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 71. En gång per speltillfälle, offra djur för fokus(litet djur:1, medel:2,stort:4, människa:8)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest72() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 72);
        assertEquals("kunskapmysterier 72. Orsakat olycka", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getJadedExposure());
    }

    @Test public void kunskapmysterierTest73() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 73);
        assertEquals("kunskapmysterier 73. Pakt med mörka makter", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedSupernatural());
        assertEquals(3, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest74() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 74);
        assertEquals("kunskapmysterier 74. Pakt med väsen", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest75() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 75);
        assertEquals("kunskapmysterier 75. Provat underliga droger", character.getEventArraylist().get(0));
    }

    @Test public void provatUnderligaDrogerTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "provatunderligadroger", 1);
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
    }

    @Test public void provatUnderligaDrogerTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "provatunderligadroger", 2);
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
    }

    @Test public void provatUnderligaDrogerTest3 () {
        Character character = new Character();
        dbTableInteract(character, conn, "provatunderligadroger", 3);
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
    }

    @Test public void provatUnderligaDrogerTest4 () {
        Character character = new Character();
        dbTableInteract(character, conn, "provatunderligadroger", 4);
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
    }

    @Test public void kunskapmysterierTest76() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 76);
        assertEquals("kunskapmysterier 76. Pyrotropisk dragning", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 76. Eldskydd 2T6, får igen 3 fokus en gång per speltillfälle om något löses med eld", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest77() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 77);
        assertEquals("kunskapmysterier 77. Religiös upplevelse", character.getEventArraylist().get(0));
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals(4, character.getUnitKnowledge());
    }

    @Test public void kunskapmysterierTest78() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 78);
        assertEquals("kunskapmysterier 78. Relik", character.getEventArraylist().get(0));
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals("En relik", character.getEquipmentArraylist().get(0));
    }

    @Test public void kunskapmysterierTest79() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 79);
        assertEquals("kunskapmysterier 79. Repellera vandöd", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 79. vandöda med rank 16 eller under kan inte anfalla personen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest80() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 80);
        assertEquals("kunskapmysterier 80. Sedd som helgon av:", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void kunskapmysterierTest81() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 81);
        assertEquals("kunskapmysterier 81. Skrock och sagor", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Folktro");
        assertEquals("Folktro", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Vidskepelse");
        assertEquals("Vidskepelse", temp2.getName());
        assertEquals(4, temp2.getDice());
        assertEquals("Berättarkonst", getSetString(character.getEasilyLearnedSet(), "Berättarkonst"));
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
    }

    @Test public void kunskapmysterierTest82() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 82);
        assertEquals("kunskapmysterier 82. Strikt läromästare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void kunskapmysterierTest83() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 83);
        assertEquals("kunskapmysterier 83. Smärtans klarhet", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 83. En gång per speltillfälle kan personen orsaka 1 smärta på sig själv för att återfå 3 fokus", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest84() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 84);
        assertEquals("kunskapmysterier 84. Sorgetyngd", character.getEventArraylist().get(0));
        assertEquals("kunskapmysterier 84. Personen är Deprimerad(Störning s.206)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest85() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 85);
        assertEquals("kunskapmysterier 85. Spetskunskap", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitsExpertis());
        assertEquals("kunskapmysterier 85. Om fokus används på expertiser får personen +1T6", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest86() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 86);
        assertEquals("kunskapmysterier 86. Språksinne", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(6, character.getUnitLanguage());
    }

    @Test public void kunskapmysterierTest87() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 87);
        assertEquals("kunskapmysterier 87. Synsk", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(3).getDice());
    }

    @Test public void kunskapmysterierTest88() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 88);
        assertEquals("kunskapmysterier 88. Tala med djuren", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Djurträning");
        assertEquals("Djurträning", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void kunskapmysterierTest89() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 89);
        assertEquals("kunskapmysterier 89. Teoretiker", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Astrologi");
        assertEquals("Astrologi", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Teologi", getSetString(character.getEasilyLearnedSet(), "Teologi"));
        assertEquals("Teoretisk magi", getSetString(character.getEasilyLearnedSet(), "Teoretisk magi"));
    }

    @Test public void kunskapmysterierTest90() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 90);
        assertEquals("kunskapmysterier 90. Tid av galenskap", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals("kunskapmysterier 90. Personen har två störningar(s.206)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void kunskapmysterierTest91() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 91);
        assertEquals("kunskapmysterier 91. Tidskänsla", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
    }

    @Test public void kunskapmysterierTest92() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 92);
        assertEquals("kunskapmysterier 92. Tolkat stjärnorna", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Astrologi");
        assertEquals("Astrologi", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(3, character.getUnitKnowledge());
    }

    @Test public void kunskapmysterierTest93() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 93);
        assertEquals("kunskapmysterier 93. Torterad", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest94() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 94);
        assertEquals("kunskapmysterier 94. Udars välsignelse", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Flagellera");
        assertEquals("Flagellera", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Argumentera", getSetString(character.getEasilyLearnedSet(), "Argumentera"));
    }

    @Test public void kunskapmysterierTest95() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 95);
        assertEquals("kunskapmysterier 95. Udda kunnande", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitsExpertis());
    }

    @Test public void kunskapmysterierTest96() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 96);
        assertEquals("kunskapmysterier 96. Undersökt mystisk plats", character.getEventArraylist().get(0));
        assertEquals("Ett mystiskt föremål(värde 4T6*50 för rätt köpare)", character.getEquipmentArraylist().get(0));
    }

    @Test public void kunskapmysterierTest97() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 97);
        assertEquals("kunskapmysterier 97. Utskrattad", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedExposure());
    }

    @Test public void kunskapmysterierTest98() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 98);
        assertEquals("kunskapmysterier 98. Välutbildad", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(4, character.getUnitKnowledge());
    }

    @Test public void kunskapmysterierTest99() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 99);
        assertEquals("kunskapmysterier 99. Vän med väsen", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(3, character.getUnitOther());
    }

    @Test public void kunskapmysterierTest100() {
        Character character = new Character();
        dbTableInteract(character, conn, "kunskapmysterier", 100);
        assertEquals("kunskapmysterier 100. Händelserikt liv", character.getEventArraylist().get(0));
        assertEquals(2, character.getRollsKnowledge());
    }

    @Test public void striderdrabbningarTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 1);
        assertEquals("striderdrabbningar 1. Aktivt liv", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getUnitAgility());

    }

    @Test public void striderdrabbningarTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 2);
        assertEquals("striderdrabbningar 2. Ambidexter", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("striderdrabbningar 2. Inga avdrag för att inte använda huvudhand, ingen extra utmattning från försvarsval med 2 vapen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 3);
        assertEquals("striderdrabbningar 3. Armstyrka", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals("striderdrabbningar 3. Ignorerar efterverkningen: Tappar", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest4() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 4);
        assertEquals("striderdrabbningar 4. Avståndsbedömare", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Armborst", getSetString(character.getEasilyLearnedSet(), "Armborst"));
        assertEquals("Båge", getSetString(character.getEasilyLearnedSet(), "Båge"));
        assertEquals("Kastvapen", getSetString(character.getEasilyLearnedSet(), "Kastvapen"));
    }

    @Test public void striderdrabbningarTest5() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 5);
        assertEquals("striderdrabbningar 5. Avvärjt uppror", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Soldatliv");
        assertEquals("Soldatliv", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Ledarskap", getSetString(character.getEasilyLearnedSet(), "Ledarskap"));
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void striderdrabbningarTest6() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 6);
        assertEquals("striderdrabbningar 6. Belägring", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Krigsmaskiner");
        assertEquals("Krigsmaskiner", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
    }

    @Test public void striderdrabbningarTest7() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 7);
        assertEquals("striderdrabbningar 7. Besegrat monster", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Monsterkunskap");
        assertEquals("Monsterkunskap", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void striderdrabbningarTest8() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 8);
        assertEquals("striderdrabbningar 8. Bita ihop", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 8. personen kan ignorera smärta(ta bort all smärtavdrag mot 1 fokus)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest9() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 9);
        assertEquals("striderdrabbningar 9. Bärsärkaraseri", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 9. Mot en fokus kan personen under en scen ignorera -1T6 smärta, göra +1T6 skada med kraftiga utfall men inte utföra försvar", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest10() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 10);
        assertEquals("striderdrabbningar 10. Chockresistent", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 10. +2 livskraft vid chockslag", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest11() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 11);
        assertEquals("striderdrabbningar 11. Destruktivt förhållande med:", character.getEventArraylist().get(0));
    }

    @Test public void striderdrabbningarTest12() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 12);
        assertEquals("striderdrabbningar 12. Drabbning till havs", character.getEventArraylist().get(0));
        assertEquals("Simma", getSetString(character.getEasilyLearnedSet(), "Simma"));
        assertEquals("Sjömannaskap", getSetString(character.getEasilyLearnedSet(), "Sjömannaskap"));
        assertEquals(2, character.getUnitWild());
    }

    @Test public void striderdrabbningarTest13() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 13);
        assertEquals("striderdrabbningar 13. Dragning till våld", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(4, character.getUnitCombat());
        assertEquals("Kamp", character.getSecondaryCharacteristic());
    }

    @Test public void striderdrabbningarTest14() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 14);
        assertEquals("striderdrabbningar 14. Dräpande anfall", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 14. För 1 fokus +1T6 skada, max 2 fokus för +2T6 skada", character.getSpecialTraitsArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(7).getMod());
    }

    @Test public void striderdrabbningarTest15() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 15);
        assertEquals("striderdrabbningar 15. Dräpt kamrat", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void striderdrabbningarTest16() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 16);
        assertEquals("striderdrabbningar 16. Dubbelhänt", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("striderdrabbningar 16. Vapenskadan för vapen I två händer ökar med 2", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest17() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 17);
        assertEquals("striderdrabbningar 17. Eldigt stridstal", character.getEventArraylist().get(0));
        assertEquals("Argumentera", getSetString(character.getEasilyLearnedSet(), "Argumentera"));
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void striderdrabbningarTest18() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 18);
        assertEquals("striderdrabbningar 18. Eskort åt bortskämd ädling", character.getEventArraylist().get(0));
        assertEquals(3, character.getJadedExposure());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void striderdrabbningarTest19() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 19);
        assertEquals("striderdrabbningar 19. Exotisk stridskonst", character.getEventArraylist().get(0));
        assertEquals("Slagsmål", getSetString(character.getEasilyLearnedSet(), "Slagsmål"));
        assertEquals(3, character.getUnitCombat());
        assertEquals("striderdrabbningar 19. Alla obeväpnade attacker blir \"vådliga\"", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest20() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 20);
        assertEquals("striderdrabbningar 20. Farlig förbindelse", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void striderdrabbningarTest21() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 21);
        assertEquals("striderdrabbningar 21. Fiende inom familjen", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitWild());
        assertEquals("striderdrabbningar 21. Om personen dödar sin släkting får han nedbrytning 60, om någon annan gör det 45", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest22() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 22);
        assertEquals("striderdrabbningar 22. Finna blotta", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("striderdrabbningar 22. För en fokus kan personen välja kroppsdel för en attack", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest23() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 23);
        assertEquals("striderdrabbningar 23. Flytt från fångenskap", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Utbrytarkonst");
        assertEquals("Utbrytarkonst", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(4, character.getUnitAgility());
    }

    @Test public void striderdrabbningarTest24() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 24);
        assertEquals("striderdrabbningar 24. Frisk", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("striderdrabbningar 24. +2T6 livskraft mot infektioner", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest25() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 25);
        assertEquals("striderdrabbningar 25. Fruktansvärd handling", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedExposure());

    }

    @Test public void striderdrabbningarTest26() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 26);
        assertEquals("striderdrabbningar 26. Tid som fånge tillsammans med:", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(3, character.getUnitCombat());

    }

    @Test public void striderdrabbningarTest27() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 27);
        assertEquals("striderdrabbningar 27. Förlorat vapenbröder", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void striderdrabbningarTest28() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 28);
        assertEquals("striderdrabbningar 28. Förnedrat furste", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitAgility());
        assertEquals(3, character.getUnitWild());
        assertEquals("striderdrabbningar 28. Pris på sitt huvud(500s)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest29() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 29);
        assertEquals("striderdrabbningar 29. Förutse motståndarens drag", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 29. Om personen vinner motståndsslag I närstrid kan denne för 2 fokus få 1 övertag", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest30() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 30);
        assertEquals("striderdrabbningar 30. Genialisk taktisk manöver", character.getEventArraylist().get(0));
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
        assertEquals(3, character.getUnitKnowledge());
    }

    @Test public void striderdrabbningarTest31() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 31);
        assertEquals("striderdrabbningar 31. Ger inte upp", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 31. Alla avdrag för smärta minskar med 1T6", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest32() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 32);
        assertEquals("striderdrabbningar 32. Gladiatorkamp", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals(3, character.getUnitCombat());
    }

    @Test public void striderdrabbningarTest33() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 33);
        assertEquals("striderdrabbningar 33. God kondition", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getDice());
    }

    @Test public void striderdrabbningarTest34() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 34);
        assertEquals("striderdrabbningar 34. Hederskodex", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("striderdrabbningar 34. kopplas till karaktärsdrag", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest35() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 35);
        assertEquals("striderdrabbningar 35. Helare", character.getEventArraylist().get(0));
        assertEquals("Läkekonst", getSetString(character.getEasilyLearnedSet(), "Läkekonst"));
        assertEquals(2, character.getUnitKnowledge());

    }

    @Test public void striderdrabbningarTest36() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 36);
        assertEquals("striderdrabbningar 36. Hemsökt av gast som föreställer:", character.getEventArraylist().get(0));
        assertEquals("Ockultism", getSetString(character.getEasilyLearnedSet(), "Ockultism"));
        assertEquals(2, character.getJadedSupernatural());
        assertEquals(2, character.getUnitKnowledge());
    }

    @Test public void striderdrabbningarTest37() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 37);
        assertEquals("striderdrabbningar 37. Hårdhudad", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 37.  +2T6 motstånd mot amputation och bryt", character.getSpecialTraitsArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(8).getMod());
    }

    @Test public void striderdrabbningarTest38() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 38);
        assertEquals("striderdrabbningar 38. Kastmästare", character.getEventArraylist().get(0));
        assertEquals("Kastvapen", getSetString(character.getEasilyLearnedSet(), "Kastvapen"));
        assertEquals("striderdrabbningar 38. Alla kastvapen gör +2T6 skada", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest39() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 39);
        assertEquals("striderdrabbningar 39. Kontakt med makterna", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 39. Om personen ber(ca 5min) och spenderar 1 fokus så får personen +1T6 på allt under striden", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest40() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 40);
        assertEquals("striderdrabbningar 40. Kraftigt byggd", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(5).getDice());
    }

    @Test public void striderdrabbningarTest41() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 41);
        assertEquals("striderdrabbningar 41. Krigsskada", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(7).getDice());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Ärr");
        assertEquals("Ärr", temp.getName());
        assertEquals(4, temp.getDice());

    }

    @Test public void striderdrabbningarTest42() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 42);
        assertEquals("striderdrabbningar 42. Kurirryttare", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Rida", getSetString(character.getEasilyLearnedSet(), "Rida"));
        assertEquals("Geografi", getSetString(character.getEasilyLearnedSet(), "Geografi"));
    }

    @Test public void striderdrabbningarTest43() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 43);
        assertEquals("striderdrabbningar 43. Kännedom om nervpunkter", character.getEventArraylist().get(0));
        assertEquals("Stav", getSetString(character.getEasilyLearnedSet(), "Stav"));
        assertEquals("striderdrabbningar 43. +1T6 I skada med stavar", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest44() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 44);
        assertEquals("striderdrabbningar 44. Lett räd", character.getEventArraylist().get(0));
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
        assertEquals("Ledarskap", getSetString(character.getEasilyLearnedSet(), "Ledarskap"));
    }

    @Test public void striderdrabbningarTest45() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 45);
        assertEquals("striderdrabbningar 45. Levande vapen", character.getEventArraylist().get(0));
        assertEquals("Slagsmål", getSetString(character.getEasilyLearnedSet(), "Slagsmål"));
        assertEquals("striderdrabbningar 45. +2T6 I skada vid obeväpnade anfall", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest46() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 46);
        assertEquals("striderdrabbningar 46. Livvakt åt befälhavare", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitKnowledge());
    }

    @Test public void striderdrabbningarTest47() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 47);
        assertEquals("striderdrabbningar 47. Lång resa", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Marsch", getSetString(character.getEasilyLearnedSet(), "Marsch"));
    }

    @Test public void striderdrabbningarTest48() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 48);
        assertEquals("striderdrabbningar 48. Läkekött", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 48. Läkningstakt +1", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest49() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 49);
        assertEquals("striderdrabbningar 49. Läser av motståndaren", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(1).getDice());

    }

    @Test public void striderdrabbningarTest50() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 50);
        assertEquals("striderdrabbningar 50. Lätt beväpning", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("valfri vapenfärdighet", getSetString(character.getEasilyLearnedSet(), "valfri vapenfärdighet"));
        assertEquals("Valfritt lätt vapen med +2 I skada", character.getEquipmentArraylist().get(0));

    }

    @Test public void striderdrabbningarTest51() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 51);
        assertEquals("striderdrabbningar 51. Lätt rustad", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Valfritt lätt pansar med +2 pansar", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest52() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 52);
        assertEquals("striderdrabbningar 52. Medeltung beväpning", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Valfritt medeltungt vapen med +2 I skada", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest53() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 53);
        assertEquals("striderdrabbningar 53. Medeltungt rustad", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Valfritt medeltungt pansar med +2 pansar", character.getEquipmentArraylist().get(0));


    }

    @Test public void striderdrabbningarTest54() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 54);
        assertEquals("striderdrabbningar 54. Mirakulös uthållighet", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 54. +1T6 livskraft mot infektion och blödning(vid inre skada slås resultatet 2 ggr, lägsta resultatet väljs)", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest55() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 55);
        assertEquals("striderdrabbningar 55. Misshandlad och förnedrad", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(1, character.getJadedViolence());
        assertEquals(3, character.getUnitCombat());
    }

    @Test public void striderdrabbningarTest56() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 56);
        assertEquals("striderdrabbningar 56. Många liv på sitt samvete, fiende:", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedViolence());
    }

    @Test public void striderdrabbningarTest57() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 57);
        assertEquals("striderdrabbningar 57. Mästersmitt vapen", character.getEventArraylist().get(0));
        assertEquals("Valfritt vapen, Vapnet gör +1T6 skada och har egenskapen \"vådlig\"", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest58() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 58);
        assertEquals("striderdrabbningar 58. Mött rustningsmästare", character.getEventArraylist().get(0));
        assertEquals("Valfri helrustning med antingen +3 pansar eller 8 mindre belastning", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest59() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 59);
        assertEquals("striderdrabbningar 59. Njuter av striden", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getUnitCombat());
        assertEquals("Kamp", character.getSecondaryCharacteristic());
    }

    @Test public void striderdrabbningarTest60() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 60);
        assertEquals("striderdrabbningar 60. Packåsna", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(-8, character.getEncumbranceFactor());
    }

    @Test public void striderdrabbningarTest61() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 61);
        assertEquals("striderdrabbningar 61. Reslig", character.getEventArraylist().get(0));
        assertEquals(-2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(5).getMod());

    }

    @Test public void striderdrabbningarTest62() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 62);
        assertEquals("striderdrabbningar 62. Respektingivande ärr", character.getEventArraylist().get(0));
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Ärr");
        assertEquals("Ärr", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Injaga fruktan", getSetString(character.getEasilyLearnedSet(), "Injaga fruktan"));

    }

    @Test public void striderdrabbningarTest63() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 63);
        assertEquals("striderdrabbningar 63. Råstark", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(5).getMod());
        assertEquals(2, character.getDerivedAttributesArrayList().get(7).getMod());

    }

    @Test public void striderdrabbningarTest64() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 64);
        assertEquals("striderdrabbningar 64. Saknar öga", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("Injaga fruktan", getSetString(character.getEasilyLearnedSet(), "Injaga fruktan"));
        assertEquals("striderdrabbningar 64. Saknar 1 öga(s.193)", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest65() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 65);
        assertEquals("striderdrabbningar 65. Sargande anfall", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(7).getMod());
        assertEquals("striderdrabbningar 65. +1 på tabellslag för allvarlig skada när personen anfaller", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest66() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 66);
        assertEquals("striderdrabbningar 66. Seglivad", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 66. +2 Livskraft vid dödsslag och infektioner", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest67() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 67);
        assertEquals("striderdrabbningar 67. Skadad arm", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitCombat());
    }

    @Test public void striderdrabbningarTest68() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 68);
        assertEquals("striderdrabbningar 68. Skadat ben", character.getEventArraylist().get(0));
        assertEquals(-1, character.getDerivedAttributesArrayList().get(0).getDice());
        assertEquals(4, character.getUnitAgility());
    }

    @Test public void striderdrabbningarTest69() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 69);
        assertEquals("striderdrabbningar 69. Skonat en fiende", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitOther());
    }

    @Test public void striderdrabbningarTest70() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 70);
        assertEquals("striderdrabbningar 70. Skyddat befolkning", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void striderdrabbningarTest71() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 71);
        assertEquals("striderdrabbningar 71. Skärmytsling I bergspass", character.getEventArraylist().get(0));
        assertEquals("Klättra", getSetString(character.getEasilyLearnedSet(), "Klättra"));
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void striderdrabbningarTest72() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 72);
        assertEquals("striderdrabbningar 72. Skärmytsling I skog", character.getEventArraylist().get(0));
        assertEquals("Spåra", getSetString(character.getEasilyLearnedSet(), "Spåra"));
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void striderdrabbningarTest73() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 73);
        assertEquals("striderdrabbningar 73. Skärmytsling I träskmark", character.getEventArraylist().get(0));
        assertEquals("Simma", getSetString(character.getEasilyLearnedSet(), "Simma"));
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void striderdrabbningarTest74() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 74);
        assertEquals("striderdrabbningar 74. Skärmytsling I vinterlandskap", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Skidor&Skridskor");
        assertEquals("Skidor&Skridskor", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void striderdrabbningarTest75() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 75);
        assertEquals("striderdrabbningar 75. Skärmytsling I öken", character.getEventArraylist().get(0));
        assertEquals("Vildmarksvana", getSetString(character.getEasilyLearnedSet(), "Vildmarksvana"));
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitWild());
    }

    @Test public void striderdrabbningarTest76() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 76);
        assertEquals("striderdrabbningar 76. Snabba reflexer", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(1).getMod());
        assertEquals("Undvika", getSetString(character.getEasilyLearnedSet(), "Undvika"));
    }

    @Test public void striderdrabbningarTest77() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 77);
        assertEquals("striderdrabbningar 77. Snabbt vapen", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitCombat());
        assertEquals("Valfritt vapen, Vapnet har egenskapen \"Snabb\"", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest78() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 78);
        assertEquals("striderdrabbningar 78. Stoppat övergrepp I krig", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitSocial());

    }

    @Test public void striderdrabbningarTest79() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 79);
        assertEquals("striderdrabbningar 79. Striden I blodet", character.getEventArraylist().get(0));
    }

    @Test public void striderdrabbningarTest80() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 80);
        assertEquals("striderdrabbningar 80. Stridens hjälte", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals(4, character.getUnitCombat());
    }

    @Test public void striderdrabbningarTest81() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 81);
        assertEquals("striderdrabbningar 81. Stridskväden", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Berättarkonst", getSetString(character.getEasilyLearnedSet(), "Berättarkonst"));
        assertEquals("Historia", getSetString(character.getEasilyLearnedSet(), "Historia"));
    }

    @Test public void striderdrabbningarTest82() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 82);
        assertEquals("striderdrabbningar 82. Stridstränad", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(3, character.getUnitCombat());

    }

    @Test public void striderdrabbningarTest83() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 83);
        assertEquals("striderdrabbningar 83. Strid till häst", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Rida", getSetString(character.getEasilyLearnedSet(), "Rida"));
        assertEquals("Spjut", getSetString(character.getEasilyLearnedSet(), "Spjut"));
    }

    @Test public void striderdrabbningarTest84() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 84);
        assertEquals("striderdrabbningar 84. Ståndaktig", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(5).getMod());
        assertEquals("striderdrabbningar 84. Ignorerar effekten tillbakaknuffad, +2T6 bonus vid defensivt försvar istället för +1T6", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest85() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 85);
        assertEquals("striderdrabbningar 85. Svepande anfall", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 85. Anfallstaktiken gruppanfall ger inga avdrag för att träffa för personen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest86() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 86);
        assertEquals("striderdrabbningar 86. Tagen för död, räddad av:", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(6).getMod());
        assertEquals(1, character.getUnitsTraits());
    }

    @Test public void striderdrabbningarTest87() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 87);
        assertEquals("striderdrabbningar 87. Tagit kommando", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("Ledarskap", getSetString(character.getEasilyLearnedSet(), "Ledarskap"));
    }

    @Test public void striderdrabbningarTest88() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 88);
        assertEquals("striderdrabbningar 88. Tung beväpning", character.getEventArraylist().get(0));
        assertEquals(3, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals("valfri vapenfärdighet", getSetString(character.getEasilyLearnedSet(), "valfri vapenfärdighet"));
        assertEquals("Valfritt tungt vapen med +2 I skada", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest89() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 89);
        assertEquals("striderdrabbningar 89. Tung rustning", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(0).getMod());
        assertEquals("Valfri tung rustning med +2 I pansar", character.getEquipmentArraylist().get(0));

    }

    @Test public void striderdrabbningarTest90() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 90);
        assertEquals("striderdrabbningar 90. Tyngd av skuld", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void striderdrabbningarTest91() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 91);
        assertEquals("striderdrabbningar 91. Undvika avståndsvapen", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("striderdrabbningar 91. +1T6 för att undvika avståndsvapen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest92() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 92);
        assertEquals("striderdrabbningar 92. Uppror", character.getEventArraylist().get(0));
    }

    @Test public void upprorTest1(){
        Character character = new Character();
        dbTableInteract(character, conn, "uppror", 1);
        assertEquals("uppror 1. deltog med upprorsmännen", character.getEventArraylist().get(0));
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
        assertEquals("Vildmarksvana", getSetString(character.getEasilyLearnedSet(), "Vildmarksvana"));
        assertEquals(2, character.getUnitWild());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void upprorTest2(){
        Character character = new Character();
        dbTableInteract(character, conn, "uppror", 2);
        assertEquals("uppror 2. deltog med härmakten", character.getEventArraylist().get(0));
        assertEquals("Krigsföring", getSetString(character.getEasilyLearnedSet(), "Krigsföring"));
        assertEquals("Ledarskap", getSetString(character.getEasilyLearnedSet(), "Ledarskap"));
        assertEquals(3, character.getUnitCombat());
    }

    @Test public void striderdrabbningarTest93() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 93);
        assertEquals("striderdrabbningar 93. Undvikande manöver", character.getEventArraylist().get(0));
        assertEquals("Undvika", getSetString(character.getEasilyLearnedSet(), "Undvika"));
        assertEquals("striderdrabbningar 93. +1T6 för att undvika om personen slåss mot fler motståndare", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest94() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 94);
        assertEquals("striderdrabbningar 94. Uppvisningsstrider", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals("Dansa", getSetString(character.getEasilyLearnedSet(), "Dansa"));
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void striderdrabbningarTest95() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 95);
        assertEquals("striderdrabbningar 95. Vapen I gåva", character.getEventArraylist().get(0));
        assertEquals("Valfri vapenfärdighet", getSetString(character.getEasilyLearnedSet(), "Valfri vapenfärdighet"));
        assertEquals("Ett valfritt vapen, +1T6 skada för vapnet, värde * 10", character.getEquipmentArraylist().get(0));
    }

    @Test public void striderdrabbningarTest96() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 96);
        assertEquals("striderdrabbningar 96. Vapenspecialist", character.getEventArraylist().get(0));
        assertEquals("Valfri vapenfärdighet", getSetString(character.getEasilyLearnedSet(), "Valfri vapenfärdighet"));
        assertEquals("striderdrabbningar 96. +1T6 skada för vapentypen", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void striderdrabbningarTest97() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 97);
        assertEquals("striderdrabbningar 97. Våghals", character.getEventArraylist().get(0));
        assertEquals(1, character.getDerivedAttributesArrayList().get(1).getDice());
        assertEquals(2, character.getDerivedAttributesArrayList().get(6).getMod());
        assertEquals("Mod", character.getSecondaryCharacteristic());
    }

    @Test public void striderdrabbningarTest98() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 98);
        assertEquals("striderdrabbningar 98. Återhämta smärta", character.getEventArraylist().get(0));
        assertEquals("striderdrabbningar 98. läkningstakten för smärta ökar med 3", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void striderdrabbningarTest99() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 99);
        assertEquals("striderdrabbningar 99. Ödestigert misstag", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitOther());

    }

    @Test public void striderdrabbningarTest100() {
        Character character = new Character();
        dbTableInteract(character, conn, "striderdrabbningar", 100);
        assertEquals("striderdrabbningar 100. Händelserikt liv", character.getEventArraylist().get(0));
        assertEquals(2, character.getRollsCombat());
    }

    @Test public void intrigerillgarningarTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 1);
        assertEquals("intrigerillgarningar 1. Allt går att köpa för pengar", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitSocial());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(20, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void intrigerillgarningarTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 2);
        assertEquals("intrigerillgarningar 2. Arv", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(1000, character.getStartingFundsSilver());
    }

    @Test public void intrigerillgarningarTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 3);
        assertEquals("intrigerillgarningar 3. Avslöjat ett brott, brottsling:", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest4() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 4);
        assertEquals("intrigerillgarningar 4. Avslöjat förrädare, förrädare:", character.getEventArraylist().get(0));
        assertEquals("Genomskåda", getSetString(character.getEasilyLearnedSet(), "Genomskåda"));
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest5() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 5);
        assertEquals("intrigerillgarningar 5. Begått illdåd", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitOther());
    }

    @Test public void intrigerillgarningarTest6() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 6);
        assertEquals("intrigerillgarningar 6. Beroende", character.getEventArraylist().get(0));
        assertEquals("Gift&Droger", getSetString(character.getEasilyLearnedSet(), "Gift&Droger"));
        assertEquals("drog, 10 doser", character.getEquipmentArraylist().get(0));
        assertEquals("Svaghet för Droger", character.getSecondaryCharacteristic());
    }

    @Test public void intrigerillgarningarTest7() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 7);
        assertEquals("intrigerillgarningar 7. Betald tystnad", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(100, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void intrigerillgarningarTest8() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 8);
        assertEquals("intrigerillgarningar 8. Bra I sängen, senaste erövringar:", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Behaga");
        assertEquals("Behaga", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void intrigerillgarningarTest9() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 9);
        assertEquals("intrigerillgarningar 9. Charmant", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest10() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 10);
        assertEquals("intrigerillgarningar 10. Dansare", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Dansa", getSetString(character.getEasilyLearnedSet(), "Dansa"));
    }

    @Test public void intrigerillgarningarTest11() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 11);
        assertEquals("intrigerillgarningar 11. Deltagit I mycket fin tillställning", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        assertEquals("Hovliv", getSetString(character.getEasilyLearnedSet(), "Hovliv"));
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest12() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 12);
        assertEquals("intrigerillgarningar 12. Dolkmästare", character.getEventArraylist().get(0));
        assertEquals("Dolk", getSetString(character.getEasilyLearnedSet(), "Dolk"));
        assertEquals("intrigerillgarningar 12. 1T6 extra skada med dolk", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest13() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 13);
        assertEquals("intrigerillgarningar 13. Dricker för mycket, dryckesvän:", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Supa");
        assertEquals("Supa", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Supa", character.getSecondaryCharacteristic());
    }

    @Test public void intrigerillgarningarTest14() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 14);
        assertEquals("intrigerillgarningar 14. Dubbelliv", character.getEventArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest15() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 15);
        assertEquals("intrigerillgarningar 15. Dödat för att bevara hemlighet", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void intrigerillgarningarTest16() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 16);
        assertEquals("intrigerillgarningar 16. Dödat uppsatt person", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitCombat());
    }

    @Test public void intrigerillgarningarTest17() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 17);
        assertEquals("intrigerillgarningar 17. En kniv I ryggen", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(1, character.getDerivedAttributesArrayList().get(1).getDice());
    }

    @Test public void intrigerillgarningarTest18() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 18);
        assertEquals("intrigerillgarningar 18. Enat fraktioner", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("Ledarskap", getSetString(character.getEasilyLearnedSet(), "Ledarskap"));

    }

    @Test public void intrigerillgarningarTest19() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 19);
        assertEquals("intrigerillgarningar 19. Erbjuden gemål", character.getEventArraylist().get(0));
    }

    @Test public void erbjudeGemalTest1 () {
        Character character = new Character();
        dbTableInteract(character, conn, "erbjudengemal", 1);
        assertEquals("erbjudengemal 1. Giftemål", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(50, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void erbjudeGemalTest2 () {
        Character character = new Character();
        dbTableInteract(character, conn, "erbjudengemal", 2);
        assertEquals("erbjudengemal 2. Ej giftemål", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitOther());

    }

    @Test public void intrigerillgarningarTest20() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 20);
        assertEquals("intrigerillgarningar 20. Fastighet", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitTrade());
        assertEquals("Äger fastighet med koppling till hantverk", character.getEquipmentArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest21() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 21);
        assertEquals("intrigerillgarningar 21. Favorithak", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest22() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 22);
        assertEquals("intrigerillgarningar 22. Fått efterhängsen friare, friare:", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void intrigerillgarningarTest23() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 23);
        assertEquals("intrigerillgarningar 23. Fått person avrättad, avrättad person:", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest24() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 24);
        assertEquals("intrigerillgarningar 24. Förälskad I :", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest25() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 25);
        assertEquals("intrigerillgarningar 25. Förbjudet förhållande", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Förklädnad");
        assertEquals("Förklädnad", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Dupera", getSetString(character.getEasilyLearnedSet(), "Dupera"));
    }

    @Test public void intrigerillgarningarTest26() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 26);
        assertEquals("intrigerillgarningar 26. Förföljelsens blick", character.getEventArraylist().get(0));
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Trollbindande blick");
        assertEquals("Trollbindande blick", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("intrigerillgarningar 26. Spendera 1 fokus för att trollbinda person(motståndsslag mot självkontroll", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest27() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 27);
        assertEquals("intrigerillgarningar 27. Förlorat I duell", character.getEventArraylist().get(0));
        assertEquals(-2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedExposure());
        assertEquals(4, character.getUnitOther());
    }

    @Test public void intrigerillgarningarTest28() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 28);
        assertEquals("intrigerillgarningar 28. Förlorat rättegång mot:", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitKnowledge());
        assertEquals(2, character.getUnitSocial());
        assertEquals("intrigerillgarningar 28. Om hämnd lyckas återfrå personen 5 fokus", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest29() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 29);
        assertEquals("intrigerillgarningar 29. Förlorat sin älskade", character.getEventArraylist().get(0));
        assertEquals(-1, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(2, character.getJadedExposure());
    }

    @Test public void intrigerillgarningarTest30() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 30);
        assertEquals("intrigerillgarningar 30. Förått sin bästa vän, vännen är:", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void intrigerillgarningarTest31() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 31);
        assertEquals("intrigerillgarningar 31. Förtalad av:", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void intrigerillgarningarTest32() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 32);
        assertEquals("intrigerillgarningar 32. Genomskådande", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Genomskåda", getSetString(character.getEasilyLearnedSet(), "Genomskåda"));
    }

    @Test public void intrigerillgarningarTest33() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 33);
        assertEquals("intrigerillgarningar 33. Gentjänst från:", character.getEventArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest34() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 34);
        assertEquals("intrigerillgarningar 34. Giftflaska", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals("Gift&Droger", getSetString(character.getEasilyLearnedSet(), "Gift&Droger"));
        assertEquals("2 doser nervgift(+4 motståndsslag)", character.getEquipmentArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest35() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 35);
        assertEquals("intrigerillgarningar 35. Gifttålig", character.getEventArraylist().get(0));
        assertEquals("intrigerillgarningar 35. Immun mot alla gifter", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void intrigerillgarningarTest36() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 36);
        assertEquals("intrigerillgarningar 36. Hemlig kunskap", character.getEventArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest37() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 37);
        assertEquals("intrigerillgarningar 37. Hemligt alter ego", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Förklädnad");
        assertEquals("Förklädnad", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest38() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 38);
        assertEquals("intrigerillgarningar 38. Hovliv och diplomati", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Hovliv", getSetString(character.getEasilyLearnedSet(), "Hovliv"));
    }

    @Test public void intrigerillgarningarTest39() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 39);
        assertEquals("intrigerillgarningar 39. Håller fester och bjudningar", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Hålla bjudningar");
        assertEquals("Hålla bjudningar", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest40() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 40);
        assertEquals("intrigerillgarningar 40. Illegal verksamhet", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals("Handel", getSetString(character.getEasilyLearnedSet(), "Handel"));
        assertEquals("Skumraskaffärer", getSetString(character.getEasilyLearnedSet(), "Skumraskaffärer"));
        assertEquals("intrigerillgarningar 40. inkomst 4T6*5s/månad", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest41() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 41);
        assertEquals("intrigerillgarningar 41. Information", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("intrigerillgarningar 41. Hittas rätt köpare är informationen värd 1T6*200s", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void intrigerillgarningarTest42() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 42);
        assertEquals("intrigerillgarningar 42. Inger förtroende och sympati", character.getEventArraylist().get(0));
        assertEquals(2, character.getDerivedAttributesArrayList().get(2).getMod());
        Trait temp = (Trait) getSetObject(character.getTraitSet(), "Hederligt intryck");
        assertEquals("Hederligt intryck", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Se oskyldig ut");
        assertEquals("Se oskyldig ut", temp2.getName());
        assertEquals(4, temp2.getDice());
    }

    @Test public void intrigerillgarningarTest43() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 43);
        assertEquals("intrigerillgarningar 43. Inkomstbringande verksamhet", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(5).getMod());
        assertEquals("Handel", getSetString(character.getEasilyLearnedSet(), "Handel"));
        assertEquals("Kalkylera", getSetString(character.getEasilyLearnedSet(), "Kalkylera"));
        assertEquals("intrigerillgarningar 43. inkomst 2T6*10s/månad", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest44() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 44);
        assertEquals("intrigerillgarningar 44. Insikt I fiendens planer", character.getEventArraylist().get(0));
        assertEquals(1, character.getEasilyLearned());

    }

    @Test public void intrigerillgarningarTest45() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 45);
        assertEquals("intrigerillgarningar 45. Insikt I undre världen", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Kloaksystem");
        assertEquals("Kloaksystem", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Skumraskaffärer", getSetString(character.getEasilyLearnedSet(), "Skumraskaffärer"));
    }

    @Test public void intrigerillgarningarTest46() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 46);
        assertEquals("intrigerillgarningar 46. Kidnappad", character.getEventArraylist().get(0));
        assertEquals(1, character.getUnitsExpertis());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void intrigerillgarningarTest47() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 47);
        assertEquals("intrigerillgarningar 47. Kontrakt", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void intrigerillgarningarTest48() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 48);
        assertEquals("intrigerillgarningar 48. Korrumperad", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedExposure());

    }

    @Test public void intrigerillgarningarTest49() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 49);
        assertEquals("intrigerillgarningar 49. Lurad av :", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals("intrigerillgarningar 49. Hämnas personen så återfår personen 5 fokus", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest50() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 50);
        assertEquals("intrigerillgarningar 50. Låsdyrkar", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(2).getMod());
        assertEquals("Fingerfärdighet", getSetString(character.getEasilyLearnedSet(), "Fingerfärdighet"));
        assertEquals("Låsdyrkning", getSetString(character.getEasilyLearnedSet(), "Låsdyrkning"));
        assertEquals("Låsdyrkar(+1T6 låsdyrkning)", character.getEquipmentArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest51() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 51);
        assertEquals("intrigerillgarningar 51. Lögnernas mästare", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Förfalskare");
        assertEquals("Förfalskare", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Dupera", getSetString(character.getEasilyLearnedSet(), "Dupera"));
    }

    @Test public void intrigerillgarningarTest52() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 52);
        assertEquals("intrigerillgarningar 52. Lömskt beteende", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Korrumpera");
        assertEquals("Korrumpera", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Peka ut syndabock");
        assertEquals("Peka ut syndabock", temp2.getName());
        assertEquals(4, temp2.getDice());
    }

    @Test public void intrigerillgarningarTest53() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 53);
        assertEquals("intrigerillgarningar 53. Löst tvist", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(1, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest54() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 54);
        assertEquals("intrigerillgarningar 54. Manipulativ", character.getEventArraylist().get(0));
        assertEquals(1, character.getBasicAttributeArrayList().get(4).getMod());
        assertEquals(4, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest55() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 55);
        assertEquals("intrigerillgarningar 55. Musikalisk talang", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Komponera musik");
        assertEquals("Komponera musik", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Sång&Musik", getSetString(character.getEasilyLearnedSet(), "Sång&Musik"));
    }

    @Test public void intrigerillgarningarTest56() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 56);
        assertEquals("intrigerillgarningar 56. Mutat makthavare", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Muta");
        assertEquals("Muta", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void intrigerillgarningarTest57() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 57);
        assertEquals("intrigerillgarningar 57. Mutor från:", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitSocial());
        assertEquals("intrigerillgarningar 57. inkomst 4T6*5s/månad", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest58() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 58);
        assertEquals("intrigerillgarningar 58. Märkt", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals("intrigerillgarningar 58. -1T6 sociala interaktioner om märket upptäcks", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest59() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 59);
        assertEquals("intrigerillgarningar 59. Nymfoman, erövringar:", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Flörta");
        assertEquals("Flörta", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("Sex", character.getSecondaryCharacteristic());
    }

    @Test public void intrigerillgarningarTest60() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 60);
        assertEquals("intrigerillgarningar 60. Orgier", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(1).getMod());
        assertEquals(2, character.getUnitsExpertis());
    }

    @Test public void intrigerillgarningarTest61() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 61);
        assertEquals("intrigerillgarningar 61. Osmaklig handling", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Perversiteter");
        assertEquals("Perversiteter", temp.getName());
        assertEquals(4, temp.getDice());
        Expertis temp2 = (Expertis) getSetObject(character.getExpertisSet(), "Äckla");
        assertEquals("Äckla", temp2.getName());
        assertEquals(4, temp2.getDice());
    }

    @Test public void intrigerillgarningarTest62() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 62);
        assertEquals("intrigerillgarningar 62. Otrohetsdrama", character.getEventArraylist().get(0));
        assertEquals(2, character.getJadedExposure());

    }

    @Test public void intrigerillgarningarTest63() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 63);
        assertEquals("intrigerillgarningar 63. Passionsbrott", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Perversiteter");
        assertEquals("Perversiteter", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void intrigerillgarningarTest64() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 64);
        assertEquals("intrigerillgarningar 64. Problematiskt syskon som är:", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(1, character.getJadedExposure());

    }

    @Test public void intrigerillgarningarTest65() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 65);
        assertEquals("intrigerillgarningar 65. Satt dit någon som är:", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Skylla på andra");
        assertEquals("Skylla på andra", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest66() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 66);
        assertEquals("intrigerillgarningar 66. Segrat I duell mot:", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals(3, character.getUnitCombat());

    }

    @Test public void intrigerillgarningarTest67() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 67);
        assertEquals("intrigerillgarningar 67. Ser persons svagheter", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitSocial());
        assertEquals("intrigerillgarningar 67. Om personen vinner social konflikt så ökar kontroll med 2", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest68() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 68);
        assertEquals("intrigerillgarningar 68. Silvertunga", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Charm", getSetString(character.getEasilyLearnedSet(), "Charm"));
    }

    @Test public void intrigerillgarningarTest69() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 69);
        assertEquals("intrigerillgarningar 69. Skapat splittring", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(2, character.getUnitSocial());

    }

    @Test public void intrigerillgarningarTest70() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 70);
        assertEquals("intrigerillgarningar 70. Skarpa argument", character.getEventArraylist().get(0));
        assertEquals("Argumentera", getSetString(character.getEasilyLearnedSet(), "Argumentera"));
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest71() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 71);
        assertEquals("intrigerillgarningar 71. Skuggornas mästare", character.getEventArraylist().get(0));
        assertEquals("Smyga", getSetString(character.getEasilyLearnedSet(), "Smyga"));
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitWild());

    }

    @Test public void intrigerillgarningarTest72() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 72);
        assertEquals("intrigerillgarningar 72. Skyddsling som är:", character.getEventArraylist().get(0));
        assertEquals("Undervisa", getSetString(character.getEasilyLearnedSet(), "Undervisa"));
        assertEquals(4, character.getUnitOther());
        assertEquals("intrigerillgarningar 72. Om skyddslingen dör utsätts personen för Nedbrytning 60", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest73() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 73);
        assertEquals("intrigerillgarningar 73. Skyldig tjänst till:", character.getEventArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest74() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 74);
        assertEquals("intrigerillgarningar 74. Släktfejd", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitSocial());

    }

    @Test public void intrigerillgarningarTest75() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 75);
        assertEquals("intrigerillgarningar 75. Smycken", character.getEventArraylist().get(0));
        assertEquals("Smycken(båtfr 1T6*500s, +1T6 sociala färdigheter om motparten imponeras av smycken)", character.getEquipmentArraylist().get(0));
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest76() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 76);
        assertEquals("intrigerillgarningar 76. Snabbtänkt", character.getEventArraylist().get(0));
        assertEquals("intrigerillgarningar 76. +1T6 I social färdighet om personen använder fokus", character.getSpecialTraitsArraylist().get(0));

    }

    @Test public void intrigerillgarningarTest77() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 77);
        assertEquals("intrigerillgarningar 77. Social kameleont", character.getEventArraylist().get(0));
        assertEquals(12, character.getEasilyLearnedSet().size());
    }

    @Test public void intrigerillgarningarTest78() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 78);
        assertEquals("intrigerillgarningar 78. Sover lätt", character.getEventArraylist().get(0));
        assertEquals("intrigerillgarningar 78. Behöver bara 4 timmars sömn, inga avdrag för vaksamhet vid nyvaket tillstånd", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest79() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 79);
        assertEquals("intrigerillgarningar 79. Spela dum", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Skådespel");
        assertEquals("Skådespel", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(2, character.getUnitSocial());
        assertEquals("intrigerillgarningar 79. Återfår 1 fokus om man lyckas lura någon att man är inbecil", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest80() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 80);
        assertEquals("intrigerillgarningar 80. Spionerat på någon", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(3).getMod());
        assertEquals("Genomsöka", getSetString(character.getEasilyLearnedSet(), "Genomsöka"));
        assertEquals(2, character.getUnitWild());
        assertEquals(2, character.getUnitAgility());

    }

    @Test public void intrigerillgarningarTest81() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 81);
        assertEquals("intrigerillgarningar 81. Sprider rykten", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Rykten & Skvaller");
        assertEquals("Rykten & Skvaller", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void intrigerillgarningarTest82() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 82);
        assertEquals("intrigerillgarningar 82. Stulit information", character.getEventArraylist().get(0));
        assertEquals("Fingerfärdighet", getSetString(character.getEasilyLearnedSet(), "Fingerfärdighet"));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest83() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 83);
        assertEquals("intrigerillgarningar 83. Svarta marknaden, kontakt:", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(7).getMod());
        assertEquals("Skumraskaffärer", getSetString(character.getEasilyLearnedSet(), "Skumraskaffärer"));

    }

    @Test public void intrigerillgarningarTest84() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 84);
        assertEquals("intrigerillgarningar 84. Svikit en vän", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Skylla på andra");
        assertEquals("Skylla på andra", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals("intrigerillgarningar 84. Återfår 5 fokus om vännen gottgörs", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest85() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 85);
        assertEquals("intrigerillgarningar 85. Svårt moraliskt beslut", character.getEventArraylist().get(0));
        assertEquals("intrigerillgarningar 85. +1T6 Självkontroll mot Nedbrytning", character.getSpecialTraitsArraylist().get(0));
    }

    @Test public void svartMoralisktBeslutTest1() {
        Character character = new Character();
        dbTableInteract(character, conn, "svartmoralisktbeslut", 1);
        assertEquals(1, character.getJadedViolence());
    }

    @Test public void svartMoralisktBeslutTest2() {
        Character character = new Character();
        dbTableInteract(character, conn, "svartmoralisktbeslut", 2);
        assertEquals(1, character.getJadedExposure());
    }

    @Test public void svartMoralisktBeslutTest3() {
        Character character = new Character();
        dbTableInteract(character, conn, "svartmoralisktbeslut", 3);
        assertEquals(1, character.getJadedSupernatural());
    }

    @Test public void intrigerillgarningarTest86() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 86);
        assertEquals("intrigerillgarningar 86. Tjänst att inkräva från:", character.getEventArraylist().get(0));

    }

    @Test public void intrigerillgarningarTest87() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 87);
        assertEquals("intrigerillgarningar 87. Tränad till lönnmördare", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedViolence());
        assertEquals(2, character.getUnitCombat());
        assertEquals(2, character.getUnitAgility());
    }

    @Test public void intrigerillgarningarTest88() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 88);
        assertEquals("intrigerillgarningar 88. Tränad till spion", character.getEventArraylist().get(0));
        assertEquals("Låsdyrkning", getSetString(character.getEasilyLearnedSet(), "Låsdyrkning"));
        assertEquals(2, character.getUnitAgility());
        assertEquals(2, character.getUnitKnowledge());
    }

    @Test public void intrigerillgarningarTest89() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 89);
        assertEquals("intrigerillgarningar 89. Udda läggning", character.getEventArraylist().get(0));
        assertEquals(1, character.getJadedExposure());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest90() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 90);
        assertEquals("intrigerillgarningar 90. Upptäckt en konspiration", character.getEventArraylist().get(0));
        assertEquals(3, character.getUnitKnowledge());
    }

    @Test public void intrigerillgarningarTest91() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 91);
        assertEquals("intrigerillgarningar 91. Uppviglare", character.getEventArraylist().get(0));
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Uppvigla");
        assertEquals("Uppvigla", temp.getName());
        assertEquals(4, temp.getDice());
        assertEquals(3, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest92() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 92);
        assertEquals("intrigerillgarningar 92. Utmärkande släktdrag", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitsTraits());
    }

    @Test public void intrigerillgarningarTest93() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 93);
        assertEquals("intrigerillgarningar 93. Vackra kläder", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        assertEquals("Vackra kläder(+1T6 intryck när de används)", character.getEquipmentArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest94() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 94);
        assertEquals("intrigerillgarningar 94. Vadslagare", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitSocial());
        assertEquals(2, character.getStartingFundsArrayList().get(0).getDice());
        assertEquals(10, character.getStartingFundsArrayList().get(0).getMod());
    }

    @Test public void intrigerillgarningarTest95() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 95);
        assertEquals("intrigerillgarningar 95. Vunnit rättegång mot:", character.getEventArraylist().get(0));
        assertEquals("Lagkunskap", getSetString(character.getEasilyLearnedSet(), "Lagkunskap"));
        assertEquals(2, character.getUnitKnowledge());
        assertEquals(2, character.getUnitSocial());
    }

    @Test public void intrigerillgarningarTest96() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 96);
        assertEquals("intrigerillgarningar 96. Vårdar sitt utseende", character.getEventArraylist().get(0));
        assertEquals(2, character.getBasicAttributeArrayList().get(6).getMod());
        Expertis temp = (Expertis) getSetObject(character.getExpertisSet(), "Parfym & Kosmetika");
        assertEquals("Parfym & Kosmetika", temp.getName());
        assertEquals(4, temp.getDice());
    }

    @Test public void intrigerillgarningarTest97() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 97);
        assertEquals("intrigerillgarningar 97. Äger slav som är:", character.getEventArraylist().get(0));
    }

    @Test public void intrigerillgarningarTest98() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 98);
        assertEquals("intrigerillgarningar 98. Älskare som är:", character.getEventArraylist().get(0));
        assertEquals(4, character.getUnitOther());
    }

    @Test public void intrigerillgarningarTest99() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 99);
        assertEquals("intrigerillgarningar 99. Älskare åt uppsatt person", character.getEventArraylist().get(0));
        assertEquals(2, character.getUnitsExpertis());
    }

    @Test public void intrigerillgarningarTest100() {
        Character character = new Character();
        dbTableInteract(character, conn, "intrigerillgarningar", 100);
        assertEquals("intrigerillgarningar 100. Händelserikt liv", character.getEventArraylist().get(0));
        assertEquals(2, character.getRollsIntrigue());
    }

}

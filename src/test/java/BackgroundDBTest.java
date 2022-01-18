import com.npcmaker.characterfiles.Character;
import com.npcmaker.dbhelper.DbConnector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.sql.Connection;

import static com.npcmaker.fxmlcontrollers.PreviewFXMLController.dbBackgroundInteract;
import static com.npcmaker.fxmlcontrollers.PreviewFXMLController.dbTableInteract;

import static org.junit.jupiter.api.Assertions.*;

public class BackgroundDBTest {
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

    @Test public void testBackground1 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 1);
        assertEquals("Alkemist", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground2 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 2);
        assertEquals("Apotekare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground3 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 3);
        assertEquals("Arkitektor", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground4 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 4);
        assertEquals("Balsamerare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground5 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 5);
        assertEquals("Bard", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground6 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 6);
        assertEquals("Bestraffare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground7 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 7);
        assertEquals("Boktryckare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground8 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 8);
        assertEquals("Bosättare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground9 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 9);
        assertEquals("Brottsling", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground10 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 10);
        assertEquals("Censor", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground11 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 11);
        assertEquals("Consulator", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground12 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 12);
        assertEquals("Dansare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground13 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 13);
        assertEquals("Demagog", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground14 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 14);
        assertEquals("Dibukkultist", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground15 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 15);
        assertEquals("Domedagspredikant", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground16 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 16);
        assertEquals("Dödgrävare", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground17 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 17);
        assertEquals("Exaktor", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground18 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 18);
        assertEquals("Fiskare", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground19 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 19);
        assertEquals("Fjärilsfångare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground20 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 20);
        assertEquals("Flagellant", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground21 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 21);
        assertEquals("Forskare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground22 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 22);
        assertEquals("Fältskär", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground23 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 23);
        assertEquals("Förfalskare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground24 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 24);
        assertEquals("Gardessoldat", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground25 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 25);
        assertEquals("Gatuförsäljare", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground26 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 26);
        assertEquals("Gisslan", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground27 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 27);
        assertEquals("Gladiator", character.getBackground());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground28 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 28);
        assertEquals("Glutherian", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground29 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 29);
        assertEquals("Godsägare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground30 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 30);
        assertEquals("Grovarbetare", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground31 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 31);
        assertEquals("Gråtare", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground32 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 32);
        assertEquals("Gycklare", character.getBackground());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground33 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 33);
        assertEquals("Hamnarbetare", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground34 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 34);
        assertEquals("Hantverkare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground35 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 35);
        assertEquals("Hämnare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground36 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 36);
        assertEquals("Häxa", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground37 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 37);
        assertEquals("Häxjägare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground38 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 38);
        assertEquals("Indrivare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground39 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 39);
        assertEquals("Inkvisitor", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground40 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 40);
        assertEquals("Jordbrukare", character.getBackground());
        assertEquals(2, character.getUnitTrade());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground41 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 41);
        assertEquals("Jägare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground42 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 42);
        assertEquals("Kartograf", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground43 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 43);
        assertEquals("Konfiskatör", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground44 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 44);
        assertEquals("Konkubin", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground45 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 45);
        assertEquals("Kunskapare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground46 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 46);
        assertEquals("Kurirryttare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground47 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 47);
        assertEquals("Kättare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground48 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 48);
        assertEquals("Köpman", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground49 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 49);
        assertEquals("Lamiakultist", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground50 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 50);
        assertEquals("Lantarbetare", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground51 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 51);
        assertEquals("Legosoldat", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground52 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 52);
        assertEquals("Lönnmördare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground53 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 53);
        assertEquals("Magiker", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground54 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 54);
        assertEquals("Magistrat", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground55 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 55);
        assertEquals("Medikus", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground56 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 56);
        assertEquals("Missionär", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground57 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 57);
        assertEquals("Munk/Nunna", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground58 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 58);
        assertEquals("Munskänk", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground59 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 59);
        assertEquals("Ockrare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground60 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 60);
        assertEquals("Ordensriddare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground61 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 61);
        assertEquals("Pilgrim", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground62 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 62);
        assertEquals("Prisjägare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground63 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 63);
        assertEquals("Protektor", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground64 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 64);
        assertEquals("Präst", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground65 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 65);
        assertEquals("Reliksäljare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground66 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 66);
        assertEquals("Råttfångare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground67 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 67);
        assertEquals("Samarit", character.getBackground());
        assertEquals(4, character.getUnitOther());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground68 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 68);
        assertEquals("Sjöfarare", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground69 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 69);
        assertEquals("Skrivare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground70 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 70);
        assertEquals("Skulptör", character.getBackground());
        assertEquals(4, character.getUnitOther());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground71 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 71);
        assertEquals("Sköka", character.getBackground());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground72 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 72);
        assertEquals("Slav(arbetare)", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground73 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 73);
        assertEquals("Slav(kurtisan)", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground74 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 74);
        assertEquals("Slav(lärd)", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground75 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 75);
        assertEquals("Slav(tjänare)", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground76 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 76);
        assertEquals("Slav(underhållare)", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground77 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 77);
        assertEquals("Slavförmedlare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground78 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 78);
        assertEquals("Smugglare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground79 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 79);
        assertEquals("Soldat", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground80 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 80);
        assertEquals("Spelare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground81 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 81);
        assertEquals("Stadsvakt", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground82 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 82);
        assertEquals("Stråtrövare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground83 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 83);
        assertEquals("Svindlare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground84 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 84);
        assertEquals("Tandsmed", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground85 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 85);
        assertEquals("Tiggare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground86 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 86);
        assertEquals("Tjuv", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground87 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 87);
        assertEquals("Torterare", character.getBackground());
        assertEquals(4, character.getUnitOther());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground88 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 88);
        assertEquals("Troféjägare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground89 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 89);
        assertEquals("Upprorsmakare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground90 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 90);
        assertEquals("Upptäcksresande", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground91 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 91);
        assertEquals("Utkastare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground92 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 92);
        assertEquals("Utmätare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground93 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 93);
        assertEquals("Utropare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground94 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 94);
        assertEquals("Vapenmästare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground95 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 95);
        assertEquals("Veteran", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground96 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 96);
        assertEquals("Vinkännare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground97 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 97);
        assertEquals("Vägvisare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground98 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 98);
        assertEquals("Värdshusvärd", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRandomEventRolls());
    }

    @Test public void testBackground99 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 99);
        assertEquals("Xinukultist", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground100 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 100);
        assertEquals("Ädling", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitOther());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void contactTest1 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 1);
        assertEquals("Alkemist", character.getEventArraylist().get(0));
    }

    @Test public void contactTest2 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 2);
        assertEquals("Apotekare", character.getEventArraylist().get(0));
    }

    @Test public void contactTest3 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 3);
        assertEquals("Arkitektor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest4 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 4);
        assertEquals("Balsamerare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest5 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 5);
        assertEquals("Bard", character.getEventArraylist().get(0));

    }

    @Test public void contactTest6 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 6);
        assertEquals("Bestraffare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest7 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 7);
        assertEquals("Boktryckare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest8 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 8);
        assertEquals("Bosättare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest9 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 9);
        assertEquals("Brottsling", character.getEventArraylist().get(0));

    }

    @Test public void contactTest10 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 10);
        assertEquals("Censor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest11 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 11);
        assertEquals("Consulator", character.getEventArraylist().get(0));

    }

    @Test public void contactTest12 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 12);
        assertEquals("Dansare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest13 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 13);
        assertEquals("Demagog", character.getEventArraylist().get(0));

    }

    @Test public void contactTest14 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 14);
        assertEquals("Dibukkultist", character.getEventArraylist().get(0));

    }

    @Test public void contactTest15 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 15);
        assertEquals("Domedagspredikant", character.getEventArraylist().get(0));

    }

    @Test public void contactTest16 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 16);
        assertEquals("Dödgrävare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest17 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 17);
        assertEquals("Exaktor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest18 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 18);
        assertEquals("Fiskare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest19 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 19);
        assertEquals("Fjärilsfångare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest20 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 20);
        assertEquals("Flagellant", character.getEventArraylist().get(0));

    }

    @Test public void contactTest21 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 21);
        assertEquals("Forskare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest22 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 22);
        assertEquals("Fältskär", character.getEventArraylist().get(0));

    }

    @Test public void contactTest23 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 23);
        assertEquals("Förfalskare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest24 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 24);
        assertEquals("Gardessoldat", character.getEventArraylist().get(0));

    }

    @Test public void contactTest25 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 25);
        assertEquals("Gatuförsäljare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest26 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 26);
        assertEquals("Gisslan", character.getEventArraylist().get(0));

    }

    @Test public void contactTest27 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 27);
        assertEquals("Gladiator", character.getEventArraylist().get(0));

    }

    @Test public void contactTest28 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 28);
        assertEquals("Glutherian", character.getEventArraylist().get(0));

    }

    @Test public void contactTest29 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 29);
        assertEquals("Godsägare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest30 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 30);
        assertEquals("Grovarbetare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest31 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 31);
        assertEquals("Gråtare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest32 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 32);
        assertEquals("Gycklare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest33 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 33);
        assertEquals("Hamnarbetare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest34 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 34);
        assertEquals("Hantverkare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest35 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 35);
        assertEquals("Hämnare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest36 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 36);
        assertEquals("Häxa", character.getEventArraylist().get(0));

    }

    @Test public void contactTest37 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 37);
        assertEquals("Häxjägare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest38 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 38);
        assertEquals("Indrivare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest39 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 39);
        assertEquals("Inkvisitor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest40 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 40);
        assertEquals("Jordbrukare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest41 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 41);
        assertEquals("Jägare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest42 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 42);
        assertEquals("Kartograf", character.getEventArraylist().get(0));

    }

    @Test public void contactTest43 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 43);
        assertEquals("Konfiskatör", character.getEventArraylist().get(0));

    }

    @Test public void contactTest44 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 44);
        assertEquals("Konkubin", character.getEventArraylist().get(0));

    }

    @Test public void contactTest45 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 45);
        assertEquals("Kunskapare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest46 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 46);
        assertEquals("Kurirryttare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest47 () {
        Character character = new Character();
        dbBackgroundInteract(character, conn, "bakgrundstabell", 47);
        assertEquals("Kättare", character.getEventArraylist().get(0));
    }

    @Test public void contactTest48 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 48);
        assertEquals("Köpman", character.getEventArraylist().get(0));

    }

    @Test public void contactTest49 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 49);
        assertEquals("Lamiakultist", character.getEventArraylist().get(0));

    }

    @Test public void contactTest50 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 50);
        assertEquals("Lantarbetare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest51 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 51);
        assertEquals("Legosoldat", character.getEventArraylist().get(0));

    }

    @Test public void contactTest52 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 52);
        assertEquals("Lönnmördare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest53 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 53);
        assertEquals("Magiker", character.getEventArraylist().get(0));

    }

    @Test public void contactTest54 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 54);
        assertEquals("Magistrat", character.getEventArraylist().get(0));

    }

    @Test public void contactTest55 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 55);
        assertEquals("Medikus", character.getEventArraylist().get(0));

    }

    @Test public void contactTest56 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 56);
        assertEquals("Missionär", character.getEventArraylist().get(0));

    }

    @Test public void contactTest57 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 57);
        assertEquals("Munk/Nunna", character.getEventArraylist().get(0));

    }

    @Test public void contactTest58 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 58);
        assertEquals("Munskänk", character.getEventArraylist().get(0));

    }

    @Test public void contactTest59 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 59);
        assertEquals("Ockrare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest60 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 60);
        assertEquals("Ordensriddare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest61 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 61);
        assertEquals("Pilgrim", character.getEventArraylist().get(0));

    }

    @Test public void contactTest62 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 62);
        assertEquals("Prisjägare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest63 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 63);
        assertEquals("Protektor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest64 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 64);
        assertEquals("Präst", character.getEventArraylist().get(0));

    }

    @Test public void contactTest65 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 65);
        assertEquals("Reliksäljare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest66 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 66);
        assertEquals("Råttfångare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest67 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 67);
        assertEquals("Samarit", character.getEventArraylist().get(0));

    }

    @Test public void contactTest68 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 68);
        assertEquals("Sjöfarare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest69 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 69);
        assertEquals("Skrivare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest70 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 70);
        assertEquals("Skulptör", character.getEventArraylist().get(0));

    }

    @Test public void contactTest71 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 71);
        assertEquals("Sköka", character.getEventArraylist().get(0));

    }

    @Test public void contactTest72 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 72);
        assertEquals("Slav(arbetare)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest73 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 73);
        assertEquals("Slav(kurtisan)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest74 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 74);
        assertEquals("Slav(lärd)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest75 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 75);
        assertEquals("Slav(tjänare)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest76 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 76);
        assertEquals("Slav(underhållare)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest77 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 77);
        assertEquals("Slavförmedlare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest78 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 78);
        assertEquals("Smugglare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest79 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 79);
        assertEquals("Soldat", character.getEventArraylist().get(0));

    }

    @Test public void contactTest80 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 80);
        assertEquals("Spelare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest81 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 81);
        assertEquals("Stadsvakt", character.getEventArraylist().get(0));

    }

    @Test public void contactTest82 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 82);
        assertEquals("Stråtrövare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest83 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 83);
        assertEquals("Svindlare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest84 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 84);
        assertEquals("Tandsmed", character.getEventArraylist().get(0));

    }

    @Test public void contactTest85 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 85);
        assertEquals("Tiggare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest86 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 86);
        assertEquals("Tjuv", character.getEventArraylist().get(0));

    }

    @Test public void contactTest87 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 87);
        assertEquals("Torterare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest88 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 88);
        assertEquals("Troféjägare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest89 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 89);
        assertEquals("Upprorsmakare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest90 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 90);
        assertEquals("Upptäcksresande", character.getEventArraylist().get(0));

    }

    @Test public void contactTest91 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 91);
        assertEquals("Utkastare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest92 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 92);
        assertEquals("Utmätare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest93 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 93);
        assertEquals("Utropare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest94 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 94);
        assertEquals("Vapenmästare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest95 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 95);
        assertEquals("Veteran", character.getEventArraylist().get(0));

    }

    @Test public void contactTest96 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 96);
        assertEquals("Vinkännare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest97 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 97);
        assertEquals("Vägvisare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest98 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 98);
        assertEquals("Värdshusvärd", character.getEventArraylist().get(0));

    }

    @Test public void contactTest99 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 99);
        assertEquals("Xinukultist", character.getEventArraylist().get(0));

    }

    @Test public void contactTest100 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 100);
        assertEquals("Ädling", character.getEventArraylist().get(0));

    }
}

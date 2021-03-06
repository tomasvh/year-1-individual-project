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
        assertEquals("Bos??ttare", character.getBackground());
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
        assertEquals("D??dgr??vare", character.getBackground());
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
        assertEquals("Fj??rilsf??ngare", character.getBackground());
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
        assertEquals("F??ltsk??r", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitCombat());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground23 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 23);
        assertEquals("F??rfalskare", character.getBackground());
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
        assertEquals("Gatuf??rs??ljare", character.getBackground());
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
        assertEquals("Gods??gare", character.getBackground());
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
        assertEquals("Gr??tare", character.getBackground());
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
        assertEquals("H??mnare", character.getBackground());
        assertEquals(4, character.getUnitCombat());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsCombat());
    }

    @Test public void testBackground36 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 36);
        assertEquals("H??xa", character.getBackground());
        assertEquals(4, character.getUnitWild());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground37 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 37);
        assertEquals("H??xj??gare", character.getBackground());
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
        assertEquals("J??gare", character.getBackground());
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
        assertEquals("Konfiskat??r", character.getBackground());
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
        assertEquals("K??ttare", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitSocial());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground48 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 48);
        assertEquals("K??pman", character.getBackground());
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
        assertEquals("L??nnm??rdare", character.getBackground());
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
        assertEquals("Mission??r", character.getBackground());
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
        assertEquals("Munsk??nk", character.getBackground());
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
        assertEquals("Prisj??gare", character.getBackground());
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
        assertEquals("Pr??st", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitMysteries());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground65 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 65);
        assertEquals("Reliks??ljare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground66 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 66);
        assertEquals("R??ttf??ngare", character.getBackground());
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
        assertEquals("Sj??farare", character.getBackground());
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
        assertEquals("Skulpt??r", character.getBackground());
        assertEquals(4, character.getUnitOther());
        assertEquals(2, character.getUnitTrade());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground71 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 71);
        assertEquals("Sk??ka", character.getBackground());
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
        assertEquals("Slav(l??rd)", character.getBackground());
        assertEquals(4, character.getUnitKnowledge());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsKnowledge());
    }

    @Test public void testBackground75 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 75);
        assertEquals("Slav(tj??nare)", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(4, character.getUnitAgility());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground76 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 76);
        assertEquals("Slav(underh??llare)", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsTraits());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground77 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 77);
        assertEquals("Slavf??rmedlare", character.getBackground());
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
        assertEquals("Str??tr??vare", character.getBackground());
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
        assertEquals("Trof??j??gare", character.getBackground());
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
        assertEquals("Uppt??cksresande", character.getBackground());
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
        assertEquals("Utm??tare", character.getBackground());
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
        assertEquals("Vapenm??stare", character.getBackground());
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
        assertEquals("Vink??nnare", character.getBackground());
        assertEquals(4, character.getUnitSocial());
        assertEquals(2, character.getUnitsExpertis());
        assertEquals(1, character.getRollsIntrigue());
    }

    @Test public void testBackground97 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 97);
        assertEquals("V??gvisare", character.getBackground());
        assertEquals(4, character.getUnitAgility());
        assertEquals(4, character.getUnitWild());
        assertEquals(1, character.getRollsExploration());
    }

    @Test public void testBackground98 () {
        Character character = new Character();
        dbTableInteract(character,conn, "bakgrundstabell", 98);
        assertEquals("V??rdshusv??rd", character.getBackground());
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
        assertEquals("??dling", character.getBackground());
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
        assertEquals("Bos??ttare", character.getEventArraylist().get(0));

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
        assertEquals("D??dgr??vare", character.getEventArraylist().get(0));

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
        assertEquals("Fj??rilsf??ngare", character.getEventArraylist().get(0));

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
        assertEquals("F??ltsk??r", character.getEventArraylist().get(0));

    }

    @Test public void contactTest23 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 23);
        assertEquals("F??rfalskare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest24 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 24);
        assertEquals("Gardessoldat", character.getEventArraylist().get(0));

    }

    @Test public void contactTest25 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 25);
        assertEquals("Gatuf??rs??ljare", character.getEventArraylist().get(0));

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
        assertEquals("Gods??gare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest30 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 30);
        assertEquals("Grovarbetare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest31 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 31);
        assertEquals("Gr??tare", character.getEventArraylist().get(0));

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
        assertEquals("H??mnare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest36 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 36);
        assertEquals("H??xa", character.getEventArraylist().get(0));

    }

    @Test public void contactTest37 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 37);
        assertEquals("H??xj??gare", character.getEventArraylist().get(0));

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
        assertEquals("J??gare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest42 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 42);
        assertEquals("Kartograf", character.getEventArraylist().get(0));

    }

    @Test public void contactTest43 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 43);
        assertEquals("Konfiskat??r", character.getEventArraylist().get(0));

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
        assertEquals("K??ttare", character.getEventArraylist().get(0));
    }

    @Test public void contactTest48 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 48);
        assertEquals("K??pman", character.getEventArraylist().get(0));

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
        assertEquals("L??nnm??rdare", character.getEventArraylist().get(0));

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
        assertEquals("Mission??r", character.getEventArraylist().get(0));

    }

    @Test public void contactTest57 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 57);
        assertEquals("Munk/Nunna", character.getEventArraylist().get(0));

    }

    @Test public void contactTest58 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 58);
        assertEquals("Munsk??nk", character.getEventArraylist().get(0));

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
        assertEquals("Prisj??gare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest63 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 63);
        assertEquals("Protektor", character.getEventArraylist().get(0));

    }

    @Test public void contactTest64 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 64);
        assertEquals("Pr??st", character.getEventArraylist().get(0));

    }

    @Test public void contactTest65 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 65);
        assertEquals("Reliks??ljare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest66 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 66);
        assertEquals("R??ttf??ngare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest67 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 67);
        assertEquals("Samarit", character.getEventArraylist().get(0));

    }

    @Test public void contactTest68 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 68);
        assertEquals("Sj??farare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest69 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 69);
        assertEquals("Skrivare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest70 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 70);
        assertEquals("Skulpt??r", character.getEventArraylist().get(0));

    }

    @Test public void contactTest71 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 71);
        assertEquals("Sk??ka", character.getEventArraylist().get(0));

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
        assertEquals("Slav(l??rd)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest75 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 75);
        assertEquals("Slav(tj??nare)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest76 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 76);
        assertEquals("Slav(underh??llare)", character.getEventArraylist().get(0));

    }

    @Test public void contactTest77 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 77);
        assertEquals("Slavf??rmedlare", character.getEventArraylist().get(0));

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
        assertEquals("Str??tr??vare", character.getEventArraylist().get(0));

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
        assertEquals("Trof??j??gare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest89 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 89);
        assertEquals("Upprorsmakare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest90 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 90);
        assertEquals("Uppt??cksresande", character.getEventArraylist().get(0));

    }

    @Test public void contactTest91 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 91);
        assertEquals("Utkastare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest92 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 92);
        assertEquals("Utm??tare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest93 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 93);
        assertEquals("Utropare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest94 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 94);
        assertEquals("Vapenm??stare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest95 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 95);
        assertEquals("Veteran", character.getEventArraylist().get(0));

    }

    @Test public void contactTest96 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 96);
        assertEquals("Vink??nnare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest97 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 97);
        assertEquals("V??gvisare", character.getEventArraylist().get(0));

    }

    @Test public void contactTest98 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 98);
        assertEquals("V??rdshusv??rd", character.getEventArraylist().get(0));

    }

    @Test public void contactTest99 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 99);
        assertEquals("Xinukultist", character.getEventArraylist().get(0));

    }

    @Test public void contactTest100 () {
        Character character = new Character();
        dbBackgroundInteract(character,conn, "bakgrundstabell", 100);
        assertEquals("??dling", character.getEventArraylist().get(0));

    }
}

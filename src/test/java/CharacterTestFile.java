import com.npcmaker.characterfiles.Character;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTestFile {

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

    private Character character = new Character();

    @Test public void testStartingPoint (){
        assertEquals(8, character.getBasicAttributeArrayList().size());
        assertEquals(9, character.getDerivedAttributesArrayList().size());
        assertEquals(9, character.getAgilitySkillsArraylist().size());
        assertEquals(12, character.getCombatSkillArraylist().size());
        assertEquals(11, character.getSocialSkillArraylist().size());
        assertEquals(5, character.getMysteriesSkillArraylist().size());
        assertEquals(15, character.getKnowledgeSkillArraylist().size());
        assertEquals(0, character.getEquipmentArraylist().size());
        assertEquals(0, character.getLanguageArraylist().size());
        assertEquals(0, character.getWritingArraylist().size());
        assertEquals(0, character.getEventArraylist().size());
        assertEquals(0, character.getExpertisSet().size());
        assertEquals(0, character.getTradeSet().size());
        assertEquals(0, character.getTraitSet().size());
        assertEquals(0, character.getSpecialTraitsArraylist().size());
        assertEquals(0, character.getEasilyLearnedSet().size());
        assertEquals(0, character.getHardLearnedSet().size());
        assertNull(character.getArchetype());
        assertNull(character.getBackground());
        assertNull(character.getEnvironment());
        assertNull(character.getPeoples());
        assertEquals("", character.getProvinceTotem());
        assertNull(character.getFirstName());
        assertNull(character.getSurName());
        assertNull(character.getReligion());
        assertNull(character.getPrimaryCharacteristic());
        assertNull(character.getSecondaryCharacteristic());
        assertNull(character.getGender());
        assertNull(character.getSwordArm());
        assertEquals(10, character.getWellbeing());
        assertEquals(0, character.getAge());
        assertEquals(0, character.getHeight());
        assertEquals(0, character.getWeight());
        assertEquals(0, character.getUnitsExpertis());
        assertEquals(0, character.getUnitsTraits());
        assertEquals(0, character.getEasilyLearned());
        assertEquals(0, character.getJadedExposure());
        assertEquals(0, character.getJadedSupernatural());
        assertEquals(0, character.getJadedViolence());
        assertEquals(0, character.getUnitAgility());
        assertEquals(0, character.getUnitCombat());
        assertEquals(0, character.getUnitWild());
        assertEquals(0, character.getUnitKnowledge());
        assertEquals(0, character.getUnitMysteries());
        assertEquals(0, character.getUnitSocial());
        assertEquals(0, character.getUnitOther());
        assertEquals(0, character.getUnitLanguage());
        assertEquals(0, character.getMysteries());
        assertEquals(0, character.getUnitTrade());
        assertEquals(0, character.getStartingFundsSilver());
        assertEquals(0, character.getRollsExploration());
        assertEquals(0, character.getRollsKnowledge());
        assertEquals(0, character.getRollsCombat());
        assertEquals(0, character.getRollsIntrigue());
        assertEquals(0, character.getRandomEventRolls());
        assertEquals(0, character.getEncumbranceFactor());
    }

    @Test public void testManipulation () {
        character.setWeight(5);
        assertEquals(5, character.getWeight());
        character.changeWeight(1);
        assertEquals(6, character.getWeight());
        character.changeWeight(-2);
        assertEquals(4, character.getWeight());

        character.setHeight(5);
        assertEquals(5, character.getHeight());
        character.changeHeight(1);
        assertEquals(6, character.getHeight());
        character.changeHeight(-2);
        assertEquals(4, character.getHeight());

        character.setAge(15);
        assertEquals(15, character.getAge());

        character.setJadedExposure(2);
        assertEquals(2, character.getJadedExposure());
        character.changeJadedExposure(1);
        assertEquals(3, character.getJadedExposure());
        character.changeJadedExposure(-2);
        assertEquals(1, character.getJadedExposure());

        character.setJadedViolence(2);
        assertEquals(2, character.getJadedViolence());
        character.changeJadedViolence(1);
        assertEquals(3, character.getJadedViolence());
        character.changeJadedViolence(-2);
        assertEquals(1, character.getJadedViolence());

        character.setJadedSupernatural(2);
        assertEquals(2, character.getJadedSupernatural());
        character.changeJadedSupernatural(1);
        assertEquals(3, character.getJadedSupernatural());
        character.changeJadedSupernatural(-2);
        assertEquals(1, character.getJadedSupernatural());

        character.setArchetype("lars");
        assertEquals("lars", character.getArchetype());

        character.setBackground("lars");
        assertEquals("lars", character.getBackground());

        character.setEnvironment("lars");
        assertEquals("lars", character.getEnvironment());

        character.setPeoples("lars");
        assertEquals("lars", character.getPeoples());

        character.setProvinceTotem("Larstuna");
        assertEquals("Larstuna", character.getProvinceTotem());

        character.setFirstName("lars");
        assertEquals("lars", character.getFirstName());

        character.setSurName("lars");
        assertEquals("lars", character.getSurName());

        character.setReligion("en gud");
        assertEquals("en gud", character.getReligion());

        character.setPrimaryCharacteristic("korpulent");
        assertEquals("korpulent", character.getPrimaryCharacteristic());

        character.setSecondaryCharacteristic("dum");
        assertEquals("dum", character.getSecondaryCharacteristic());

        character.setGender("hen");
        assertEquals("hen", character.getGender());

        character.setSwordArm("vänster höger marsch");
        assertEquals("vänster höger marsch", character.getSwordArm());

        character.setWellbeing(7);
        assertEquals(7, character.getWellbeing());

        character.setUnitsExpertis(2);
        assertEquals(2, character.getUnitsExpertis());
        character.changeUnitsExpertis(2);
        assertEquals(4, character.getUnitsExpertis());
        character.changeUnitsExpertis(-1);
        assertEquals(3, character.getUnitsExpertis());

        character.setUnitsTraits(2);
        assertEquals(2, character.getUnitsTraits());
        character.changeUnitsTraits(2);
        assertEquals(4, character.getUnitsTraits());
        character.changeUnitsTraits(-1);
        assertEquals(3, character.getUnitsTraits());

        character.setUnitTrade(2);
        assertEquals(2, character.getUnitTrade());
        character.changeUnitTrade(2);
        assertEquals(4, character.getUnitTrade());
        character.changeUnitTrade(-1);
        assertEquals(3, character.getUnitTrade());

        character.setEasilyLearned(2);
        assertEquals(2, character.getEasilyLearned());
        character.changeEasilyLearned(2);
        assertEquals(4, character.getEasilyLearned());
        character.changeEasilyLearned(-1);
        assertEquals(3, character.getEasilyLearned());

        character.setUnitAgility(2);
        assertEquals(2, character.getUnitAgility());
        character.changeUnitAgility(2);
        assertEquals(4, character.getUnitAgility());
        character.changeUnitAgility(-1);
        assertEquals(3, character.getUnitAgility());

        character.setUnitCombat(2);
        assertEquals(2, character.getUnitCombat());
        character.changeUnitCombat(2);
        assertEquals(4, character.getUnitCombat());
        character.changeUnitCombat(-1);
        assertEquals(3, character.getUnitCombat());

        character.setUnitWild(2);
        assertEquals(2, character.getUnitWild());
        character.changeUnitWild(2);
        assertEquals(4, character.getUnitWild());
        character.changeUnitWild(-1);
        assertEquals(3, character.getUnitWild());

        character.setUnitKnowledge(2);
        assertEquals(2, character.getUnitKnowledge());
        character.changeUnitKnowledge(2);
        assertEquals(4, character.getUnitKnowledge());
        character.changeUnitKnowledge(-1);
        assertEquals(3, character.getUnitKnowledge());

        character.setUnitMysteries(2);
        assertEquals(2, character.getUnitMysteries());
        character.changeUnitMysteries(2);
        assertEquals(4, character.getUnitMysteries());
        character.changeUnitMysteries(-1);
        assertEquals(3, character.getUnitMysteries());

        character.setUnitSocial(2);
        assertEquals(2, character.getUnitSocial());
        character.changeUnitSocial(2);
        assertEquals(4, character.getUnitSocial());
        character.changeUnitSocial(-1);
        assertEquals(3, character.getUnitSocial());

        character.setUnitOther(2);
        assertEquals(2, character.getUnitOther());
        character.changeUnitOther(2);
        assertEquals(4, character.getUnitOther());
        character.changeUnitOther(-1);
        assertEquals(3, character.getUnitOther());

        character.setUnitLanguage(2);
        assertEquals(2, character.getUnitLanguage());
        character.changeUnitLanguage(2);
        assertEquals(4, character.getUnitLanguage());
        character.changeUnitLanguage(-1);
        assertEquals(3, character.getUnitLanguage());

        character.setMysteries(2);
        assertEquals(2, character.getMysteries());
        character.changeMysteries(2);
        assertEquals(4, character.getMysteries());
        character.changeMysteries(-1);
        assertEquals(3, character.getMysteries());

        character.setStartingFundsSilver(2);
        assertEquals(2, character.getStartingFundsSilver());
        character.changeStartingFundsSilver(2);
        assertEquals(4, character.getStartingFundsSilver());
        character.changeStartingFundsSilver(-1);
        assertEquals(3, character.getStartingFundsSilver());

        character.setRollsExploration(2);
        assertEquals(2, character.getRollsExploration());
        character.changeRollsExploration(2);
        assertEquals(4, character.getRollsExploration());
        character.changeRollsExploration(-1);
        assertEquals(3, character.getRollsExploration());

        character.setRollsExploration(2);
        assertEquals(2, character.getRollsExploration());
        character.changeRollsExploration(2);
        assertEquals(4, character.getRollsExploration());
        character.changeRollsExploration(-1);
        assertEquals(3, character.getRollsExploration());

        character.setRollsKnowledge(2);
        assertEquals(2, character.getRollsKnowledge());
        character.changeRollsKnowledge(2);
        assertEquals(4, character.getRollsKnowledge());
        character.changeRollsKnowledge(-1);
        assertEquals(3, character.getRollsKnowledge());

        character.setRollsCombat(2);
        assertEquals(2, character.getRollsCombat());
        character.changeRollsCombat(2);
        assertEquals(4, character.getRollsCombat());
        character.changeRollsCombat(-1);
        assertEquals(3, character.getRollsCombat());

        character.setRollsIntrigue(2);
        assertEquals(2, character.getRollsIntrigue());
        character.changeRollsIntrigue(2);
        assertEquals(4, character.getRollsIntrigue());
        character.changeRollsIntrigue(-1);
        assertEquals(3, character.getRollsIntrigue());

        character.setRandomEventRolls(2);
        assertEquals(2, character.getRandomEventRolls());
        character.changeRandomEventRolls(2);
        assertEquals(4, character.getRandomEventRolls());
        character.changeRandomEventRolls(-1);
        assertEquals(3, character.getRandomEventRolls());

        character.setEncumbranceFactor(2);
        assertEquals(2, character.getEncumbranceFactor());
        character.changeEncumberanceFactor(2);
        assertEquals(4, character.getEncumbranceFactor());
        character.changeEncumberanceFactor(-1);
        assertEquals(3, character.getEncumbranceFactor());
    }

}

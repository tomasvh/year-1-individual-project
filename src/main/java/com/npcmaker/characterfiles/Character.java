package com.npcmaker.characterfiles;

import com.npcmaker.characterfiles.skillfiles.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Character {

    private String archetype;
    private String background;
    private String environment;
    private String peoples;
    private String provinceTotem = "";
    private String firstName;
    private String surName;
    private String religion;
    private String primaryCharacteristic;
    private String secondaryCharacteristic;
    private String gender;
    private int age;
    private int height;
    private int weight;
    private String swordArm;
    private int wellbeing = 10;
    private int unitsExpertis = 0;
    private int unitsTraits = 0;
    private int easilyLearned = 0;
    private int jadedViolence = 0;
    private int jadedExposure = 0;
    private int jadedSupernatural = 0;
    private int unitAgility = 0;
    private int unitCombat = 0;
    private int unitWild = 0;
    private int unitKnowledge = 0;
    private int unitMysteries = 0;
    private int unitSocial = 0;
    private int unitOther = 0;
    private int unitLanguage = 0;
    private int unitTrade = 0;
    private int mysteries = 0;
    private int startingFundsSilver = 0;
    private int rollsExploration = 0;
    private int rollsKnowledge = 0;
    private int rollsCombat = 0;
    private int rollsIntrigue = 0;
    private int randomEventRolls = 0;
    private int encumbranceFactor = 0;

    private ArrayList<String> specialTraitsArraylist = new ArrayList<>();
    private Set<String> easilyLearnedSet = new HashSet<>();
    private Set<String> hardLearnedSet = new HashSet<>();
    private ArrayList<String> eventArraylist = new ArrayList<>();
    private ArrayList<DerivedAttributes> derivedAttributesArrayList = new ArrayList<>();
    private ArrayList<BasicAttribute> basicAttributeArrayList = new ArrayList<>();
    private ArrayList<Skill> agilitySkillsArraylist = new ArrayList<>();
    private ArrayList<Skill> combatSkillArraylist = new ArrayList<>();
    private ArrayList<Skill> wildernessSkillArraylist = new ArrayList<>();
    private ArrayList<Skill> knowledgeSkillArraylist = new ArrayList<>();
    private ArrayList<Skill> mysteriesSkillArraylist = new ArrayList<>();
    private ArrayList<Skill> socialSkillArraylist = new ArrayList<>();
    private ArrayList<StartingFunds> startingFundsArrayList = new ArrayList<>();
    private ArrayList<String> languageArraylist = new ArrayList<>();
    private ArrayList<String> writingArraylist = new ArrayList<>();
    private ArrayList<String> equipmentArraylist = new ArrayList<>();
    private Set<Trait> traitSet = new HashSet<>();
    private Set<Expertis> expertisSet = new HashSet<>();
    private Set<Trade> tradeSet = new HashSet<>();

    public Character() {
        basicAttributeArrayList.add(new BasicAttribute("Styrka"));
        basicAttributeArrayList.add(new BasicAttribute("Tålighet"));
        basicAttributeArrayList.add(new BasicAttribute("Rörlighet"));
        basicAttributeArrayList.add(new BasicAttribute("Uppfattning"));
        basicAttributeArrayList.add(new BasicAttribute("Psyke"));
        basicAttributeArrayList.add(new BasicAttribute("Visdom"));
        basicAttributeArrayList.add(new BasicAttribute("Utstrålning"));
        basicAttributeArrayList.add(new BasicAttribute("Vilja"));

        derivedAttributesArrayList.add(new DerivedAttributes("FörFlyttning"));
        derivedAttributesArrayList.add(new DerivedAttributes("Reaktion"));
        derivedAttributesArrayList.add(new DerivedAttributes("Intryck"));
        derivedAttributesArrayList.add(new DerivedAttributes("Vaksamhet"));
        derivedAttributesArrayList.add(new DerivedAttributes("Självkontroll"));
        derivedAttributesArrayList.add(new DerivedAttributes("Kroppsbyggnad"));
        derivedAttributesArrayList.add(new DerivedAttributes("Livskraft"));
        derivedAttributesArrayList.add(new DerivedAttributes("Grundskada"));
        derivedAttributesArrayList.add(new DerivedAttributes("Grundrustning"));

        agilitySkillsArraylist.add(new Skill("Dansa",2));
        agilitySkillsArraylist.add(new Skill("Fingerfärdighet",2));
        agilitySkillsArraylist.add(new Skill("Gömma",2));
        agilitySkillsArraylist.add(new Skill("Hoppa",2));
        agilitySkillsArraylist.add(new Skill("Klättra",2));
        agilitySkillsArraylist.add(new Skill("Låsdyrkning",0));
        agilitySkillsArraylist.add(new Skill("Simma",0));
        agilitySkillsArraylist.add(new Skill("Smyga",2));
        agilitySkillsArraylist.add(new Skill("Undvika",2));

        combatSkillArraylist.add(new Skill("Armborst",2));
        combatSkillArraylist.add(new Skill("Båge",2));
        combatSkillArraylist.add(new Skill("Dolk",2));
        combatSkillArraylist.add(new Skill("Kastvapen",2));
        combatSkillArraylist.add(new Skill("Klubba",2));
        combatSkillArraylist.add(new Skill("Kedjevapen",2));
        combatSkillArraylist.add(new Skill("Sköld",2));
        combatSkillArraylist.add(new Skill("Slagsmål",2));
        combatSkillArraylist.add(new Skill("Spjut",2));
        combatSkillArraylist.add(new Skill("Stav",2));
        combatSkillArraylist.add(new Skill("Svärd",2));
        combatSkillArraylist.add(new Skill("Yxa",2));

        socialSkillArraylist.add(new Skill("Argumentera",2));
        socialSkillArraylist.add(new Skill("Berättarkonst",2));
        socialSkillArraylist.add(new Skill("Charm",2));
        socialSkillArraylist.add(new Skill("Dupera",2));
        socialSkillArraylist.add(new Skill("Genomskåda",2));
        socialSkillArraylist.add(new Skill("Hovliv",0));
        socialSkillArraylist.add(new Skill("Injaga fruktan",2));
        socialSkillArraylist.add(new Skill("Ledarskap",2));
        socialSkillArraylist.add(new Skill("Skumraskaffärer",0));
        socialSkillArraylist.add(new Skill("Spel & Dobbel",2));
        socialSkillArraylist.add(new Skill("Sång & Musik",2));

        mysteriesSkillArraylist.add(new Skill("Ceremoni",0));
        mysteriesSkillArraylist.add(new Skill("Förnimma",0));
        mysteriesSkillArraylist.add(new Skill("Förvränga",0));
        mysteriesSkillArraylist.add(new Skill("Kanalisera",0));
        mysteriesSkillArraylist.add(new Skill("Harmonisera", 0));

        knowledgeSkillArraylist.add(new Skill("Filosofi",0));
        knowledgeSkillArraylist.add(new Skill("Geografi",0));
        knowledgeSkillArraylist.add(new Skill("Gifter & Droger",0));
        knowledgeSkillArraylist.add(new Skill("Handel",2));
        knowledgeSkillArraylist.add(new Skill("Historia",0));
        knowledgeSkillArraylist.add(new Skill("Kalkylera",0));
        knowledgeSkillArraylist.add(new Skill("Kirurgi",0));
        knowledgeSkillArraylist.add(new Skill("Krigsföring",0));
        knowledgeSkillArraylist.add(new Skill("Kulturkännedom",0));
        knowledgeSkillArraylist.add(new Skill("Lagkunskap",0));
        knowledgeSkillArraylist.add(new Skill("Läkekonst",0));
        knowledgeSkillArraylist.add(new Skill("Ockultism",0));
        knowledgeSkillArraylist.add(new Skill("Teologi",0));
        knowledgeSkillArraylist.add(new Skill("Teoretisk magi",0));
        knowledgeSkillArraylist.add(new Skill("Undervisa",0));

        wildernessSkillArraylist.add(new Skill("Genomsöka",2));
        wildernessSkillArraylist.add(new Skill("Jakt & Fiske",0));
        wildernessSkillArraylist.add(new Skill("Köra vagn",2));
        wildernessSkillArraylist.add(new Skill("Marsch",2));
        wildernessSkillArraylist.add(new Skill("Naturlära",0));
        wildernessSkillArraylist.add(new Skill("Navigation",0));
        wildernessSkillArraylist.add(new Skill("Orientering",2));
        wildernessSkillArraylist.add(new Skill("Rida",2));
        wildernessSkillArraylist.add(new Skill("Sjömannaskap",0));
        wildernessSkillArraylist.add(new Skill("Speja",2));
        wildernessSkillArraylist.add(new Skill("Spåra",2));
        wildernessSkillArraylist.add(new Skill("Vildmarksvana",0));
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setPeoples(String peoples) {
        this.peoples = peoples;
    }

    public void changeUnitsExpertis(int unitsExpertis) {
        this.unitsExpertis += unitsExpertis;
    }

    public void changeUnitsTraits(int unitsTraits) {
        this.unitsTraits += unitsTraits;
    }

    public void changeEasilyLearned(int easilyLearned) {
        this.easilyLearned += easilyLearned;
    }

    public void setJadedViolence(int jadedViolence) {
        this.jadedViolence = jadedViolence;
    }

    public void setJadedSupernatural(int jadedSupernatural) {
        this.jadedSupernatural = jadedSupernatural;
    }

    public void setJadedExposure(int jadedExposure) {
        this.jadedExposure = jadedExposure;
    }

    public void changeJadedViolence(int jadedViolence) {
        this.jadedViolence += jadedViolence;
    }

    public void changeJadedExposure(int jadedExposure) {
        this.jadedExposure += jadedExposure;
    }

    public void changeJadedSupernatural(int jadedSupernatural) {
        this.jadedSupernatural += jadedSupernatural;
    }

    public void changeUnitAgility(int unitAgility) {
        this.unitAgility += unitAgility;
    }

    public void changeUnitCombat(int unitCombat) {
        this.unitCombat += unitCombat;
    }

    public void changeUnitWild(int unitWild) {
        this.unitWild += unitWild;
    }

    public void changeUnitKnowledge(int unitKnowledge) {
        this.unitKnowledge += unitKnowledge;
    }

    public void changeUnitMysteries(int unitMysteries) {
        this.unitMysteries += unitMysteries;
    }

    public void changeUnitSocial(int unitSocial) {
        this.unitSocial += unitSocial;
    }

    public void changeUnitOther(int unitOther) {
        this.unitOther += unitOther;
    }

    public void changeUnitLanguage(int unitLanguage) {
        this.unitLanguage += unitLanguage;
    }

    public void changeUnitTrade(int unitTrade) {
        this.unitTrade += unitTrade;
    }

    public void changeMysteries(int mysteries) {
        this.mysteries += mysteries;
    }

    public void changeStartingFundsSilver(int startingFundsSilver) {
        this.startingFundsSilver += startingFundsSilver;
    }

    public void changeRollsExploration(int rollsExploration) {
        this.rollsExploration += rollsExploration;
    }

    public void changeRollsKnowledge(int rollsKnowledge) {
        this.rollsKnowledge += rollsKnowledge;
    }

    public void changeRollsCombat(int rollsCombat) {
        this.rollsCombat += rollsCombat;
    }

    public void changeRollsIntrigue(int rollsIntrigue) {
        this.rollsIntrigue += rollsIntrigue;
    }

    public void changeRandomEventRolls(int randomEventRolls) {
        this.randomEventRolls += randomEventRolls;
    }

    public void changeEncumberanceFactor(int encumberanceFactor) {
        this.encumbranceFactor += encumberanceFactor;
    }

    public String getArchetype() {
        return archetype;
    }

    public String getBackground() {
        return background;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getPeoples() {
        return peoples;
    }

    public int getUnitsExpertis() {
        return unitsExpertis;
    }

    public int getUnitsTraits() {
        return unitsTraits;
    }

    public int getEasilyLearned() {
        return easilyLearned;
    }

    public int getJadedViolence() {
        return jadedViolence;
    }

    public int getJadedExposure() {
        return jadedExposure;
    }

    public int getJadedSupernatural() {
        return jadedSupernatural;
    }

    public int getUnitAgility() {
        return unitAgility;
    }

    public int getUnitCombat() {
        return unitCombat;
    }

    public int getUnitWild() {
        return unitWild;
    }

    public int getUnitKnowledge() {
        return unitKnowledge;
    }

    public int getUnitMysteries() {
        return unitMysteries;
    }

    public int getUnitSocial() {
        return unitSocial;
    }

    public int getUnitOther() {
        return unitOther;
    }

    public int getUnitLanguage() {
        return unitLanguage;
    }

    public int getUnitTrade() {
        return unitTrade;
    }

    public int getMysteries() {
        return mysteries;
    }

    public int getStartingFundsSilver() {
        return startingFundsSilver;
    }
    public String startkapString() {
        return ""+ this.getStartingFundsSilver();
    }

    public int getRollsExploration() {
        return rollsExploration;
    }

    public int getRollsKnowledge() {
        return rollsKnowledge;
    }

    public int getRollsCombat() {
        return rollsCombat;
    }

    public int getRollsIntrigue() {
        return rollsIntrigue;
    }

    public int getRandomEventRolls() {
        return randomEventRolls;
    }

    public int getEncumberanceFactor() {
        return encumbranceFactor;
    }

    public ArrayList<String> getSpecialTraitsArraylist() {
        return specialTraitsArraylist;
    }

    public Set<String> getEasilyLearnedSet() {
        return easilyLearnedSet;
    }

    public Set<String> getHardLearnedSet() {
        return hardLearnedSet;
    }

    public ArrayList<String> getEventArraylist() {
        return eventArraylist;
    }

    public ArrayList<DerivedAttributes> getDerivedAttributesArrayList() {
        return derivedAttributesArrayList;
    }

    public ArrayList<BasicAttribute> getBasicAttributeArrayList() {
        return basicAttributeArrayList;
    }

    public ArrayList<Skill> getAgilitySkillsArraylist() {
        return agilitySkillsArraylist;
    }

    public ArrayList<Skill> getCombatSkillArraylist() {
        return combatSkillArraylist;
    }

    public ArrayList<Skill> getWildernessSkillArraylist() {
        return wildernessSkillArraylist;
    }

    public ArrayList<Skill> getKnowledgeSkillArraylist() {
        return knowledgeSkillArraylist;
    }

    public ArrayList<Skill> getMysteriesSkillArraylist() {
        return mysteriesSkillArraylist;
    }

    public ArrayList<Skill> getSocialSkillArraylist() {
        return socialSkillArraylist;
    }

    public ArrayList<String> getLanguageArraylist() {
        return languageArraylist;
    }

    public ArrayList<String> getEquipmentArraylist() {
        return equipmentArraylist;
    }

    public Set<Trait> getTraitSet() {
        return traitSet;
    }

    public Set<Expertis> getExpertisSet() {
        return expertisSet;
    }

    public Set<Trade> getTradeSet() {
        return tradeSet;
    }

    public ArrayList<String> getWritingArraylist() {
        return writingArraylist;
    }

    public ArrayList<StartingFunds> getStartingFundsArrayList() {
        return startingFundsArrayList;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("arketyp: ").append(this.archetype).append("\n");
        temp.append("miljö: ").append(this.environment).append("\n");
        temp.append("folkslag: ").append(this.peoples).append("\n");
        temp.append("Bakgrund: ").append(this.background).append("\n");
        temp.append("förnamn: ").append(this.getFirstName()).append("\n");
        temp.append("efternamn: ").append(this.getSurName()).append("\n");
        temp.append("religion: ").append(this.getReligion()).append("\n");
        temp.append("välmående: ").append(this.getWellbeing()).append("\n");
        temp.append("primärt karaktärsdrag: ").append(this.getPrimaryCharacteristic()).append("\n");
        temp.append("sekundärt karaktärsdrag: ").append(this.getSecondaryCharacteristic()).append("\n");

        temp.append("avtrubbV: ").append(this.getJadedViolence()).append("\n");
        temp.append("avtrubbU: ").append(this.getJadedExposure()).append("\n");
        temp.append("avtrubbO: ").append(this.getJadedSupernatural()).append("\n");

        temp.append("Grundattribut:\n");
        for (int i = 0; i<this.getBasicAttributeArrayList().size(); i++ ) {
            temp.append(this.getBasicAttributeArrayList().get(i).getName()).append(" ").append(this.getBasicAttributeArrayList().get(i).getDice()).append("D6+").append(this.getBasicAttributeArrayList().get(i).getMod()).append("\n");
        }
        temp.append("Härledda Attribut:\n");
        for (int i = 0; i<this.getDerivedAttributesArrayList().size(); i++ ) {
            temp.append(this.getDerivedAttributesArrayList().get(i).getName()).append(" ").append(this.getDerivedAttributesArrayList().get(i).getDice()).append("D6+").append(this.getDerivedAttributesArrayList().get(i).getMod()).append("\n");
        }
        temp.append("Expertiser:\n");
        for (Expertis element: this.getExpertisSet()) {
            temp.append(element.getName()).append(" ").append(element.getDice()).append("D6+").append(element.getMod()).append("\n");

        }

        temp.append("Kännetecken:\n");
        for (Trait element: this.getTraitSet()) {
            temp.append(element.getName()).append(" ").append(element.getDice()).append("D6+").append(element.getMod()).append("\n");

        }

        temp.append("Hantverk:\n");
        for (Trade element: this.getTradeSet()) {
            temp.append(element.getName()).append(" ").append(element.getDice()).append("D6+").append(element.getMod()).append("\n");

        }

        temp.append("Lättlärda:\n");
        for (String element:this.getEasilyLearnedSet()
             ) { temp.append(element).append("\n");

        }

        temp.append("Svårlärda: \n");
        for (String element:this.getHardLearnedSet()
        ) { temp.append(element).append("\n");

        }

        temp.append("Färdslag: ").append(this.getRollsExploration()).append("\n");
        temp.append("Intrigslag: ").append(this.getRollsIntrigue()).append("\n");
        temp.append("StridSlag: ").append(this.getRollsCombat()).append("\n");
        temp.append("KunskapsSlag: ").append(this.getRollsKnowledge()).append("\n");

        temp.append("enhet övriga: ").append(this.getUnitOther()).append("\n");
        temp.append("enhet rörliga: ").append(this.getUnitAgility()).append("\n");
        temp.append("enhet strid: ").append(this.getUnitCombat()).append("\n");
        temp.append("enhet kunskap: ").append(this.getUnitKnowledge()).append("\n");
        temp.append("enhet vildmark: ").append(this.getUnitWild()).append("\n");
        temp.append("enhet mystik: ").append(this.getUnitMysteries()).append("\n");
        temp.append("enhet sociala: ").append(this.getUnitSocial()).append("\n");

        for (int i = 0; i < this.getEventArraylist().size(); i++) {
            temp.append(this.getEventArraylist().get(i)).append("\n");
        }

        for (StartingFunds element:this.getStartingFundsArrayList()) {
            temp.append("Startkapitalslag: ").append(element.getDice()).append("D6*").append(element.getMod()).append("\n");
        }

        temp.append("Startkapital = ").append(this.getStartingFundsSilver());
        return temp.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getWellbeing() {
        return wellbeing;
    }

    public String getValmaendeText() {
        return ""+ this.getWellbeing();
    }

    public void setWellbeing(int wellbeing) {
        this.wellbeing = wellbeing;
    }

    public String getProvinceTotem() {
        return provinceTotem;
    }

    public void setProvinceTotem(String provinceTotem) {
        this.provinceTotem = provinceTotem;
    }

    public String getPrimaryCharacteristic() {
        return primaryCharacteristic;
    }

    public void setPrimaryCharacteristic(String primaryCharacteristic) {
        this.primaryCharacteristic = primaryCharacteristic;
    }

    public String getSecondaryCharacteristic() {
        return secondaryCharacteristic;
    }

    public void setSecondaryCharacteristic(String secondaryCharacteristic) {
        this.secondaryCharacteristic = secondaryCharacteristic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getAlderText() {
        return ""+ this.getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public String getLangdText() {
        return ""+ this.getHeight();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void changeHeight(int height) {this.height += height;}

    public int getWeight() {
        return weight;
    }

    public String getViktText() {
        return ""+ this.getWeight();
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void changeWeight(int weight) {
        this.weight += weight;
    }

    public String getSwordArm() {
        return swordArm;
    }

    public void setSwordArm(String swordArm) {
        this.swordArm = swordArm;
    }

    public int getEncumbranceFactor() {
        return encumbranceFactor;
    }

    public void setEncumbranceFactor(int encumbranceFactor) {
        this.encumbranceFactor = encumbranceFactor;
    }

    public void setUnitsExpertis(int unitsExpertis) {
        this.unitsExpertis = unitsExpertis;
    }

    public void setUnitsTraits(int unitsTraits) {
        this.unitsTraits = unitsTraits;
    }

    public void setEasilyLearned(int easilyLearned) {
        this.easilyLearned = easilyLearned;
    }

    public void setUnitAgility(int unitAgility) {
        this.unitAgility = unitAgility;
    }

    public void setUnitCombat(int unitCombat) {
        this.unitCombat = unitCombat;
    }

    public void setUnitWild(int unitWild) {
        this.unitWild = unitWild;
    }

    public void setUnitKnowledge(int unitKnowledge) {
        this.unitKnowledge = unitKnowledge;
    }

    public void setUnitMysteries(int unitMysteries) {
        this.unitMysteries = unitMysteries;
    }

    public void setUnitSocial(int unitSocial) {
        this.unitSocial = unitSocial;
    }

    public void setUnitOther(int unitOther) {
        this.unitOther = unitOther;
    }

    public void setUnitLanguage(int unitLanguage) {
        this.unitLanguage = unitLanguage;
    }

    public void setUnitTrade(int unitTrade) {
        this.unitTrade = unitTrade;
    }

    public void setMysteries(int mysteries) {
        this.mysteries = mysteries;
    }

    public void setStartingFundsSilver(int startingFundsSilver) {
        this.startingFundsSilver = startingFundsSilver;
    }

    public void setRollsExploration(int rollsExploration) {
        this.rollsExploration = rollsExploration;
    }

    public void setRollsKnowledge(int rollsKnowledge) {
        this.rollsKnowledge = rollsKnowledge;
    }

    public void setRollsCombat(int rollsCombat) {
        this.rollsCombat = rollsCombat;
    }

    public void setRollsIntrigue(int rollsIntrigue) {
        this.rollsIntrigue = rollsIntrigue;
    }

    public void setRandomEventRolls(int randomEventRolls) {
        this.randomEventRolls = randomEventRolls;
    }
}

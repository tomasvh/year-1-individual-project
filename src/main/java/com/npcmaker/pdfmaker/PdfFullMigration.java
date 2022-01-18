package com.npcmaker.pdfmaker;

import com.npcmaker.characterfiles.Character;
import com.npcmaker.characterfiles.skillfiles.Expertis;
import com.npcmaker.characterfiles.skillfiles.Trade;
import com.npcmaker.characterfiles.skillfiles.Trait;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.io.File;
import java.io.IOException;

public class PdfFullMigration {
    private Character character;
    private PDDocument pdfTemplate;
    private PDDocument _generatedDocument;
    String d = System.getProperty("user.home");
    String pdfPath = d + File.separator + "NPCmaker" + File.separator;
    String originalPdfPath = pdfPath +"fullstandigpdfv1.PDF";
    String targetPdfPath;
    File pdf = new File(originalPdfPath);
    private int expertisIndex = 0;
    private int traitIndex = 0;
    private int tradeIndex = 0;

    public PdfFullMigration(Character character){
        this.character = character;
    }

    public void setField(String fieldName, String value ) throws IOException {
        PDDocumentCatalog docCatalog = this.get_generatedDocument().getDocumentCatalog();
        PDAcroForm acroForm = docCatalog.getAcroForm();
        PDField field = acroForm.getField( fieldName );
        if( field != null ) {
            field.setValue(value);
        }
        else {
            System.err.println( "No field found with name:" + fieldName );
        }
    }

    public void checkBox(String fieldName){
        PDDocumentCatalog documentCatalog = this.get_generatedDocument().getDocumentCatalog();
        PDAcroForm acroForm = documentCatalog.getAcroForm();
        PDField field = acroForm.getField(fieldName);
        ((PDCheckBox) field).setPushButton(true);
    }

    public void exportToPdf ()  {
        StringBuilder tempTarget = new StringBuilder();
        if (this.character.getSurName() != null){
            tempTarget.append(this.pdfPath).append(this.character.getFirstName()).append(" ").append(this.character.getSurName()).append(".PDF");
        } else {
            tempTarget.append(this.pdfPath).append(this.character.getFirstName()).append(".PDF");
        }
        String targetPdf = tempTarget.toString();

        try {
            pdfTemplate = PDDocument.load(new File(originalPdfPath));
            _generatedDocument = pdfTemplate;
        } catch (IOException e) {
            e.printStackTrace();
        }
        _generatedDocument.getNumberOfPages();

        try {
            setField("fornamnText", this.getCharacter().getFirstName());
            setField("efternamnText", this.getCharacter().getSurName());
            setField("folkslagText", this.getCharacter().getPeoples());
            setField("provinsTotemText", this.getCharacter().getProvinceTotem());
            setField("konText", this.getCharacter().getGender());
            setField("alderText", this.getCharacter().getAlderText());
            setField("religionText", this.getCharacter().getReligion());
            setField("varvText", this.getCharacter().getArchetype());
            setField("langdText", this.getCharacter().getLangdText());
            setField("viktText", this.getCharacter().getViktText());
            setField("primKaraktarText", this.getCharacter().getPrimaryCharacteristic());
            setField("vapenArmText", this.getCharacter().getSwordArm());
            setField("sekKaraktarText", this.getCharacter().getSecondaryCharacteristic());

            if (character.getJadedViolence() != 0){
                checkBox("avtrubbV"+ character.getJadedViolence());
            }
            if (character.getJadedExposure() != 0) {
                checkBox("avtrubbU" + character.getJadedExposure());
            }
            if (character.getJadedSupernatural() != 0) {
                checkBox("avtrubbO" + character.getJadedSupernatural());
            }

            setField("styrkaText", this.getCharacter().getBasicAttributeArrayList().get(0).valueToString());
            setField("rorlighetText", this.getCharacter().getBasicAttributeArrayList().get(2).valueToString());
            setField("talighetText", this.getCharacter().getBasicAttributeArrayList().get(1).valueToString());
            setField("uppfattningText", this.getCharacter().getBasicAttributeArrayList().get(3).valueToString());
            setField("viljaText", this.getCharacter().getBasicAttributeArrayList().get(7).valueToString());
            setField("psykeText", this.getCharacter().getBasicAttributeArrayList().get(4).valueToString());
            setField("visdomText", this.getCharacter().getBasicAttributeArrayList().get(5).valueToString());
            setField("utstralningText", this.getCharacter().getBasicAttributeArrayList().get(6).valueToString());

            setField("forflyttningText", this.getCharacter().getDerivedAttributesArrayList().get(0).valueToString());
            setField("intryckText", this.getCharacter().getDerivedAttributesArrayList().get(2).valueToString());
            setField("kroppsbyggnadText", this.getCharacter().getDerivedAttributesArrayList().get(5).valueToString());
            setField("reaktionText", this.getCharacter().getDerivedAttributesArrayList().get(1).valueToString());
            setField("sjalvkontrollText", this.getCharacter().getDerivedAttributesArrayList().get(4).valueToString());
            setField("vaksamhetText", this.getCharacter().getDerivedAttributesArrayList().get(3).valueToString());
            setField("livskraftText", this.getCharacter().getDerivedAttributesArrayList().get(6).valueToString());
            setField("grundskadaText", this.getCharacter().getDerivedAttributesArrayList().get(7).valueToString());
            setField("grundpansarText", this.getCharacter().getDerivedAttributesArrayList().get(8).modToString());

            setField("armborstText", this.getCharacter().getCombatSkillArraylist().get(0).valueToString());
            setField("bageText", this.getCharacter().getCombatSkillArraylist().get(1).valueToString());
            setField("dolkText", this.getCharacter().getCombatSkillArraylist().get(2).valueToString());
            setField("kastvapenText", this.getCharacter().getCombatSkillArraylist().get(3).valueToString());
            setField("klubbaText", this.getCharacter().getCombatSkillArraylist().get(4).valueToString());
            setField("kedjevapenText", this.getCharacter().getCombatSkillArraylist().get(5).valueToString());
            setField("skoldText", this.getCharacter().getCombatSkillArraylist().get(6).valueToString());
            setField("slagsmalText", this.getCharacter().getCombatSkillArraylist().get(7).valueToString());
            setField("spjutText", this.getCharacter().getCombatSkillArraylist().get(8).valueToString());
            setField("stavText", this.getCharacter().getCombatSkillArraylist().get(9).valueToString());
            setField("svardText", this.getCharacter().getCombatSkillArraylist().get(10).valueToString());
            setField("yxaText", this.getCharacter().getCombatSkillArraylist().get(11).valueToString());

            setField("dansaText", this.getCharacter().getAgilitySkillsArraylist().get(0).valueToString());
            setField("fingerText", this.getCharacter().getAgilitySkillsArraylist().get(1).valueToString());
            setField("gommaText", this.getCharacter().getAgilitySkillsArraylist().get(2).valueToString());
            setField("hoppaText", this.getCharacter().getAgilitySkillsArraylist().get(3).valueToString());
            setField("klattraText", this.getCharacter().getAgilitySkillsArraylist().get(4).valueToString());
            setField("lasdyrkningText", this.getCharacter().getAgilitySkillsArraylist().get(5).valueToString());
            setField("simmaText", this.getCharacter().getAgilitySkillsArraylist().get(6).valueToString());
            setField("smygaText", this.getCharacter().getAgilitySkillsArraylist().get(7).valueToString());
            setField("undvikaText", this.getCharacter().getAgilitySkillsArraylist().get(8).valueToString());

            setField("ceremoniText", this.getCharacter().getMysteriesSkillArraylist().get(0).valueToString());
            setField("fornimmaText", this.getCharacter().getMysteriesSkillArraylist().get(1).valueToString());
            setField("forvrangaText", this.getCharacter().getMysteriesSkillArraylist().get(2).valueToString());
            setField("harmoniseraText", this.getCharacter().getMysteriesSkillArraylist().get(4).valueToString());
            setField("kanaliseraText", this.getCharacter().getMysteriesSkillArraylist().get(3).valueToString());

            setField("argumenteraText", this.getCharacter().getSocialSkillArraylist().get(0).valueToString());
            setField("berattarkonstText", this.getCharacter().getSocialSkillArraylist().get(1).valueToString());
            setField("charmText", this.getCharacter().getSocialSkillArraylist().get(2).valueToString());
            setField("duperaText", this.getCharacter().getSocialSkillArraylist().get(3).valueToString());
            setField("genomskadaText", this.getCharacter().getSocialSkillArraylist().get(4).valueToString());
            setField("hovlivText", this.getCharacter().getSocialSkillArraylist().get(5).valueToString());
            setField("injagaText", this.getCharacter().getSocialSkillArraylist().get(6).valueToString());
            setField("ledarskapText", this.getCharacter().getSocialSkillArraylist().get(7).valueToString());
            setField("skumraskText", this.getCharacter().getSocialSkillArraylist().get(8).valueToString());
            setField("spelText", this.getCharacter().getSocialSkillArraylist().get(9).valueToString());
            setField("sangText", this.getCharacter().getSocialSkillArraylist().get(10).valueToString());

            setField("genomsokaText", this.getCharacter().getWildernessSkillArraylist().get(0).valueToString());
            setField("jaktText", this.getCharacter().getWildernessSkillArraylist().get(1).valueToString());
            setField("koravagnText", this.getCharacter().getWildernessSkillArraylist().get(2).valueToString());
            setField("marschText", this.getCharacter().getWildernessSkillArraylist().get(3).valueToString());
            setField("naturlaraText", this.getCharacter().getWildernessSkillArraylist().get(4).valueToString());
            setField("navigationText", this.getCharacter().getWildernessSkillArraylist().get(5).valueToString());
            setField("orienteringText", this.getCharacter().getWildernessSkillArraylist().get(6).valueToString());
            setField("ridaText", this.getCharacter().getWildernessSkillArraylist().get(7).valueToString());
            setField("sjomannaskapText", this.getCharacter().getWildernessSkillArraylist().get(8).valueToString());
            setField("spejaText", this.getCharacter().getWildernessSkillArraylist().get(9).valueToString());
            setField("sparaText", this.getCharacter().getWildernessSkillArraylist().get(10).valueToString());
            setField("vildmarksvanaText", this.getCharacter().getWildernessSkillArraylist().get(11).valueToString());

            setField("filosofiText", this.getCharacter().getKnowledgeSkillArraylist().get(0).valueToString());
            setField("geografiText", this.getCharacter().getKnowledgeSkillArraylist().get(1).valueToString());
            setField("giftText", this.getCharacter().getKnowledgeSkillArraylist().get(2).valueToString());
            setField("handelText", this.getCharacter().getKnowledgeSkillArraylist().get(3).valueToString());
            setField("historiaText", this.getCharacter().getKnowledgeSkillArraylist().get(4).valueToString());
            setField("kalkyleraText", this.getCharacter().getKnowledgeSkillArraylist().get(5).valueToString());
            setField("kirurgiText", this.getCharacter().getKnowledgeSkillArraylist().get(6).valueToString());
            setField("krigsforingText", this.getCharacter().getKnowledgeSkillArraylist().get(7).valueToString());
            setField("kulturkannedomText", this.getCharacter().getKnowledgeSkillArraylist().get(8).valueToString());
            setField("lagkunskapText", this.getCharacter().getKnowledgeSkillArraylist().get(9).valueToString());
            setField("lakekonstText", this.getCharacter().getKnowledgeSkillArraylist().get(10).valueToString());
            setField("ockultismText", this.getCharacter().getKnowledgeSkillArraylist().get(11).valueToString());
            setField("teologiText", this.getCharacter().getKnowledgeSkillArraylist().get(12).valueToString());
            setField("teoretiskText", this.getCharacter().getKnowledgeSkillArraylist().get(13).valueToString());
            setField("undervisaText", this.getCharacter().getKnowledgeSkillArraylist().get(14).valueToString());

            for (Expertis element: this.getCharacter().getExpertisSet()) {
                setField("expertisNamnText"+ expertisIndex, element.getName());
                setField("expertisVardeText"+ expertisIndex, element.valueToString());
                expertisIndex++;
            }

            for (Trade element: this.getCharacter().getTradeSet()) {
                setField("hantverk"+ tradeIndex, element.getName());
                setField("hantverkVarde"+ tradeIndex, element.valueToString());
                tradeIndex++;
            }

            for (Trait element: this.getCharacter().getTraitSet()) {
                setField("kanneteckenNamnText"+ traitIndex, element.getName());
                setField("kanneteckenVardeText"+ traitIndex, element.valueToString());
                traitIndex++;
            }

            for (int i = 0; i < this.getCharacter().getLanguageArraylist().size(); i++){
                setField("sprakText"+i, this.getCharacter().getLanguageArraylist().get(i));
            }

            if (this.getCharacter().getWritingArraylist().size() != 0){
                for (int i = 0; i < this.getCharacter().getWritingArraylist().size(); i++){
                    setField("skriftText"+i, this.getCharacter().getWritingArraylist().get(i));
                }
            }
            expertisIndex = 0;
            if (this.getCharacter().getEasilyLearnedSet().size() != 0) {
                for (String element: character.getEasilyLearnedSet()){
                    setField("lattlard"+ expertisIndex, element);
                    expertisIndex++;
                }
            }
            expertisIndex = 0;
            if (this.getCharacter().getHardLearnedSet().size() != 0) {
                for (String element: character.getHardLearnedSet()){
                    setField("svarlard"+ expertisIndex, element);
                    expertisIndex++;
                }
            }

            for (int i = 0; i < this.getCharacter().getEventArraylist().size(); i++){
                setField("handelse"+i, this.getCharacter().getEventArraylist().get(i));
            }

            if (this.getCharacter().getSpecialTraitsArraylist().size() != 0) {
                for (int i = 0; i < this.getCharacter().getSpecialTraitsArraylist().size(); i++){
                    setField("egenskap"+i, this.getCharacter().getSpecialTraitsArraylist().get(i));
                }
            }

            for (int i = 0; i < this.getCharacter().getEquipmentArraylist().size(); i++){
                setField("utrustning"+i, this.getCharacter().getEquipmentArraylist().get(i));
            }

            setField("startkapital", this.getCharacter().startkapString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            _generatedDocument.save(new File(targetPdf));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            _generatedDocument.close();
            pdfTemplate.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PDDocument getPdfTemplate() {
        return pdfTemplate;
    }

    public void setPdfTemplate(PDDocument pdfTemplate) {
        this.pdfTemplate = pdfTemplate;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    public String getOriginalPdfPath() {
        return originalPdfPath;
    }

    public void setOriginalPdfPath(String originalPdfPath) {
        this.originalPdfPath = originalPdfPath;
    }

    public File getPdf() {
        return pdf;
    }

    public void setPdf(File pdf) {
        this.pdf = pdf;
    }

    public Character getCharacter() {
        return character;
    }

    public String getTargetPdfPath() {
        return targetPdfPath;
    }

    public PDDocument get_generatedDocument() {
        return _generatedDocument;
    }

    public void set_generatedDocument(PDDocument _generatedDocument) {
        this._generatedDocument = _generatedDocument;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}

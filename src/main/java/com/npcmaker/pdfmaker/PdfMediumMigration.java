package com.npcmaker.pdfmaker;

import com.npcmaker.characterfiles.Character;
import com.npcmaker.characterfiles.skillfiles.Expertis;
import com.npcmaker.characterfiles.skillfiles.Skill;
import com.npcmaker.characterfiles.skillfiles.Trade;
import com.npcmaker.characterfiles.skillfiles.Trait;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.io.File;
import java.io.IOException;

public class PdfMediumMigration {
    private Character character;
    private PDDocument pdfTemplate;
    private PDDocument _generatedDocument;
    String d = System.getProperty("user.home");
    String pdfPath = d + File.separator + "NPCmaker" + File.separator;
    String originalPdfPath = pdfPath +"mediumpdfv1.PDF";
    String targetPdfPath;
    File pdf = new File(originalPdfPath);
    private int setIndex = 0;
    private int skillcount = 0;

    public PdfMediumMigration(Character character){
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

            for (Skill element: character.getCombatSkillArraylist()
                 ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }

            for (Skill element: character.getAgilitySkillsArraylist()
            ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }

            for (Skill element: character.getMysteriesSkillArraylist()
            ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }

            for (Skill element: character.getSocialSkillArraylist()
            ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }

            for (Skill element: character.getWildernessSkillArraylist()
            ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }

            for (Skill element: character.getKnowledgeSkillArraylist()
            ) {
                if (element.getDice() != 0) {
                    setField("fardighet"+skillcount, element.getName());
                    setField("fardighetsvarde"+skillcount, element.valueToString());
                    skillcount++;
                }

            }




            for (Expertis element: this.getCharacter().getExpertisSet()) {
                setField("expertisNamnText"+setIndex, element.getName());
                setField("expertisVardeText"+setIndex, element.valueToString());
                setIndex++;
            }
            setIndex = 0;
            for (Trade element: this.getCharacter().getTradeSet()) {
                setField("hantverkNamnText"+setIndex, element.getName());
                setField("hantverkVardeText"+setIndex, element.valueToString());
                setIndex++;
            }
            setIndex = 0;
            for (Trait element: this.getCharacter().getTraitSet()) {
                setField("kanneteckenNamnText"+setIndex, element.getName());
                setField("kanneteckenVardeText"+setIndex, element.valueToString());
                setIndex++;
            }

            for (int i = 0; i < this.getCharacter().getLanguageArraylist().size(); i++){
                setField("sprakText"+i, this.getCharacter().getLanguageArraylist().get(i));
            }

            if (this.getCharacter().getWritingArraylist().size() != 0){
                for (int i = 0; i < this.getCharacter().getWritingArraylist().size(); i++){
                    setField("skriftText"+i, this.getCharacter().getWritingArraylist().get(i));
                }
            }
            setIndex = 0;


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

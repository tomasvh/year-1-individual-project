package com.npcmaker.fxmlcontrollers;


import com.npcmaker.characterfiles.skillfiles.*;
import com.npcmaker.dbhelper.DbConnector;
import com.npcmaker.pdfmaker.PdfFullMigration;
import com.npcmaker.characterfiles.Character;
import com.npcmaker.pdfmaker.PdfKompaktMigration;
import com.npcmaker.pdfmaker.PdfMediumMigration;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.ResourceBundle;

public class PreviewFXMLController implements Initializable {

private JavaFXTableData currentSelection = new JavaFXTableData();

private final HashMap<Integer, JavaFXTableData> selectionMap = new HashMap<>();

private Character character;
private Alert alert = new Alert(Alert.AlertType.NONE);

private ObservableList<JavaFXTableData> gAList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> hAList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fSList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fRList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fMList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fSocList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fKList = FXCollections.observableArrayList();
private ObservableList<JavaFXTableData> fVList = FXCollections.observableArrayList();

private Integer lastID = 0;





    @FXML public Button buttonConfig;
    @FXML public Button buttonReturn;

    @FXML public TextField fornamnText;
    @FXML public TextField efternamnText;
    @FXML public TextField folkslagText;
    @FXML public TextField provTotemText;
    @FXML public TextField konText;
    @FXML public TextField religionText;
    @FXML public TextField arketypText;
    @FXML public TextField miljoText;
    @FXML public TextField bakgrundText;
    @FXML public Spinner<Integer> langdText;
    @FXML public Spinner<Integer> viktText;
    @FXML public Spinner<Integer> valmaendeSpinner;
    @FXML public Spinner<Integer> avtrubbVSpinner;
    @FXML public Spinner<Integer> avtrubbUSpinner;
    @FXML public Spinner<Integer> avtrubbOSpinner;
    @FXML public TextField primKarText;
    @FXML public TextField sekKarText;

    @FXML public Button uppdateraTextFalt;



    @FXML public TableView<JavaFXTableData> grundAttributTable;
    @FXML public TableColumn<JavaFXTableData, String> grundAttributNamn;
    @FXML public TableColumn<JavaFXTableData, Integer> grundAttributT;
    @FXML public TableColumn<JavaFXTableData, Integer> grundAttributMod;

    @FXML public TableView<JavaFXTableData> harleddaAttributTable;
    @FXML public TableColumn<JavaFXTableData, String> harleddAttribut;
    @FXML public TableColumn<JavaFXTableData, Integer> harleddT;
    @FXML public TableColumn<JavaFXTableData, Integer> harleddMod;

    @FXML public TableView<JavaFXTableData> stridsFardigheterTable;
    @FXML public TableColumn<JavaFXTableData, String> sFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> sFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> sFardighetMod;

    @FXML public TableView<JavaFXTableData> rorelseFardigheterTable;
    @FXML public TableColumn<JavaFXTableData, String> rFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> rFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> rFardighetMod;

    @FXML public TableView<JavaFXTableData> mystikFardighetTable;
    @FXML public TableColumn<JavaFXTableData, String> mFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> mFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> mFardighetMod;

    @FXML public TableView<JavaFXTableData> socialFardighetTable;
    @FXML public TableColumn<JavaFXTableData, String> socFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> socFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> socFardighetMod;

    @FXML public TableView<JavaFXTableData> kunskapsFardighetTable;
    @FXML public TableColumn<JavaFXTableData, String> kFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> kFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> kFardighetMod;

    @FXML public TableView<JavaFXTableData> vildmarksFardighetTable;
    @FXML public TableColumn<JavaFXTableData, String> vFardighet;
    @FXML public TableColumn<JavaFXTableData, Integer> vFardighetT;
    @FXML public TableColumn<JavaFXTableData, Integer> vFardighetMod;

    @FXML public TextField editEgenskap;
    @FXML public Spinner<Integer> editTMod;
    @FXML public Spinner<Integer> editMod;
    @FXML public Button uppdateraTableRow;
    @FXML public Button dropTableRow;

    @FXML public Button fullToPdf;
    @FXML public Button mediumToPdf;
    @FXML public Button kompaktToPdf;

    public void changeScreenChoice(ActionEvent event){
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ConfigFullFXML.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeScreenHome(ActionEvent event){
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/EntryFullFXML.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int randomNumber (int max) {
        Random random = new Random();
        return random.nextInt(max)+1;
    }

    public static void populateKunMys (Character character, int number){
        switch (randomNumber(2)){
            case 1:
                character.changeUnitKnowledge(number);
                break;
            case 2:
                character.changeUnitMysteries(number);
                break;
        }
    }

    public static void calcFreeChoiceSkill(Character character) {
        while (character.getUnitOther() != 0) {
            int selection = randomNumber(6);
            switch (selection){
                case 1:
                    character.changeUnitAgility(1);
                    break;
                case 2:
                    character.changeUnitCombat(1);
                    break;
                case 3:
                    character.changeUnitKnowledge(1);
                    break;
                case 4:
                    character.changeUnitMysteries(1);
                    break;
                case 5:
                    character.changeUnitWild(1);
                    break;
                case 6:
                    character.changeUnitSocial(1);
                    break;
            }
            character.changeUnitOther(-1);
        }
    }

    public static void dbKamorianInteract(Character character, Connection conn, String tableName, int id){
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + " where ID = " + id);
            while (rs.next()) {
                dbTableInteract(character,conn,"kamorian", id);
                if (id == 10){
                    dbTableInteract(character,conn,"kamorian", randomNumber(9));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void specialTable(Character character, Connection conn, String tableName, int id){
        switch (tableName){
            case "folkslag":
                switch (id){
                    case 6:
                        dbTableInteract(character,conn,"jargier", randomNumber(10));
                        break;
                    case 7:
                        dbKamorianInteract(character, conn, "kamorian", randomNumber(10));
                        break;
                }
            case "farderaventyr":
                switch (id){
                    case 1:
                        dbTableInteract(character,conn,"allvarligolycka", randomNumber(16));
                        break;
                    case 19:
                        dbTableInteract(character,conn,"feltidfelplats", randomNumber(3));
                        break;
                    case 22:
                        switch (randomNumber(2)) {
                            case 1:
                                character.changeUnitsExpertis(1);
                                character.getEventArraylist().add("Lämnat främlingen");
                                break;
                            case 2:
                                dbTableInteract(character,conn,"framlingifara", randomNumber(30));
                                break;
                        }
                        break;
                    case 25 :
                    case 53:
                        dbTableInteract(character, conn, "randomgrundattribut", randomNumber(8));
                        break;
                    case 34:
                        dbTableInteract(character, conn, "dubbelbakgrund", randomNumber(10));
                        break;
                    case 35:
                        dbTableInteract(character, conn, "hittatkropp", randomNumber(2));
                        break;
                    case 56:
                        character.getHardLearnedSet().add("Ceremoni");
                        character.getHardLearnedSet().add("Förnimma");
                        character.getHardLearnedSet().add("Förvränga");
                        character.getHardLearnedSet().add("Kanalisera");
                        character.getHardLearnedSet().add("Harmonisera");
                        break;
                    case 62:
                        dbTableInteract(character, conn, "resaovermundana", randomNumber(3));
                        break;
                    case 65:
                        dbTableInteract(character, conn, "ratttidrattplats", randomNumber(3));
                        break;
                    case 82:
                        dbTableInteract(character, conn, "storupptackt", randomNumber(3));
                        break;
                    case 87:
                        switch (randomNumber(2)){
                            case 1:
                                character.changeUnitWild(4);
                                break;
                            case 2:
                                character.changeUnitAgility(4);
                                break;
                        }
                        break;
                    case 93:
                        character.getEasilyLearnedSet().add("Genomsöka");
                        character.getEasilyLearnedSet().add("Jakt & Fiske");
                        character.getEasilyLearnedSet().add("Köra vagn");
                        character.getEasilyLearnedSet().add("Marsch");
                        character.getEasilyLearnedSet().add("Naturlära");
                        character.getEasilyLearnedSet().add("Navigation");
                        character.getEasilyLearnedSet().add("Orientering");
                        character.getEasilyLearnedSet().add("Rida");
                        character.getEasilyLearnedSet().add("Sjömannaskap");
                        character.getEasilyLearnedSet().add("Speja");
                        character.getEasilyLearnedSet().add("Spåra");
                        character.getEasilyLearnedSet().add("Vildmarksvana");
                        break;
                    case 96:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 97:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 99:
                        character.getEasilyLearnedSet().add("Dansa");
                        character.getEasilyLearnedSet().add("Fingerfärdighet");
                        character.getEasilyLearnedSet().add("Gömma");
                        character.getEasilyLearnedSet().add("Hoppa");
                        character.getEasilyLearnedSet().add("Klättra");
                        character.getEasilyLearnedSet().add("Låsdyrkning");
                        character.getEasilyLearnedSet().add("Simma");
                        character.getEasilyLearnedSet().add("Smyga");
                        character.getEasilyLearnedSet().add("Undvika");
                        break;
                }
                break;
            case "intrigerillgarningar":
                switch (id){
                    case 3:
                    case 4:
                    case 13:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 30:
                    case 31:
                    case 33:
                    case 49:
                    case 57:
                    case 64:
                    case 65:
                    case 66:
                    case 72:
                    case 73:
                    case 83:
                    case 86:
                    case 95:
                    case 97:
                    case 98:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 8:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 14:
                    case 36:
                        dbTableInteract(character, conn, "dubbelbakgrund", randomNumber(10));
                        break;
                    case 19:
                        dbTableInteract(character, conn, "erbjudengemal", randomNumber(2));
                        break;
                    case 44:
                    case 92:
                        dbTableInteract(character, conn, "randomgrundattribut", randomNumber(8));
                        break;
                    case 48:
                        switch (randomNumber(3)){
                            case 1:
                                character.setSecondaryCharacteristic("Makt");
                                break;
                            case 2:
                                character.setSecondaryCharacteristic("Sex");
                                break;
                            case 3:
                                character.setSecondaryCharacteristic("Rikedom");
                                break;
                        }
                        break;
                    case 59:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 77:
                        character.getEasilyLearnedSet().add("Argumentera");
                        character.getEasilyLearnedSet().add("Berättarkonst");
                        character.getEasilyLearnedSet().add("Charm");
                        character.getEasilyLearnedSet().add("Dupera");
                        character.getEasilyLearnedSet().add("Genomskåda");
                        character.getEasilyLearnedSet().add("Hovliv");
                        character.getEasilyLearnedSet().add("Injaga fruktan");
                        character.getEasilyLearnedSet().add("Ledarskap");
                        character.getEasilyLearnedSet().add("Skumraskaffärer");
                        character.getEasilyLearnedSet().add("Spel & Dobbel");
                        character.getEasilyLearnedSet().add("Sång & Musik");
                        break;
                    case 85:
                        dbTableInteract(character, conn, "svartmoralisktbeslut", randomNumber(3));
                        break;
                }
                break;
            case "kunskapmysterier":
                switch (id){
                    case 6:
                    case 28:
                    case 26:
                        populateKunMys(character, 2);
                        break;
                    case 8:
                        switch (randomNumber(2)){
                            case 1:
                                character.changeUnitKnowledge(4);
                                break;
                            case 2:
                                character.changeUnitMysteries(4);
                                break;
                        }
                        break;
                    case 9:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 11:
                    case 96:
                    case 46:
                    case 37:
                    case 25:
                        populateKunMys(character, 4);
                        break;
                    case 18:
                        character.getEasilyLearnedSet().add("Filosofi");
                        character.getEasilyLearnedSet().add("Geografi");
                        character.getEasilyLearnedSet().add("Gifter & Droger");
                        character.getEasilyLearnedSet().add("Handel");
                        character.getEasilyLearnedSet().add("Historia");
                        character.getEasilyLearnedSet().add("Kalkylera");
                        character.getEasilyLearnedSet().add("Kirurgi");
                        character.getEasilyLearnedSet().add("Krigsföring");
                        character.getEasilyLearnedSet().add("Kulturkännedom");
                        character.getEasilyLearnedSet().add("Lagkunskap");
                        character.getEasilyLearnedSet().add("Läkekonst");
                        character.getEasilyLearnedSet().add("Ockultism");
                        character.getEasilyLearnedSet().add("Teologi");
                        character.getEasilyLearnedSet().add("Teoretisk magi");
                        character.getEasilyLearnedSet().add("Undervisa");
                        break;
                    case 19:
                        dbBackgroundInteract(character, conn, "experiment", randomNumber(6));
                        break;
                    case 27:
                    case 65:
                    case 50:
                    case 40:
                    case 32:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 51:
                        character.getEasilyLearnedSet().add("Ceremoni");
                        character.getEasilyLearnedSet().add("Förnimma");
                        character.getEasilyLearnedSet().add("Förvränga");
                        character.getEasilyLearnedSet().add("Kanalisera");
                        character.getEasilyLearnedSet().add("Harmonisera");
                        break;
                    case 38:
                    case 67:
                        dbTableInteract(character, conn, "randomgrundattribut", randomNumber(8));
                        break;
                    case 54:
                        dbTableInteract(character, conn, "kanslokall", randomNumber(9));
                        break;
                    case 62:
                        dbTableInteract(character, conn, "dubbelbakgrund", randomNumber(10));
                        break;
                    case 68:
                        dbTableInteract(character, conn, "mottspakvinna", randomNumber(2));
                        break;
                    case 69:
                        dbTableInteract(character, conn, "mottsvartkonstnar", randomNumber(2));
                        break;
                    case 73:
                        switch (randomNumber(2)){
                            case 1:
                                character.changeMysteries(4);
                                break;
                            case 2:
                                character.changeUnitOther(3);
                                break;
                        }
                        break;
                    case 75:
                        dbTableInteract(character, conn, "provatunderligadroger", randomNumber(4));
                        break;
                    case 80:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 84:
                        populateKunMys(character, 6);
                        break;
                }
                break;
            case "striderdrabbningar":
                switch (id){
                    case 11:
                    case 86:
                    case 26:
                    case 36:
                    case 56:
                        dbBackgroundInteract(character, conn, "bakgrundstabell", randomNumber(100));
                        break;
                    case 41:
                        switch (randomNumber(2)){
                            case 1:
                                character.getBasicAttributeArrayList().get(0).changeMod(-2);
                                break;
                            case 2:
                                character.getBasicAttributeArrayList().get(1).changeMod(-2);
                                break;
                        }
                        break;
                    case 67:
                        switch (randomNumber(2)){
                            case 1:
                                character.getBasicAttributeArrayList().get(0).changeMod(-2);
                                break;
                            case 2:
                                character.getBasicAttributeArrayList().get(2).changeMod(-2);
                                break;
                        }
                        break;
                    case 68:
                        switch (randomNumber(2)){
                            case 1:
                                character.getBasicAttributeArrayList().get(1).changeMod(-2);
                                break;
                            case 2:
                                character.getBasicAttributeArrayList().get(2).changeMod(-2);
                                break;
                        }
                        break;
                    case 79:
                        character.getEasilyLearnedSet().add("Armborst");
                        character.getEasilyLearnedSet().add("Båge");
                        character.getEasilyLearnedSet().add("Dolk");
                        character.getEasilyLearnedSet().add("Kastvapen");
                        character.getEasilyLearnedSet().add("Klubba");
                        character.getEasilyLearnedSet().add("Kedjevapen");
                        character.getEasilyLearnedSet().add("Sköld");
                        character.getEasilyLearnedSet().add("Slagsmål");
                        character.getEasilyLearnedSet().add("Spjut");
                        character.getEasilyLearnedSet().add("Stav");
                        character.getEasilyLearnedSet().add("Svärd");
                        character.getEasilyLearnedSet().add("Yxa");
                        break;
                    case 92:
                        dbTableInteract(character, conn, "uppror", randomNumber(2));
                        break;
                }
                break;
        }
    }

    public static void dbBackgroundInteract(Character character, Connection conn, String tableName, int id) {
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + " where ID = " + id);
            while (rs.next()) {
                character.getEventArraylist().add(rs.getString("happening"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void calcRandomBasicAttribute(Character character) {
        int availableUnits = 10;
        while (availableUnits != 0) {
            int rNumber = randomNumber(8)-1;
            if (character.getBasicAttributeArrayList().get(rNumber).getDice() < 5){
                character.getBasicAttributeArrayList().get(rNumber).changeDice(1);
                availableUnits--;
            }
        }
    }

    public static void chooseFreeEventTable(Character character) {
        while (character.getRandomEventRolls() != 0) {
            switch (randomNumber(4)){
                case 1:
                    character.changeRollsIntrigue(1);
                    break;
                case 2:
                    character.changeRollsCombat(1);
                    break;
                case 3:
                    character.changeRollsKnowledge(1);
                    break;
                case 4:
                    character.changeRollsExploration(1);
                    break;
            }
            character.changeRandomEventRolls(-1);
        }
    }

    public static int randomNumber0Start (int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public static void buySkills(Character character) {
        while (character.getUnitKnowledge() > 0) {
            int rNumber = randomNumber0Start(character.getKnowledgeSkillArraylist().size());
            switch (character.getKnowledgeSkillArraylist().get(rNumber).getDice()){
                case 0:
                    character.getKnowledgeSkillArraylist().get(rNumber).changeDice(2);
                    character.changeUnitKnowledge(-1);
                    break;
                case 2:
                    character.getKnowledgeSkillArraylist().get(rNumber).changeDice(1);
                    character.changeUnitKnowledge(-1);
                    break;
                case 3:
                    if (character.getUnitKnowledge() >= 2){
                        character.getKnowledgeSkillArraylist().get(rNumber).changeDice(1);
                        character.changeUnitKnowledge(-2);
                    }
                    break;
                case 4:
                    if (character.getUnitKnowledge() >= 4){
                        character.getKnowledgeSkillArraylist().get(rNumber).changeDice(1);
                        character.changeUnitKnowledge(-4);
                    }
                    break;
                case 5:
                    break;
            }
        }

        while (character.getUnitMysteries() > 0) {
            int randomNumber = randomNumber0Start(character.getMysteriesSkillArraylist().size()+1);
            if (character.getMysteriesSkillArraylist().size() == randomNumber && character.getUnitMysteries() > 1){
                if (character.getJadedSupernatural() <5 ) {
                    character.changeJadedSupernatural(1);
                    character.changeUnitMysteries(-2);
                }
            } else {
                randomNumber = randomNumber0Start(character.getMysteriesSkillArraylist().size());
                switch (character.getMysteriesSkillArraylist().get(randomNumber).getDice()){
                    case 0:
                        character.getMysteriesSkillArraylist().get(randomNumber).changeDice(2);
                        character.changeUnitMysteries(-1);
                        break;
                    case 2:
                        character.getMysteriesSkillArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitMysteries(-1);
                        break;
                    case 3:
                        if (character.getUnitMysteries() >= 2){
                            character.getMysteriesSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitMysteries(-2);
                        }
                        break;
                    case 4:
                        if (character.getUnitMysteries() >= 4){
                            character.getMysteriesSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitMysteries(-4);
                        }
                        break;
                    case 5:
                        break;
                }
            }
        }

        while (character.getUnitAgility() > 0) {
            int randomNumber = randomNumber0Start(character.getAgilitySkillsArraylist().size());
            switch (character.getAgilitySkillsArraylist().get(randomNumber).getDice()){
                case 0:
                    character.getAgilitySkillsArraylist().get(randomNumber).changeDice(2);
                    character.changeUnitAgility(-1);
                    break;
                case 2:
                    character.getAgilitySkillsArraylist().get(randomNumber).changeDice(1);
                    character.changeUnitAgility(-1);
                    break;
                case 3:
                    if (character.getUnitAgility() >= 2){
                        character.getAgilitySkillsArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitAgility(-2);
                    }
                    break;
                case 4:
                    if (character.getUnitAgility() >= 4){
                        character.getAgilitySkillsArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitAgility(-4);
                    }
                    break;
                case 5:
                    break;
            }
        }

        while (character.getUnitSocial() > 0) {
            int randomNumber = randomNumber0Start(character.getSocialSkillArraylist().size()+1);
            if (character.getSocialSkillArraylist().size() == randomNumber && character.getUnitSocial() > 1) {
                if (character.getJadedExposure() < 5) {
                    character.changeJadedExposure(1);
                    character.changeUnitSocial(-2);
                }
            } else {
                randomNumber = randomNumber0Start(character.getSocialSkillArraylist().size());
                switch (character.getSocialSkillArraylist().get(randomNumber).getDice()){
                    case 0:
                        character.getSocialSkillArraylist().get(randomNumber).changeDice(2);
                        character.changeUnitSocial(-1);
                        break;
                    case 2:
                        character.getSocialSkillArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitSocial(-1);
                        break;
                    case 3:
                        if (character.getUnitSocial() >= 2){
                            character.getSocialSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitSocial(-2);
                        }
                        break;
                    case 4:
                        if (character.getUnitSocial() >= 4){
                            character.getSocialSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitSocial(-4);
                        }
                    case 5:
                        break;
                }
            }
        }

        while (character.getUnitCombat() > 0) {
            int randomNumber = randomNumber0Start(character.getCombatSkillArraylist().size()+1);
            if (character.getCombatSkillArraylist().size() == randomNumber && character.getUnitCombat() > 1){
                if (character.getJadedViolence() < 5) {
                    character.changeJadedViolence(1);
                    character.changeUnitCombat(-2);
                }
            } else {
                randomNumber = randomNumber0Start(character.getCombatSkillArraylist().size());
                switch (character.getCombatSkillArraylist().get(randomNumber).getDice()){
                    case 0:
                        character.getCombatSkillArraylist().get(randomNumber).changeDice(2);
                        character.changeUnitCombat(-1);
                        break;
                    case 2:
                        character.getCombatSkillArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitCombat(-1);
                        break;
                    case 3:
                        if (character.getUnitCombat() >= 2){
                            character.getCombatSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitCombat(-2);
                        }
                        break;
                    case 4:
                        if (character.getUnitCombat() >= 4){
                            character.getCombatSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitCombat(-4);
                        }
                    case 5:
                        break;
                }
            }
        }

        while (character.getUnitWild() > 0) {
            int randomNumber = randomNumber0Start(character.getWildernessSkillArraylist().size()+1);
            if (character.getWildernessSkillArraylist().size() == randomNumber && character.getUnitWild() > 1){
                if (character.getJadedExposure() < 5) {
                    character.changeJadedExposure(1);
                    character.changeUnitWild(-2);
                }
            } else {
                randomNumber = randomNumber0Start(character.getWildernessSkillArraylist().size());
                switch (character.getWildernessSkillArraylist().get(randomNumber).getDice()){
                    case 0:
                        character.getWildernessSkillArraylist().get(randomNumber).changeDice(2);
                        character.changeUnitWild(-1);
                        break;
                    case 2:
                        character.getWildernessSkillArraylist().get(randomNumber).changeDice(1);
                        character.changeUnitWild(-1);
                        break;
                    case 3:
                        if (character.getUnitWild() >= 2){
                            character.getWildernessSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitWild(-2);
                        }
                        break;
                    case 4:
                        if (character.getUnitWild() >= 4){
                            character.getWildernessSkillArraylist().get(randomNumber).changeDice(1);
                            character.changeUnitWild(-4);
                        }
                    case 5:
                        break;
                }
            }
        }
    }

    public static void rollEventTables (Character character, Connection conn){
        while (character.getRollsExploration() != 0) {
            dbTableInteract(character, conn, "farderaventyr", randomNumber(100));
            character.changeRollsExploration(-1);
        }
        while (character.getRollsKnowledge() != 0) {
            dbTableInteract(character, conn, "kunskapmysterier", randomNumber(100));
            character.changeRollsKnowledge(-1);
        }
        while (character.getRollsCombat() != 0) {
            dbTableInteract(character, conn, "striderdrabbningar", randomNumber(100));
            character.changeRollsCombat(-1);
        }
        while (character.getRollsIntrigue() != 0) {
            dbTableInteract(character, conn, "intrigerillgarningar", randomNumber(100));
            character.changeRollsIntrigue(-1);
        }
    }

        public static void dbTableInteract (Character character, Connection conn, String tableName, int id) {
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM "+tableName+" where ID = "+id);
            while (rs.next()){
                switch (tableName){
                    case "arketyp":
                        character.setArchetype(rs.getString("happening"));
                        break;
                    case "folkslag":
                        character.setPeoples(rs.getString("happening"));
                        break;
                    case "miljo":
                        character.setEnvironment(rs.getString("happening"));
                        break;
                    case "bakgrundstabell":
                        character.setBackground(rs.getString("happening"));
                        break;
                    case "kamorian":
                    case "jargier":
                        character.setProvinceTotem(rs.getString("happening"));
                        break;
                    default:
                        if (rs.getString("happening") != null ) {
                            character.getEventArraylist().add(tableName + " " + rs.getInt("ID") + ". " + rs.getString("happening"));
                        }
                        break;
                }
                //Basic Attributes
                character.getBasicAttributeArrayList().get(0).changeDice(rs.getInt("styrkaTMod"));
                character.getBasicAttributeArrayList().get(0).changeMod(rs.getInt("styrkaMod"));
                character.getBasicAttributeArrayList().get(1).changeDice(rs.getInt("talighetTMod"));
                character.getBasicAttributeArrayList().get(1).changeMod(rs.getInt("talighetMod"));
                character.getBasicAttributeArrayList().get(2).changeDice(rs.getInt("rorlighetTMod"));
                character.getBasicAttributeArrayList().get(2).changeMod(rs.getInt("rorlighetMod"));
                character.getBasicAttributeArrayList().get(3).changeDice(rs.getInt("uppfattningTMod"));
                character.getBasicAttributeArrayList().get(3).changeMod(rs.getInt("uppfattningMod"));
                character.getBasicAttributeArrayList().get(4).changeDice(rs.getInt("psykeTMod"));
                character.getBasicAttributeArrayList().get(4).changeMod(rs.getInt("psykeMod"));
                character.getBasicAttributeArrayList().get(5).changeDice(rs.getInt("visdomTMod"));
                character.getBasicAttributeArrayList().get(5).changeMod(rs.getInt("visdomMod"));
                character.getBasicAttributeArrayList().get(6).changeDice(rs.getInt("utstralningTMod"));
                character.getBasicAttributeArrayList().get(6).changeMod(rs.getInt("utstralningMod"));
                character.getBasicAttributeArrayList().get(7).changeDice(rs.getInt("viljaTMod"));
                character.getBasicAttributeArrayList().get(7).changeMod(rs.getInt("viljaMod"));
                //Derived Attributes
                character.getDerivedAttributesArrayList().get(0).changeDice(rs.getInt("forflyttningTMod"));
                character.getDerivedAttributesArrayList().get(0).changeMod(rs.getInt("forflyttningMod"));
                character.getDerivedAttributesArrayList().get(1).changeDice(rs.getInt("reaktionTMod"));
                character.getDerivedAttributesArrayList().get(1).changeMod(rs.getInt("reaktionMod"));
                character.getDerivedAttributesArrayList().get(2).changeDice(rs.getInt("intryckTMod"));
                character.getDerivedAttributesArrayList().get(2).changeMod(rs.getInt("intryckMod"));
                character.getDerivedAttributesArrayList().get(3).changeDice(rs.getInt("vaksamhetTMod"));
                character.getDerivedAttributesArrayList().get(3).changeMod(rs.getInt("vaksamhetMod"));
                character.getDerivedAttributesArrayList().get(4).changeDice(rs.getInt("sjalvkontrollTMod"));
                character.getDerivedAttributesArrayList().get(4).changeMod(rs.getInt("sjalvkontrollMod"));
                character.getDerivedAttributesArrayList().get(5).changeDice(rs.getInt("kroppTMod"));
                character.getDerivedAttributesArrayList().get(5).changeMod(rs.getInt("kroppMod"));
                character.getDerivedAttributesArrayList().get(6).changeMod(rs.getInt("livsKraftMod"));
                character.getDerivedAttributesArrayList().get(7).changeMod(rs.getInt("grundSkadaMod"));
                character.getDerivedAttributesArrayList().get(8).changeMod(rs.getInt("grundPansarMod"));
                //Traits, Expertises, Trades
                if (rs.getString("kannetecken1") != null){
                    character.getTraitSet().add(new Trait(rs.getString("kannetecken1"), rs.getInt("kannetecken1Varde"),0));
                }
                if (rs.getString("kannetecken2") != null){
                    character.getTraitSet().add(new Trait(rs.getString("kannetecken2"), rs.getInt("kannetecken2Varde"),0));
                }
                if (rs.getString("kannetecken3") != null){
                    character.getTraitSet().add(new Trait(rs.getString("kannetecken3"), rs.getInt("kannetecken3Varde"),0));
                }
                character.changeUnitsTraits(rs.getInt("kanneteckenValfri"));
                character.changeUnitsExpertis(rs.getInt("expertiserValfri"));

                if (rs.getString("expertis1") != null){
                    character.getExpertisSet().add(new Expertis(rs.getString("expertis1"), rs.getInt("expertis1Varde"),0));
                }
                if (rs.getString("expertis2") != null){
                    character.getExpertisSet().add(new Expertis(rs.getString("expertis2"), rs.getInt("expertis2Varde"),0));
                }

                //Other
                character.changeEasilyLearned(rs.getInt("lattlarda"));
                if(rs.getString("lattlard1") != null) {
                    character.getEasilyLearnedSet().add(rs.getString("lattlard1"));
                }
                if(rs.getString("lattlard2") != null) {
                    character.getEasilyLearnedSet().add(rs.getString("lattlard2"));
                }
                if(rs.getString("lattlard3") != null) {
                    character.getEasilyLearnedSet().add(rs.getString("lattlard3"));
                }
                if(rs.getString("lattlard4") != null) {
                    character.getEasilyLearnedSet().add(rs.getString("lattlard4"));
                }
                if(rs.getString("svarlard1") != null) {
                    character.getHardLearnedSet().add(rs.getString("svarlard1"));
                }
                if(rs.getString("svarlard2") != null) {
                    character.getHardLearnedSet().add(rs.getString("svarlard2"));
                }

                character.changeUnitTrade(rs.getInt("enhetHantverk"));

                if (rs.getString("hantverk1") != null) {
                    character.getTradeSet().add(new Trade((rs.getString("hantverk1")), rs.getInt("hantverk1Varde"),0));
                }
                if (rs.getString("hantverk2") != null) {
                    character.getTradeSet().add(new Trade((rs.getString("hantverk2")), rs.getInt("hantverk2Varde"),0));
                }
                if (rs.getInt("langd") != 0){
                    character.changeHeight(rs.getInt("langd"));
                }
                if (rs.getInt("vikt") != 0) {
                    character.changeWeight(rs.getInt("vikt"));
                }

                //Jaded
                character.changeJadedViolence(rs.getInt("avtrubbVald"));
                character.changeJadedExposure(rs.getInt("avtrubbUtsatt"));
                character.changeJadedSupernatural(rs.getInt("avtrubbOver"));
                //Skills
                character.changeUnitAgility(rs.getInt("enhetRorelse"));
                character.changeUnitCombat(rs.getInt("enhetStrid"));
                character.changeUnitWild(rs.getInt("enhetVild"));
                character.changeUnitKnowledge(rs.getInt("enhetKunskap"));
                character.changeUnitMysteries(rs.getInt("enhetMystik"));
                character.changeUnitSocial(rs.getInt("enhetSociala"));
                character.changeUnitOther(rs.getInt("enhetOvriga"));
                character.changeUnitLanguage(rs.getInt("enhetSprak"));
                //Languages
                if (rs.getString("sprak1") != null) {
                    character.getLanguageArraylist().add(rs.getString("sprak1"));
                }
                if (rs.getString("sprak2") != null) {
                    character.getLanguageArraylist().add(rs.getString("sprak2"));
                }
                if (rs.getString("skrift1") != null) {
                    character.getWritingArraylist().add(rs.getString("skrift1"));
                }
                if (rs.getString("skrift2") != null) {
                    character.getWritingArraylist().add(rs.getString("skrift2"));
                }

                //Character traits
                if (rs.getString("karaktarsdragSekundar") != null) {
                    character.setSecondaryCharacteristic(rs.getString("karaktarsdragSekundar"));
                }
                //Mysteries
                character.changeMysteries(rs.getInt("mysterier"));

                //Equipment and funds
                if (rs.getString("utrustning1") != null) {
                    character.getEquipmentArraylist().add(rs.getString("utrustning1"));
                }
                if (rs.getString("utrustning2") != null) {
                    character.getEquipmentArraylist().add(rs.getString("utrustning2"));
                }
                character.changeStartingFundsSilver(rs.getInt("startKapitalS"));
                if (rs.getInt("startKapitalTMod") != 0) {
                    character.getStartingFundsArrayList().add(new StartingFunds(rs.getInt("startKapitalTMod"), rs.getInt("startKapitalMod")));
                }

                //Rollcounts
                character.changeRollsExploration(rs.getInt("fardslag"));
                character.changeRollsKnowledge(rs.getInt("kunskapSlag"));
                character.changeRollsCombat(rs.getInt("stridSlag"));
                character.changeRollsIntrigue(rs.getInt("intrigslag"));
                character.changeRandomEventRolls(rs.getInt("valfriBakgrund"));
                character.changeEncumberanceFactor(rs.getInt("belastning"));

                //Special traits text
                if (rs.getString("egenskapstext") != null) {
                    character.getSpecialTraitsArraylist().add(tableName + " " +rs.getInt("ID") + ". " + rs.getString("egenskapsText"));
                }

                specialTable(character, conn, tableName, id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    public  void randomizeAndCalcLengthWeight (Character character, Connection conn){
        if (character.getGender().equals("Man")){
            switch (character.getPeoples()){
                case "Adasier":
                    dbTableInteract(character, conn, "langdmodman", 1);
                    break;
                case "Cirefalier":
                    dbTableInteract(character, conn, "langdmodman", 2);
                    break;
                case "Fedaki":
                    dbTableInteract(character, conn, "langdmodman", 3);
                    break;
                case "Genver":
                    dbTableInteract(character, conn, "langdmodman", 4);
                    break;
                case "Jahann":
                    dbTableInteract(character, conn, "langdmodman", 5);
                    break;
                case "Jargier":
                    dbTableInteract(character, conn, "langdmodman", 6);
                    break;
                case "Kamorian":
                    dbTableInteract(character, conn, "langdmodman", 7);
                    break;
                case "Marnakh-Tirak":
                    dbTableInteract(character, conn, "langdmodman", 8);
                    break;
                case "Pyar-Alv":
                    dbTableInteract(character, conn, "langdmodman", 10);
                    break;
            }
        }
        randomizeLengthWeight();
    }

    public  void randomizeLengthWeight () {
        int randomNumber = randomNumber(2);
        if (randomNumber == 1){
            character.changeHeight(randomNumber(6));
            character.changeWeight(randomNumber(6));
        } else {
            character.changeHeight(-randomNumber(6));
            character.changeWeight(-randomNumber(6));
        }
    }

    public  void generateDerivedAttribute() {
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(0), character.getBasicAttributeArrayList().get(2), character.getBasicAttributeArrayList().get(1));
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(2), character.getBasicAttributeArrayList().get(6), character.getBasicAttributeArrayList().get(5));
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(5), character.getBasicAttributeArrayList().get(0), character.getBasicAttributeArrayList().get(1));
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(1), character.getBasicAttributeArrayList().get(2), character.getBasicAttributeArrayList().get(3));
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(4), character.getBasicAttributeArrayList().get(4), character.getBasicAttributeArrayList().get(7));
        calcDerivedAttribute(character.getDerivedAttributesArrayList().get(3), character.getBasicAttributeArrayList().get(4), character.getBasicAttributeArrayList().get(3));
        calcLifeForce(character.getDerivedAttributesArrayList().get(6), character.getBasicAttributeArrayList().get(1), character.getBasicAttributeArrayList().get(7));
        calcBasicArmor(character.getDerivedAttributesArrayList().get(8), character.getBasicAttributeArrayList().get(0), character.getBasicAttributeArrayList().get(1));
        calcBasicDamage(character.getDerivedAttributesArrayList().get(7), character.getBasicAttributeArrayList().get(0));
    }

    public static void calcDerivedAttribute(DerivedAttributes derivedAttributes, BasicAttribute grund1, BasicAttribute grund2) {
        derivedAttributes.changeDice((grund1.getDice()+grund2.getDice())/2);
        derivedAttributes.changeMod((grund1.getMod() + grund2.getMod())/2);
    }

    public static void alterDerivedAttribute(DerivedAttributes derivedAttributes, BasicAttribute grund1, BasicAttribute grund2) {
        derivedAttributes.setMod(0);
        derivedAttributes.setDice(0);
        derivedAttributes.changeDice((grund1.getDice()+grund2.getDice())/2);
        derivedAttributes.changeMod((grund1.getMod() + grund2.getMod())/2);
    }

    public void calcLifeForce(DerivedAttributes derivedAttributes, BasicAttribute tal, BasicAttribute vil){
        int temp = tal.getDice() + vil.getDice();
        int temp2 = tal.getMod() + vil.getMod();
        BasicAttribute tempGrund = new BasicAttribute("temp");
        tempGrund.changeDice(temp);
        tempGrund.changeMod(temp2);
        tempGrund.reCountValue();
        if (tempGrund.getDice() < 5) {
            derivedAttributes.changeDice(3);
        } else {
            switch (tempGrund.getDice()){
                case 5:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(1);
                    break;
                case 6:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(2);
                    break;
                case 7:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(3);
                    break;
                case 8:
                    derivedAttributes.changeDice(4);

                    break;
                case 9:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(1);
                    break;
                case 10:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(2);
                    break;
                case 11:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(3);
                    break;
                case 12:
                    derivedAttributes.changeDice(5);
                    break;
            }
        }
    }
    public void alterLifeForce (DerivedAttributes derivedAttributes, BasicAttribute tal, BasicAttribute vil) {
        derivedAttributes.setDice(0);
        derivedAttributes.setMod(0);
        int temp = tal.getDice() + vil.getDice();
        int temp2 = tal.getMod() + vil.getMod();
        BasicAttribute tempGrund = new BasicAttribute("temp");
        tempGrund.changeDice(temp);
        tempGrund.changeMod(temp2);
        tempGrund.reCountValue();
        if (tempGrund.getDice() < 5) {
            derivedAttributes.changeDice(3);
        } else {
            switch (tempGrund.getDice()){
                case 5:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(1);
                    break;
                case 6:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(2);
                    break;
                case 7:
                    derivedAttributes.changeDice(3);
                    derivedAttributes.changeMod(3);
                    break;
                case 8:
                    derivedAttributes.changeDice(4);

                    break;
                case 9:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(1);
                    break;
                case 10:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(2);
                    break;
                case 11:
                    derivedAttributes.changeDice(4);
                    derivedAttributes.changeMod(3);
                    break;
                case 12:
                    derivedAttributes.changeDice(5);
                    break;
            }
        }
    }

    public void calcBasicArmor(DerivedAttributes derivedAttributes, BasicAttribute tal, BasicAttribute vil){
        int tempDice = tal.getDice() + vil.getDice();
        int tempMod = tal.getMod() + vil.getMod();
        BasicAttribute tempGrund = new BasicAttribute("tempAttribute");
        tempGrund.changeDice(tempDice);
        tempGrund.changeMod(tempMod);
        tempGrund.reCountValue();
        if (tempGrund.getDice() < 5) {
            derivedAttributes.changeMod(0);
        } else {
            switch (tempGrund.getDice()){
                case 5:

                    derivedAttributes.changeMod(1);
                    break;
                case 6:

                    derivedAttributes.changeMod(2);
                    break;
                case 7:

                    derivedAttributes.changeMod(3);
                    break;
                case 8:
                    derivedAttributes.changeMod(4);

                    break;
                case 9:

                    derivedAttributes.changeMod(5);
                    break;
                case 10:

                    derivedAttributes.changeMod(6);
                    break;
                case 11:

                    derivedAttributes.changeMod(7);
                    break;
                case 12:
                    derivedAttributes.changeMod(8);
                    break;


            }
        }
    }

    public void randomizeGender(){
        int genderNumber = randomNumber(2);
        if (genderNumber == 2){
            character.setGender("Kvinna");
        } else {
            character.setGender("Man");
        }
    }

    public void alterBasicArmor (DerivedAttributes derivedAttributes, BasicAttribute tal, BasicAttribute vil) {
        derivedAttributes.setMod(0);
        int temp = tal.getDice() + vil.getDice();
        int temp2 = tal.getMod() + vil.getMod();
        BasicAttribute tempGrund = new BasicAttribute("temp");
        tempGrund.changeDice(temp);
        tempGrund.changeMod(temp2);
        tempGrund.reCountValue();
        if (tempGrund.getDice() < 5) {
            derivedAttributes.changeMod(0);
        } else {
            switch (tempGrund.getDice()){
                case 5:

                    derivedAttributes.changeMod(1);
                    break;
                case 6:

                    derivedAttributes.changeMod(2);
                    break;
                case 7:

                    derivedAttributes.changeMod(3);
                    break;
                case 8:
                    derivedAttributes.changeMod(4);

                    break;
                case 9:

                    derivedAttributes.changeMod(5);
                    break;
                case 10:

                    derivedAttributes.changeMod(6);
                    break;
                case 11:

                    derivedAttributes.changeMod(7);
                    break;
                case 12:
                    derivedAttributes.changeMod(8);
                    break;


            }
        }
    }

    public void checkBonuses(Character character){
        for (BasicAttribute element: character.getBasicAttributeArrayList()) {
            element.reCountValue();
        }

        for (int i = 0; i < character.getDerivedAttributesArrayList().size()-1; i++) {
            character.getDerivedAttributesArrayList().get(i).reCountValue();
        }

        for (Skill element: character.getAgilitySkillsArraylist()) {
            element.reCountValue();
        }

        for (Skill element: character.getSocialSkillArraylist()) {
            element.reCountValue();
        }

        for (Skill element: character.getMysteriesSkillArraylist()) {
            element.reCountValue();
        }

        for (Skill element: character.getKnowledgeSkillArraylist()) {
            element.reCountValue();
        }

        for (Skill element: character.getWildernessSkillArraylist()) {
            element.reCountValue();
        }

        for (Skill element: character.getCombatSkillArraylist()) {
            element.reCountValue();
        }
    }



    public void populateBonuses (Character character, int bonus) {
        for (int i = 0;i < 3;i++) {
            switch (randomNumber(6)){
                case 1:
                    int random = randomNumber(character.getCombatSkillArraylist().size())-1;
                    if (character.getCombatSkillArraylist().get(random).getMod() + bonus < 4 && character.getCombatSkillArraylist().get(random).getDice() != 0) {
                        character.getCombatSkillArraylist().get(random).changeMod(bonus);
                    }
                    break;
                case 2:
                    int random2 = randomNumber(character.getAgilitySkillsArraylist().size())-1;
                    if (character.getAgilitySkillsArraylist().get(random2).getMod() + bonus < 4 && character.getAgilitySkillsArraylist().get(random2).getDice() != 0) {
                        character.getAgilitySkillsArraylist().get(random2).changeMod(bonus);
                    }
                    break;
                case 3:
                    int random3 = randomNumber(character.getSocialSkillArraylist().size())-1;
                    if (character.getSocialSkillArraylist().get(random3).getMod() + bonus < 4 && character.getSocialSkillArraylist().get(random3).getDice() != 0) {
                        character.getSocialSkillArraylist().get(random3).changeMod(bonus);
                    }
                    break;
                case 4:
                    int random4 = randomNumber(character.getMysteriesSkillArraylist().size())-1;
                    if (character.getMysteriesSkillArraylist().get(random4).getMod() + bonus < 4 && character.getMysteriesSkillArraylist().get(random4).getDice() != 0) {
                        character.getMysteriesSkillArraylist().get(random4).changeMod(bonus);
                    }
                    break;
                case 5:
                    int random5 = randomNumber(character.getKnowledgeSkillArraylist().size())-1;
                    if (character.getKnowledgeSkillArraylist().get(random5).getMod() + bonus < 4 && character.getKnowledgeSkillArraylist().get(random5).getDice() != 0) {
                        character.getKnowledgeSkillArraylist().get(random5).changeMod(bonus);
                    }
                    break;
                case 6:
                    int random6 = randomNumber(character.getWildernessSkillArraylist().size())-1;
                    if (character.getWildernessSkillArraylist().get(random6).getMod() + bonus < 4 && character.getWildernessSkillArraylist().get(random6).getDice() != 0) {
                        character.getWildernessSkillArraylist().get(random6).changeMod(bonus);
                    }
                    break;
            }
        }
    }

    public void calcBasicDamage(DerivedAttributes derivedAttributes, BasicAttribute grund) {
        int temp = (grund.getDice()*4 + grund.getMod())/2;
        while (temp > 3){
            derivedAttributes.changeDice(1);
            temp += -4;
        }
        derivedAttributes.changeDice(1);
        derivedAttributes.changeMod(temp);
    }

    public void alterBasicDamage(DerivedAttributes derivedAttributes, BasicAttribute grund) {
        int temp = (grund.getDice()*4 + grund.getMod())/2;
        derivedAttributes.setDice(0);
        derivedAttributes.setMod(0);
        while (temp > 3){
            derivedAttributes.changeDice(1);
            temp += -4;
        }
        derivedAttributes.changeDice(1);
        derivedAttributes.changeMod(temp);
    }


    public void populateObservableGrund (ArrayList<BasicAttribute> basicAttributeArray, ObservableList<JavaFXTableData> data){
        for (BasicAttribute basicAttribute : basicAttributeArray) {

            data.add(new JavaFXTableData(basicAttribute.getName(), basicAttribute.getDice(), basicAttribute.getMod(), lastID));
            lastID++;
        }
    }

    public void populateObservableHarledd (ArrayList<DerivedAttributes> derivedAttributesArrayList, ObservableList<JavaFXTableData> data) {
        for (DerivedAttributes derivedAttributes : derivedAttributesArrayList) {
            data.add(new JavaFXTableData(derivedAttributes.getName(), derivedAttributes.getDice(), derivedAttributes.getMod(), lastID));
            lastID++;
        }
    }
    public void populateObservableFardighet (ArrayList<Skill> skillArrayList, ObservableList<JavaFXTableData> data){
        for (Skill skill : skillArrayList) {
            data.add(new JavaFXTableData(skill.getName(), skill.getDice(), skill.getMod(), lastID));
            lastID++;
        }
    }



    public  void checkPreset (Character character, Connection conn) {
        if (folkslagText.getText().isEmpty()){
            dbTableInteract(character,conn, "folkslag", randomNumber(12));
        } else {
            switch (folkslagText.getText()){
                case "Adasier":
                    dbTableInteract(character,conn, "folkslag", 1);
                    break;
                case "Cirefalier":
                    dbTableInteract(character,conn, "folkslag", 2);
                    break;
                case "Fedaki":
                    dbTableInteract(character,conn, "folkslag", 3);
                    break;
                case "Genver":
                    dbTableInteract(character,conn, "folkslag", 4);
                    break;
                case "Jahann":
                    dbTableInteract(character,conn, "folkslag", 5);
                    break;
                case "Jargier":
                    dbTableInteract(character,conn, "folkslag", 6);
                    break;
                case "Kamorian":
                    dbTableInteract(character,conn, "folkslag", 7);
                    break;
                case "Marnakh-Tirak":
                    dbTableInteract(character,conn, "folkslag", 8);
                    break;
                case "Missla":
                    dbTableInteract(character,conn, "folkslag", 9);
                    break;
                case "Pyar-Alv":
                    dbTableInteract(character,conn, "folkslag", 10);
                    break;
                case "Taup":
                    dbTableInteract(character,conn, "folkslag", 11);
                    break;
                case "Zolod-Dvärg":
                    dbTableInteract(character,conn, "folkslag", 12);
                    break;

            }
        }

        if (miljoText.getText().isEmpty()){
            dbTableInteract(character,conn, "miljo", randomNumber(7));
        } else {
            switch (miljoText.getText()) {
                case "Hav":
                    dbTableInteract(character,conn, "miljo", 1);
                    break;
                case "Hov":
                    dbTableInteract(character,conn, "miljo", 2);
                    break;
                case "Landsbygd":
                    dbTableInteract(character,conn, "miljo", 3);
                    break;
                case "Lärosäte":
                    dbTableInteract(character,conn, "miljo", 4);
                    break;
                case "Stad":
                    dbTableInteract(character,conn, "miljo", 5);
                    break;
                case "Undre världen":
                    dbTableInteract(character,conn, "miljo", 6);
                    break;
                case "Vildmark":
                    dbTableInteract(character,conn, "miljo", 7);
                    break;
            }
        }

        if (arketypText.getText().isEmpty()){
            dbTableInteract(character,conn, "arketyp", randomNumber(7));
        } else {
            switch (arketypText.getText()) {
                case "Donare":
                    dbTableInteract(character,conn, "arketyp", 1);
                    break;
                case "Krigare":
                    dbTableInteract(character,conn, "arketyp", 2);
                    break;
                case "Ledare":
                    dbTableInteract(character,conn, "arketyp", 3);
                    break;
                case "Lärd":
                    dbTableInteract(character,conn, "arketyp", 4);
                    break;
                case "Mystiker":
                    dbTableInteract(character,conn, "arketyp", 5);
                    break;
                case "Skugga":
                    dbTableInteract(character,conn, "arketyp", 6);
                    break;
                case "Underhållare":
                    dbTableInteract(character,conn, "arketyp", 7);
                    break;
            }
        }

    }

    @FXML
    void ignoreraClicked(ActionEvent event) {
        System.out.println("Ignorera clicked");
        setCurrentSelection(null);
        grundAttributTable.getSelectionModel().clearSelection();
        harleddaAttributTable.getSelectionModel().clearSelection();
        stridsFardigheterTable.getSelectionModel().clearSelection();
        rorelseFardigheterTable.getSelectionModel().clearSelection();
        mystikFardighetTable.getSelectionModel().clearSelection();
        socialFardighetTable.getSelectionModel().clearSelection();
        kunskapsFardighetTable.getSelectionModel().clearSelection();
        vildmarksFardighetTable.getSelectionModel().clearSelection();





    }


    @FXML
    void uppdateraTableClicked(ActionEvent event) {
        JavaFXTableData data = selectionMap.get(currentSelection.getId());
        data.setName(currentSelection.getName());
        data.setDice(currentSelection.getDice());
        data.setMod(currentSelection.getMod());
        data.setId(currentSelection.getId());
        transportDataToKaraktar();
        executeAlterDerivedAttributes();
        clearObservableListsAndSelectionMap();
        clearTableItems();
        lastID = 0;
        populateAndHash();
        setTableItems();
        setCurrentSelection(null);


    }

    public void clearObservableListsAndSelectionMap () {
        gAList.clear();
        hAList.clear();
        fVList.clear();
        fSList.clear();
        fSocList.clear();
        fKList.clear();
        fMList.clear();
        fRList.clear();
        selectionMap.clear();

    }


    private void setCurrentSelection (JavaFXTableData selection) {
        if (selection != null) {
            currentSelection.setId(selection.getId());
            currentSelection.setName(selection.getName());
            currentSelection.setDice(selection.getDice());
            currentSelection.setMod(selection.getMod());
        } else {
            currentSelection.setId(null);
            currentSelection.setName("");
            currentSelection.setDice(0);
            currentSelection.setMod(0);
        }

    }


    public void populateHash (ObservableList<JavaFXTableData> data, HashMap<Integer, JavaFXTableData> selectionMap) {
        for (JavaFXTableData element:data
             ) { selectionMap.put(element.getId(), element);

        }
    }


    
    public void calculateStartKapital (Character character) {
        for (StartingFunds element: character.getStartingFundsArrayList()) {

            while (element.getDice() != 0){
                int temp = randomNumber(6);
                if (temp == 6) {
                    element.changeDice(1);
                } else {
                    character.changeStartingFundsSilver(randomNumber(6) * element.getMod());
                    element.changeDice(-1);

                }

            }


        }
    }

    public void valfriaSpecial (Character character, Connection conn) {
        if (character.getUnitsExpertis() != 0){
            while (character.getUnitsExpertis() > 0){
                dbTableInteract(character,conn, "expertiser", randomNumber(100));
                character.changeUnitsExpertis(-1);
            }
        }

        if (character.getUnitTrade() != 0){
            while (character.getUnitTrade() > 0) {
                dbTableInteract(character,conn, "hantverk", randomNumber(74));
                character.changeUnitTrade(-1);

            }
        }

        if (character.getUnitsTraits() != 0) {
            while (character.getUnitsTraits() > 0){
                dbTableInteract(character,conn, "kannetecken", randomNumber(50));
                character.changeUnitsTraits(-1);
            }
        }


    }



    @FXML
    void uppdateraFaltClicked (ActionEvent event) {

        character.setFirstName(fornamnText.getText());
        character.setSurName(efternamnText.getText());
        character.setReligion(religionText.getText());
        character.setGender(konText.getText());
        character.setHeight(langdText.getValue());
        character.setWeight(viktText.getValue());
        character.setWellbeing(valmaendeSpinner.getValue());
        character.setJadedViolence(avtrubbVSpinner.getValue());
        character.setJadedExposure(avtrubbUSpinner.getValue());
        character.setJadedSupernatural(avtrubbOSpinner.getValue());
        character.setPrimaryCharacteristic(primKarText.getText());
        character.setSecondaryCharacteristic(sekKarText.getText());
        System.out.println(character.toString());
    }

    @FXML
    void printToPdfFull (ActionEvent event) {
        transportDataToKaraktar();
        PdfFullMigration mig = new PdfFullMigration(character);
        mig.exportToPdf();
        alert.setAlertType(Alert.AlertType.INFORMATION);
        StringBuilder temp = new StringBuilder();

        temp.append( "The PDF will be created in your user folder under the folder NPCmaker\n");
        if (character.getSurName() != null) {
            temp.append("PDF name: ").append(character.getFirstName()).append(" ").append(character.getSurName()).append(".pdf");
        } else {
            temp.append("PDF name: ").append(character.getFirstName()).append(".pdf");
        }

        String str = temp.toString();
        alert.setContentText(str);
        alert.show();
    }

    @FXML
    void printToPdfCompact (ActionEvent event) {
        transportDataToKaraktar();
        PdfKompaktMigration mig = new PdfKompaktMigration(character);
        mig.exportToPdf();
        alert.setAlertType(Alert.AlertType.INFORMATION);
        StringBuilder temp = new StringBuilder();

        temp.append( "The PDF will be created in your user folder under the folder NPCmaker\n");
        if (character.getSurName() != null) {
            temp.append("PDF name: ").append(character.getFirstName()).append(" ").append(character.getSurName()).append(".pdf");
        } else {
            temp.append("PDF name: ").append(character.getFirstName()).append(".pdf");
        }

        String str = temp.toString();
        alert.setContentText(str);
        alert.show();
    }

    @FXML
    void printToPdfMedium (ActionEvent event) {
        transportDataToKaraktar();
        PdfMediumMigration mig = new PdfMediumMigration(character);
        mig.exportToPdf();
        alert.setAlertType(Alert.AlertType.INFORMATION);
        StringBuilder temp = new StringBuilder();

        temp.append( "The PDF will be created in your user folder under the folder NPCmaker\n");
        if (character.getSurName() != null) {
            temp.append("PDF name: ").append(character.getFirstName()).append(" ").append(character.getSurName()).append(".pdf");
        } else {
            temp.append("PDF name: ").append(character.getFirstName()).append(".pdf");
        }

        String str = temp.toString();
        alert.setContentText(str);
        alert.show();
    }

    public void transportDataToKaraktar () {
        for (int i = 0; i < fKList.size();i++) {
            character.getKnowledgeSkillArraylist().get(i).setDice(fKList.get(i).getDice());
            character.getKnowledgeSkillArraylist().get(i).setMod(fKList.get(i).getMod());
        }

        for (int i = 0; i < fMList.size();i++) {
            character.getMysteriesSkillArraylist().get(i).setDice(fMList.get(i).getDice());
            character.getMysteriesSkillArraylist().get(i).setMod(fMList.get(i).getMod());
        }

        for (int i = 0; i < fRList.size();i++) {
            character.getAgilitySkillsArraylist().get(i).setDice(fRList.get(i).getDice());
            character.getAgilitySkillsArraylist().get(i).setMod(fRList.get(i).getMod());
        }

        for (int i = 0; i < fSList.size();i++) {
            character.getCombatSkillArraylist().get(i).setDice(fSList.get(i).getDice());
            character.getCombatSkillArraylist().get(i).setMod(fSList.get(i).getMod());
        }

        for (int i = 0; i < fSocList.size();i++) {
            character.getSocialSkillArraylist().get(i).setDice(fSocList.get(i).getDice());
            character.getSocialSkillArraylist().get(i).setMod(fSocList.get(i).getMod());
        }

        for (int i = 0; i < fVList.size();i++) {
            character.getWildernessSkillArraylist().get(i).setDice(fVList.get(i).getDice());
            character.getWildernessSkillArraylist().get(i).setMod(fVList.get(i).getMod());
        }
        for (int i = 0; i < gAList.size();i++) {
            character.getBasicAttributeArrayList().get(i).setDice(gAList.get(i).getDice());
            character.getBasicAttributeArrayList().get(i).setMod(gAList.get(i).getMod());
        }
        for (int i = 0; i < hAList.size();i++) {
            character.getDerivedAttributesArrayList().get(i).setDice(hAList.get(i).getDice());
            character.getDerivedAttributesArrayList().get(i).setMod(hAList.get(i).getMod());
        }
    }

    public void executeAlterDerivedAttributes() {
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(0), character.getBasicAttributeArrayList().get(2), character.getBasicAttributeArrayList().get(1));
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(2), character.getBasicAttributeArrayList().get(6), character.getBasicAttributeArrayList().get(5));
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(5), character.getBasicAttributeArrayList().get(0), character.getBasicAttributeArrayList().get(1));
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(1), character.getBasicAttributeArrayList().get(2), character.getBasicAttributeArrayList().get(3));
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(4), character.getBasicAttributeArrayList().get(4), character.getBasicAttributeArrayList().get(7));
        alterDerivedAttribute(character.getDerivedAttributesArrayList().get(3), character.getBasicAttributeArrayList().get(4), character.getBasicAttributeArrayList().get(3));
        alterLifeForce(character.getDerivedAttributesArrayList().get(6), character.getBasicAttributeArrayList().get(1), character.getBasicAttributeArrayList().get(7));
        alterBasicArmor(character.getDerivedAttributesArrayList().get(8), character.getBasicAttributeArrayList().get(0), character.getBasicAttributeArrayList().get(1));
        alterBasicDamage(character.getDerivedAttributesArrayList().get(7), character.getBasicAttributeArrayList().get(0));
    }



    public void valfriaLattlarda (Connection conn){
        if (character.getEasilyLearned() != 0) {
            while (character.getEasilyLearned() > 0) {
                dbTableInteract(character,conn, "lattlarda", randomNumber(64));
                character.changeEasilyLearned(-1);

            }
        }
    }

    public void populateAndHash() {
        populateObservableGrund(character.getBasicAttributeArrayList(), gAList);
        populateHash(gAList, selectionMap);
        populateObservableHarledd(character.getDerivedAttributesArrayList(), hAList);
        populateHash(hAList, selectionMap);
        populateObservableFardighet(character.getCombatSkillArraylist(),fSList);
        populateHash(fSList, selectionMap);
        populateObservableFardighet(character.getAgilitySkillsArraylist(),fRList);
        populateHash(fRList, selectionMap);
        populateObservableFardighet(character.getMysteriesSkillArraylist(),fMList);
        populateHash(fMList, selectionMap);
        populateObservableFardighet(character.getSocialSkillArraylist(),fSocList);
        populateHash(fSocList, selectionMap);
        populateObservableFardighet(character.getKnowledgeSkillArraylist(),fKList);
        populateHash(fKList, selectionMap);
        populateObservableFardighet(character.getWildernessSkillArraylist(),fVList);
        populateHash(fVList, selectionMap);
    }
    public void clearTableItems() {
        grundAttributTable.getItems().clear();
        harleddaAttributTable.getItems().clear();
        stridsFardigheterTable.getItems().clear();
        rorelseFardigheterTable.getItems().clear();
        mystikFardighetTable.getItems().clear();
        socialFardighetTable.getItems().clear();
        kunskapsFardighetTable.getItems().clear();
        vildmarksFardighetTable.getItems().clear();
    }

    public void setTableItems () {
        grundAttributTable.setItems(gAList);
        grundAttributNamn.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        grundAttributT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        grundAttributMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        harleddaAttributTable.setItems(hAList);
        harleddAttribut.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        harleddT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        harleddMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        stridsFardigheterTable.setItems(fSList);
        sFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        sFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        sFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        rorelseFardigheterTable.setItems(fRList);
        rFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        rFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        rFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        mystikFardighetTable.setItems(fMList);
        mFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        mFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        mFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        socialFardighetTable.setItems(fSocList);
        socFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        socFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        socFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        kunskapsFardighetTable.setItems(fKList);
        kFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        kFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        kFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());

        vildmarksFardighetTable.setItems(fVList);
        vFardighet.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        vFardighetT.setCellValueFactory(rowData -> rowData.getValue().diceProperty());
        vFardighetMod.setCellValueFactory(rowData -> rowData.getValue().modProperty());


    }

    public void dbRandomizeName(String people, String gender, Connection conn){
        if (gender.equals("Kvinna")) {
            switch (people){
                case "Adasier":
                    dbGetName(conn, "namnadasierkvinna", randomNumber(11));
                    break;
                case "Cirefalier":
                    dbGetName(conn, "namncirefalierkvinna", randomNumber(11));
                    break;
                case "Fedaki":
                    dbGetName(conn, "namnfedakikvinna", randomNumber(19));
                    break;
                case "Genver":
                    dbGetName(conn, "namngenverkvinna", randomNumber(15));
                    break;
                case "Jahann":
                    dbGetName(conn, "namnjahannkvinna", randomNumber(15));
                    break;
                case "Jargier":
                    dbGetName(conn, "namnjargierkvinna", randomNumber(20));
                    break;
                case "Kamorian":
                    dbGetName(conn, "namnkamoriankvinna", randomNumber(10));
                    break;
                case "Marnakh-Tirak":
                    dbGetName(conn, "namnmarnakhkvinna", randomNumber(11));
                    break;
                case "Missla":
                    dbGetName(conn, "namnmisslakvinna", randomNumber(15));
                    break;
                case "Pyar-Alv":
                    dbGetName(conn, "namnpyarkvinna", randomNumber(10));
                    break;
                case "Taup":
                    dbGetName(conn, "namntaupkvinna", randomNumber(15));
                    break;
                case "Zolod-Dvärg":
                    dbGetName(conn, "namnzolod", randomNumber(25));
                    break;
            }
        } else {
            switch (people) {
                case "Adasier":
                    dbGetName(conn, "namnadasierman", randomNumber(9));
                    break;
                case "Cirefalier":
                    dbGetName(conn, "namncirefalierman", randomNumber(12));
                    break;
                case "Fedaki":
                    dbGetName(conn, "namnfedakiman", randomNumber(20));
                    break;
                case "Genver":
                    dbGetName(conn, "namngenverman", randomNumber(15));
                    break;
                case "Jahann":
                    dbGetName(conn, "namnjahannman", randomNumber(13));
                    break;
                case "Jargier":
                    dbGetName(conn, "namnjargierman", randomNumber(19));
                    break;
                case "Kamorian":
                    dbGetName(conn, "namnkamorianman", randomNumber(8));
                    break;
                case "Marnakh-Tirak":
                    dbGetName(conn, "namnmarnakhman", randomNumber(10));
                    break;
                case "Missla":
                    dbGetName(conn, "namnmisslaman", randomNumber(13));
                    break;
                case "Pyar-Alv":
                    dbGetName(conn, "namnpyarman", randomNumber(9));
                    break;
                case "Taup":
                    dbGetName(conn, "namntaupman", randomNumber(15));
                    break;
                case "Zolod-Dvärg":
                    dbGetName(conn, "namnzolod", randomNumber(25));
                    break;
            }
        }
    }

    public void dbGetName (Connection conn, String tableName, int id) {
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + " where ID = " + id);
            while (rs.next()) {
                character.setFirstName(rs.getString("Namn"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void initializeData(TransportedData data) {

        if (!data.getPeople().equals("Slumpa")) {
            folkslagText.setText(data.getPeople());
        }

        if (!data.getEnvironment().equals("Slumpa")) {
            miljoText.setText(data.getEnvironment());
        }

        if (!data.getArchetype().equals("Slumpa")) {
            arketypText.setText(data.getArchetype());
        }

        character = new Character();
        DbConnector dbConnector = new DbConnector();
        Connection conn = dbConnector.connect();
        checkPreset(character, conn);
        dbTableInteract(character,conn, "bakgrundstabell", randomNumber(100));
        chooseFreeEventTable(character);
        rollEventTables(character, conn);
        calcFreeChoiceSkill(character);
        checkBonuses(character);
        calcRandomBasicAttribute(character);
        buySkills(character);

        generateDerivedAttribute();



        populateBonuses(character, 1);
        populateBonuses(character, 2);
        populateBonuses(character, 3);

        checkBonuses(character);
        calculateStartKapital(character);
        valfriaSpecial(character, conn);
        valfriaLattlarda(conn);
        randomizeGender();
        dbRandomizeName(character.getPeoples(), character.getGender(), conn);
        randomizeAndCalcLengthWeight(character, conn);

        //Population of fields
        folkslagText.setText(character.getPeoples());
        arketypText.setText(character.getArchetype());
        bakgrundText.setText(character.getBackground());
        miljoText.setText(character.getEnvironment());
        konText.setText(character.getGender());
        fornamnText.setText(character.getFirstName());



        if (character.getSecondaryCharacteristic() != null) {
            sekKarText.setText(character.getSecondaryCharacteristic());
        }

        provTotemText.setText(character.getProvinceTotem());
        langdText.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 225, character.getHeight()));
        viktText.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(40, 120, character.getWeight()));
        valmaendeSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10, character.getWellbeing()));
        avtrubbVSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5, character.getJadedViolence()));
        avtrubbUSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5, character.getJadedExposure()));
        avtrubbOSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5, character.getJadedSupernatural()));

        editMod.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,3,0));
        editTMod.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5,0));

        populateAndHash();

        setTableItems();

        editEgenskap.textProperty().bindBidirectional(currentSelection.nameProperty());
        editMod.getValueFactory().valueProperty().bindBidirectional(currentSelection.modProperty());
        editTMod.getValueFactory().valueProperty().bindBidirectional(currentSelection.diceProperty());

        grundAttributTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        harleddaAttributTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        stridsFardigheterTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        rorelseFardigheterTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        mystikFardighetTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        socialFardighetTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        kunskapsFardighetTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
            setCurrentSelection(newValue);
        });
        vildmarksFardighetTable.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends JavaFXTableData> observable, JavaFXTableData oldValue, JavaFXTableData newValue) -> {
        });

        System.out.println(character.toString());

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
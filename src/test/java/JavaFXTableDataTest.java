import com.npcmaker.characterfiles.Character;
import com.npcmaker.fxmlcontrollers.JavaFXTableData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFXTableDataTest {

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


    @Test public void JavaFXTableDataTest1() {
        JavaFXTableData temp = new JavaFXTableData();

        temp.setName("lars");
        assertEquals("lars", temp.getName());
        assertEquals("lars", temp.nameProperty().getValue());
        temp.setDice(1);
        assertEquals(1, temp.getDice());
        assertEquals(1, temp.diceProperty().getValue());
        temp.setMod(1);
        assertEquals(1, temp.getMod());
        assertEquals(1, temp.diceProperty().getValue());
        temp.setId(1);
        assertEquals(1, temp.getId());
        assertEquals(1, temp.idProperty().getValue());
    }

    @Test public void JavaFXTableDataTest2 () {
        JavaFXTableData temp = new JavaFXTableData("lars", 2, 2, 2);
        assertEquals("lars", temp.getName());
        assertEquals("lars", temp.nameProperty().getValue());
        assertEquals(2, temp.getDice());
        assertEquals(2, temp.diceProperty().getValue());
        assertEquals(2, temp.getMod());
        assertEquals(2, temp.diceProperty().getValue());
        assertEquals(2, temp.getId());
        assertEquals(2, temp.idProperty().getValue());
    }
}


import com.npcmaker.fxmlcontrollers.TransportedData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransportedDataTest {
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

    TransportedData tempData = new TransportedData();


    @Test public void testBackground1 () {
        assertNull(tempData.getPeople());
        assertNull(tempData.getArchetype());
        assertNull(tempData.getEnvironment());
        tempData.setPeople("svensk");
        tempData.setArchetype("tjuv");
        tempData.setEnvironment("kloak");
        assertEquals("svensk", tempData.getPeople());
        assertEquals("tjuv", tempData.getArchetype());
        assertEquals("kloak", tempData.getEnvironment());

    }
}

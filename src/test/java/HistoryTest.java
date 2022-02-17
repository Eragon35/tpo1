import app.Coordinates;
import app.Humanoids;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HistoryTest {
    @Test
    public void captureTest(){
        Humanoids artur = new Humanoids("Artur", 0, 0, 0,false, false);
        artur.capture();
        assertTrue(artur.isCaptured);
    }

    @Test
    public void moveTest(){
        Humanoids artur = new Humanoids("Artur", 0, 0, 0,false, false);
        artur.move(2, 2, 2);
        Coordinates coordinates = new Coordinates(2, 2, 2);
        assertEquals(artur.getCoordinates(), coordinates);
    }
}

import app.Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    Humanoids artur = new Humanoids("Artur", 0, 0, 0,false, false);
    Mice mice = new Mice("Ben", 0, 0,0);
    Door door = new Door();
    Coordinates coordinates = new Coordinates(2, 2, 2);
    CupsForMice cups = new CupsForMice(new Mice("Franky", 0, 0, 0));

    @Test
    public void captureTest(){
        artur.capture();
        assertTrue(artur.isCaptured);
    }

    @Test
    public void hypnotizeTest(){
        mice.hypnotize(artur);
        assertTrue(artur.isHypnotized);
    }

    @Test
    public void isOpenedTest(){
        artur.openTheDoor(door);
        assertTrue(door.getIsOpened());
    }

    @Test
    public void moveHumanoidsTest(){
        artur.move(2, 2, 2);
        assertEquals(artur.getCoordinates(), coordinates);
    }

    @Test
    public void moveCupsForMiceTest(){
        cups.move(2,2,2);
        assertEquals(cups.getCoordinates(), coordinates);
    }

}

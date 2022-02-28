import app.Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    Coordinates coordinates = new Coordinates(2, -2, 2);
    Humanoids artur = new Humanoids("Artur", coordinates, true,false);
    Mice mice = new Mice("Ben", coordinates);
    Door door = new Door();
    CupsForMice cups = new CupsForMice(new Mice("Franky", coordinates));

    @Test
    public void captureTest(){
        artur.capture();
        assertTrue(artur.getIsCaptured());
    }

    @Test
    public void captureExceptionTest(){
        artur.capture();
        Exception exception = assertThrows(Exception.class, () -> artur.capture());
        assertEquals("Error capture", exception.getMessage());
    }

    @Test
    public void hypnotizeTest(){
        mice.hypnotize(artur);
        assertTrue(artur.getIsHypnotized());
    }

    @Test
    public void isOpenedTest(){
        artur.openTheDoor(door);
        assertTrue(door.getIsOpened());
    }

    @Test
    public void openDoorExceptionTest(){
        artur.openTheDoor(door);
        Exception exception = assertThrows(Exception.class, () -> artur.openTheDoor(door));
        assertEquals("Door already open", exception.getMessage());
    }

    @Test
    public void moveHumanoidsTest(){
        artur.move(coordinates);
        assertEquals(artur.getCoordinates(), coordinates);
    }

    @Test
    public void moveCupsForMiceTest(){
        cups.move(coordinates);
        assertEquals(cups.getCoordinates(), coordinates);
    }
}

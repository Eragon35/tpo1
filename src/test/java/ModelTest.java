import app.Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    Coordinates coordinates = new Coordinates(2, -2, 2);
    Coordinates coordinates1 = new Coordinates(0, -3, -5);
    Humanoids artur = new Humanoids("Artur", coordinates,false,false);
    Humanoids trillian = new Humanoids("Trillion", coordinates,false, false);
    Humanoids ford = new Humanoids("Ford", coordinates1,false, false);

    Mice mice = new Mice("Ben", coordinates);
    Door door = new Door();
    CupsForMice cups = new CupsForMice(new Mice("Franky", coordinates));



    @Test
    public void captureExceptionTest(){
        trillian.capture(artur);
        Exception exception = assertThrows(Exception.class, () -> trillian.capture(artur));
        assertEquals("Error capture", exception.getMessage());
    }

    @Test
    public void hypnotizeTest(){
        mice.hypnotize(artur);
        assertTrue(artur.getIsHypnotized());
    }

//    @Test
//    public void isOpenedTest(){
//        artur.openTheDoor(door, );
//        assertTrue(door.getIsOpened());
//    }

    @Test
    public void openDoorExceptionTest(){
        ford.openTheDoor(door,trillian);
        Exception exception = assertThrows(Exception.class, () -> artur.openTheDoor(door,trillian));
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

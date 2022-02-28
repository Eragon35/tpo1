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
    Door door = new Door(new Coordinates(10,20,100));
    CupsForMice cups = new CupsForMice(new Mice("Franky", coordinates));



    @Test
    public void captureExceptionTest(){
        trillian.capture(artur);
        Exception exception = assertThrows(Exception.class, () -> trillian.capture(artur));
        assertEquals("Error capture", exception.getMessage());
    }

    @Test
    public void trillianOpenDoorBeforeCaptureArturTest(){
        Humanoids trillian = new Humanoids("Trillion", coordinates,false, false);

        Exception exception = assertThrows(Exception.class, () -> trillian.move(coordinates1));
        assertEquals("Неправильный порядок истории", exception.getMessage());
    }

    @Test
    public void trillianMoveHypnotizedArturTest(){
        Humanoids artur = new Humanoids("Artur", coordinates,false,true);
        Humanoids trillian = new Humanoids("Trillion", coordinates,false, false);
        trillian.capture(artur);
        Exception exception = assertThrows(Exception.class, () -> trillian.move(coordinates1));
        assertEquals("Артур как труп, его никуда не утащить", exception.getMessage());
    }

    @Test
    public void trillianMoveNotArturTest(){
        Humanoids artur = new Humanoids("Мартин", coordinates,false,false);
        Humanoids trillian = new Humanoids("Жаба", coordinates,false, false);
        trillian.capture(artur);
        Exception exception = assertThrows(Exception.class, () -> trillian.move(coordinates1));
        assertEquals("Жаба взяла какого-то там Мартина, а должна Триллиан Артура", exception.getMessage());
    }

    @Test
    public void FordCantOpenTheDoorWhenTrillianFarTest(){ assertFalse(ford.openTheDoor(door, trillian));}

    @Test
    public void hypnotizeTest(){
        mice.hypnotize(artur);
        assertTrue(artur.getIsHypnotized());
    }


    @Test
    public void moveCupsForMiceTest(){
        cups.move(coordinates);
        assertEquals(cups.getCoordinates(), coordinates);
    }

    @Test
    public void goodStory(){
        Main main = new Main();
        assertTrue(main.story());
    }
}

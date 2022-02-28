package app.Model;

public class Main {
    public boolean story() {
        Coordinates coordinates = new Coordinates(2, -2, 2);
        Coordinates coordinates1 = new Coordinates(0, 0, 0);
        Humanoids artur = new Humanoids("Artur", coordinates,false,false);
        Humanoids trillian = new Humanoids("Trillion", coordinates,false, false);
        Humanoids ford = new Humanoids("Ford", coordinates1,false, false);
        Door door = new Door(coordinates1);

        trillian.capture(artur);
        trillian.move(coordinates1);
        return ford.openTheDoor(door, trillian);
    }
}

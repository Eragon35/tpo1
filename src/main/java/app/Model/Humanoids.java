package app.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;


@Data
public class Humanoids extends Entity {
    private boolean isHypnotized;
    private boolean isCaptured;

    public Humanoids(String name, Coordinates coordinates, boolean isCaptured, boolean isHypnotized) {
        this.name = name;
        this.isHypnotized = isHypnotized;
        this.isCaptured = isCaptured;
        this.coordinates = coordinates;
    }

    @SneakyThrows
    public void capture() {
        if (this.isCaptured) throw new Exception("Error capture");
        else this.isCaptured = true;
    }

    @SneakyThrows
    public void openTheDoor(Door door) {
        if (door.getIsOpened()) throw new Exception("Door already open");
        else door.setIsOpened(true);
    }

    public void move(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public boolean getIsCaptured(){return isCaptured;}
    public boolean getIsHypnotized(){return isHypnotized;}
    public void setIsHypnotized(boolean hypnotized){isHypnotized = hypnotized;}

    public Coordinates getCoordinates(){return coordinates;}
}
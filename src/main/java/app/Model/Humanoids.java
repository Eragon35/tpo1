package app.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

@EqualsAndHashCode(callSuper = true)
@Data
public class Humanoids extends Entity {
    public boolean isHypnotized;
    public boolean isCaptured;

    public Humanoids(String name, int x, int y, int z, boolean isCaptured, boolean isHypnotized) {
        this.isHypnotized = isHypnotized;
        this.isCaptured = isCaptured;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @SneakyThrows
    public void capture() {
        if (this.isCaptured)
            throw new Exception("Error capture");
        else {
            this.isCaptured = true;
            System.out.println("ok");
        }
    }

    public void openTheDoor(Door door) {
        if (door.getIsOpened())
            System.out.println("error");
        else {
            door.setIsOpened(true);
            System.out.println("ok");
        }
    }

    public void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Coordinates getCoordinates() {
        return new Coordinates(this.x, this.y, this.z);
    }
}
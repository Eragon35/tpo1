package app;

import lombok.Data;
import lombok.SneakyThrows;

public class Gomanoids extends Entity {
    public boolean isHypnotized;
    public boolean isCaptured;

    public Gomanoids(String name, int x, int y, int z, boolean isCaptured, boolean isHypnotized) {
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

}
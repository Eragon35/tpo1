package app.Model;

import lombok.Data;

@Data
public class Coordinates {
    int x;
    int y;
    int z;

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

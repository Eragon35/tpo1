package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinates {
    int x;
    int y;
    int z;

    public double distance(Coordinates c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2) + Math.pow(this.z - c.z, 2));
    }
}

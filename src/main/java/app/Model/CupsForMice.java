package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CupsForMice {
    Mice mice;

    public void move (int x, int y, int z){
        mice.x=x;
        mice.y=y;
        mice.z=z;
    }

    public Coordinates getCoordinates() {
        return new Coordinates(this.mice.x, this.mice.y, this.mice.z);
    }
}

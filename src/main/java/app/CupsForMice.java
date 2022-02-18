package app;

import lombok.Data;

@Data
public class CupsForMice {
    Mice mice;

    public CupsForMice(Mice mice) {
        this.mice = mice;
    }

    public Mice move (int x, int y, int z){
        mice.x=x;
        mice.y=y;
        mice.z=z;
        return mice;
    }

    public Coordinates getCoordinates() {
        return new Coordinates(this.mice.x, this.mice.y, this.mice.z);
    }
}

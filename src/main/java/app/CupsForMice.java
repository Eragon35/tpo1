package app;

import lombok.Data;

@Data
public class CupsForMice {

    public Mice move (Mice mice, int x, int y, int z){
        mice.x=x;
        mice.y=y;
        mice.z=z;
        return mice;
    }
}

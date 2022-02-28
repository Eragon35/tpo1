package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CupsForMice {
    Mice mice;

    public void move(Coordinates coordinates) {
        mice.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return mice.coordinates;
    }
}

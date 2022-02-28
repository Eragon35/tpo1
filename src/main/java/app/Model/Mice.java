package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Mice extends Entity {

    public Mice(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates=coordinates;
    }

    public void hypnotize(Humanoids humanoids) {
        if (humanoids.getIsHypnotized())
            System.out.println("error");
        else {
            humanoids.setIsHypnotized(true);
            System.out.println("ok");
        }
    }

    public Coordinates getCoordinates(){return coordinates;}
}

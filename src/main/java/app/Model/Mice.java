package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Mice extends Entity {

    public Mice(String name, int x, int y, int z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void hypnotize (Humanoids humanoids){
    if(humanoids.isHypnotized)
        System.out.println("error");
    else{
        humanoids.isHypnotized=true;
        System.out.println("ok");
    }
    }
}

package app;

import lombok.Data;

@Data
public class Mice extends Entity {

    public void hypnotize (Gomanoids gomanoids){
    if(gomanoids.isHypnotized)
        System.out.println("error");
    else{
        gomanoids.isHypnotized=true;
        System.out.println("ok");
    }
    }
}

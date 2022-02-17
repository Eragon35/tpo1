package app;

import lombok.Data;

@Data
public class Mice extends Entity {

    public void hypnotize (Humanoids humanoids){
    if(humanoids.isHypnotized)
        System.out.println("error");
    else{
        humanoids.isHypnotized=true;
        System.out.println("ok");
    }
    }
}

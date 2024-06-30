package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal {

    //@Autowired
    //GoodKamali  kamali; //Property Injection
    GoodKamali kamali;

    @Autowired
    public Kamal(GoodKamali k) { //Constructor Injection
        System.out.println("Kamal is in the context");
        this.kamali = k;
    }

    public void chattingWithKamali() {
        kamali.chat();
    }
}
package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal {

    @Autowired
    GoodKamali  kamali; //Property Injection

    public Kamal() {

        System.out.println("Kamal is in the context");

    }

    public void chattingWithKamali() {

        kamali.chat();
    }
}
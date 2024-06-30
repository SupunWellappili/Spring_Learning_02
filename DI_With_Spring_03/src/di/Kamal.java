package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal implements DI {

    //@Autowired
    //GoodKamali  kamali; //Property Injection
    GoodKamali kamali;

    /*@Autowired
    public Kamal(GoodKamali k) { //Constructor Injection
        System.out.println("Kamal is in the context");
        this.kamali = k;
    }*/

   /* @Autowired
    public void setKamali(GoodKamali k){ //Setter Method Injection
        System.out.println("Kamal is in the context");
        this.kamali=k;
    }*/

    public void chattingWithKamali() {
        kamali.chat();
    }

    @Override
    @Autowired
    public void inject(GoodKamali kamali) {
        System.out.println("Kamal is in the context");
        this.kamali =kamali;
    }
}
package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    //Girl girl = new Girl();//Property Injection


    //Constructor Injection
    Girl girl;
    /*public Boy(Girl g) {
        this.girl=g;
    }*/

    //Setter Method Injection
    public void setGirl(Girl g){
        this.girl=g;
    }

    public void chattingWithGirl() {
        girl.chat();
    }
}

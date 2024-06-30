package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
   // Girl girl;
    GoodGirl girl = new Girl();

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl() {
        //Girl girl = new Girl();
        //GoodGirl girl1 = new Girl();
        girl.chat();
    }
}

package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl() {
        Girl girl = new Girl();
        girl.chat();
    }
}

package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    Girl girl = new Girl();

    public void chattingWithGirl() {
        girl.chat();
    }
}

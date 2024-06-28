package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public void chattingWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}

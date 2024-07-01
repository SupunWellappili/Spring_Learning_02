package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean instantiated");
    }
}

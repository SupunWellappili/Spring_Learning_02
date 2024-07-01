package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {



    public SpringBean(@Value("C001") String id) {
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
    }
}

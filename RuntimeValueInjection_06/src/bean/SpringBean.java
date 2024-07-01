package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean(@Value("C-001") String id, @Value("20") int age, @Value("true") boolean marred) {
        System.out.println(id);
        System.out.println(age);
        System.out.println(marred);
    }

    @Autowired
    public SpringBean(@Value("S-001,Supun,Galle,15000") String[] Details, @Value("A") char a) {
        for (String Detail : Details) {
            System.out.println(Detail);
        }
        System.out.println(a);
    }
}

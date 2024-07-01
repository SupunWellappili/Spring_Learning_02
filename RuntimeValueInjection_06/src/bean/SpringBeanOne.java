package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    @Value("C-001")
    private String id;

    @Value("Supun")
    private String name;

    @Value("Galle")
    private String address;

    @Value("1250.67")
    private double salary;



    public SpringBeanOne() {
        System.out.println("/////////////");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);

    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("========");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}

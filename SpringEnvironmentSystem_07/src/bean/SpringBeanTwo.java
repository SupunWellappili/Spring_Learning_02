package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements InitializingBean {

    @Value("${Account.Number}")
    int AccountNumber;

    @Value("${Account.Type}")
    String AccountType;

    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AccountNumber -: "+AccountNumber);
        System.out.println("AccountType -: "+AccountType);
    }
}

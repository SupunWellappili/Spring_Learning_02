package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    //Property Placeholder --> ${}
    @Value("${os.name}")
    private String osName;

    public SpringBeanOne() {
        System.out.println("Spring bean One Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
    }
}

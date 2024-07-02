package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    //Property Placeholder --> ${}
    @Value("${os.namee},${os.name}")
    private String osName;

    @Value("${ijse.application.db}")
    private String projectName;

    public SpringBeanOne() {
        System.out.println("Spring bean One Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(projectName);
    }
}

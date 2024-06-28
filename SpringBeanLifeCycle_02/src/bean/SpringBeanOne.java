package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne implements DisposableBean {
    public SpringBeanOne() {
        System.out.println("Spring Bean One");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean one Destroy");
    }
}

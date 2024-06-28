package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.naming.spi.InitialContextFactory;
import javax.security.auth.Destroyable;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    //02
    //private String id;

    //01
    public SpringBeanOne() {
        System.out.println("Spring Bean One Initiantiated");
    }

    @Override
    //03
    public void setBeanName(String name) {
        System.out.println("Bean name aware called");
    }

    @Override
    //04
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory aware called");
    }

    @Override
    //05
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context aware called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean called");
    }
}

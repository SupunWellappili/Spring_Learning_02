package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class GirlTwo implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public GirlTwo() {
        System.out.println("Girl-02 Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("02-Chatting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl2 Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl2 Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl2 Application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl2 Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl2 Destroy");
    }
}



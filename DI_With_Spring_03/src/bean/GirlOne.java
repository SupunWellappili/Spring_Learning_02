package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GirlOne implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public GirlOne() {
        System.out.println("Girl-01 Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("1Chatting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl1 Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl1 Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl1 Application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl1 Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl1 Destroy");
    }
}

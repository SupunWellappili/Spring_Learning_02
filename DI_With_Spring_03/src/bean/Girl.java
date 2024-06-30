package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import java.util.Hashtable;

@Component
public class Girl implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Girl() {
        System.out.println("Girl Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Chatting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl Application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl Destroy");
    }
}

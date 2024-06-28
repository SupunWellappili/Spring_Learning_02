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
public class Girl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Girl() {
        System.out.println("Girl Instantiated");
    }

    public void chat() {
        System.out.println("Chatting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl Bean name aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl Bean Factory aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl Application Context aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl Initializing  aware");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Girl  destroy aware");

    }
}

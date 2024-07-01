package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.naming.spi.InitialContextFactory;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection factor aware ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection name aware ");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection disposable ");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection initializer");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection Application context aware ");

    }
}

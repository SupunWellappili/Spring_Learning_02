package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    MyConnection connection;

    public void setMyConnection(MyConnection connection) {
        this.connection = connection;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My basic data source  ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My basic data source bean name");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My basic data source disposable");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My basic data source initializer");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My basic data source Application Context");

    }
}

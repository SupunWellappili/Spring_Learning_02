package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Two Name");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Two Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean Two Application Context");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Two initializing aware");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Two Disposable");
    }
}

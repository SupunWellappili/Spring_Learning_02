package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean One Name");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean one Bean Factory aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean one Application Context aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean one initializing Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean one Disposable");
    }
}

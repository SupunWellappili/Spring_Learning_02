package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Bean
    public MyBasicDataSource myBasicDataSource() {

        /*MyConnection myConnection1 = new MyConnection();
        MyConnection myConnection2 = new MyConnection();
        MyConnection myConnection3 = new MyConnection();

        System.out.println("inter bean : " + myConnection1);
        System.out.println("inter bean : " + myConnection2);
        System.out.println("inter bean : " + myConnection3);*/

        //--------------------------------------------------------

        //Inter Bean Dependency Invocation
        MyConnection myConnection1 = myConnection(); //Application Context Object (Include DI,...etc)
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        System.out.println("inter bean : " + myConnection1);
        System.out.println("inter bean : " + myConnection2);
        System.out.println("inter bean : " + myConnection3);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);
        // return new MyBasicDataSource();
        return myBasicDataSource;
    }

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }

    public SpringBean() {
        System.out.println("Spring Bean instantiated");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean name aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Disposable");
    }
}

package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Autowired
    @Qualifier("girlOne")
    //Girl girl;
    //GoodGirl girl = new Girl();
    GoodGirl girl;


    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl() {
        //Girl girl = new Girl();
        //GoodGirl girl1 = new Girl();
        girl.chat();
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Boy Bean Name");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy Bean Factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy Application Context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Boy Initializing");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Boy Destroy");

    }

}

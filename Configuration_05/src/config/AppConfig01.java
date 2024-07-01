package config;

import bean.SpringBeanOne;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig01 {

    @Bean
    public SpringBeanTwo springTwo(){
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree springBeanThree(){
        return new SpringBeanThree();
    }
}

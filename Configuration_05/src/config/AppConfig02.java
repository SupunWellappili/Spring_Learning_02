package config;

import bean.SpringBeanFive;
import bean.SpringBeanFour;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig02 {

    @Bean
    public SpringBeanFour springBeanFour(){
        return new SpringBeanFour();
    }


    @Bean
    public SpringBeanFive springBeanFive(){
        return new SpringBeanFive();
    }
}

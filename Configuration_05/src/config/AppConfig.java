package config;

import bean.SpringBeanFive;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig01.class,AppConfig02.class})
@ImportResource("classpath : abcd.xml") //Class path
@ImportResource("file : absolute-path-of-abcd.xml") //Root Path (Machine / Server / Another PC)
public class AppConfig {

}


package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig01.class,AppConfig02.class})
public class AppConfig {

}


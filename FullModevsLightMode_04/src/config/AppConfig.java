package config;


import bean.MyBasicDataSource;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {


    @Bean
    public MyBasicDataSource myBasicDataSource() {
        //  MyConnection myConnection = new MyConnection();
        //  MyConnection myConnection = myConnection();

        //Inter Bean Dependency Invocation
        MyConnection myConnection1 = myConnection();
        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);
        // return new MyBasicDataSource();
        return myBasicDataSource;
    }


    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}

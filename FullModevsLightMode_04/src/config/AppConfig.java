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
        //  MyConnection myConnection = new MyConnection(); //My Create Object
        //  MyConnection myConnection = myConnection();

        //Inter Bean Dependency Invocation
        MyConnection myConnection1 = myConnection(); //Application Context Object (Include DI,...etc)
        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();

        System.out.println("inter bean : "+myConnection1);

        myBasicDataSource.setMyConnection(myConnection1);
        // return new MyBasicDataSource();
        return myBasicDataSource;
    }


    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}

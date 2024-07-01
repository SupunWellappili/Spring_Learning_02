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

        //Inter Bean Dependency Invocation
        //MyConnection myConnection1 = myConnection(); //Application Context Object (Include DI,...etc)
        MyConnection myConnection1 = myConnection();
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


}

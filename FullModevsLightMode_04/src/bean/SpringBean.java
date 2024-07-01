package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean instantiated");
    }


    @Bean
    public MyBasicDataSource myBasicDataSource() {

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

}

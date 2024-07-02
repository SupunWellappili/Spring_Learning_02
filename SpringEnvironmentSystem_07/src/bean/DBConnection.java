package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {
    public DBConnection() {
        System.out.println("DB Connection Instated");
    }

    @Autowired
    Environment environment;

    @Value("${user.db.url}")
    String URL;

    @Value("${user.db.userName}")
    String userName;

    @Value("${user.db.password}")
    String password;

    @Value("${user.db.drivenClassName}")
    String drivenClassName;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(URL);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(drivenClassName);

        System.out.println("---------------------");

        System.out.println(environment);
        String year = environment.getProperty("yearr");
        System.out.println(year);

        System.out.println("---------------------");
    }
}

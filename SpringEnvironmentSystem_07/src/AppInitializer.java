import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        //System.getenv(); -> Access System Environment Variables with java
        Map<String, String> getenv = System.getenv();
        for ( String key:getenv.keySet()) {
            System.out.println(key+" : "+getenv.get(key));
        }


        System.out.println("-----------------------");


        //System.getProperties(); --> Access Predefined properties from Java
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key+" : "+properties.get(key));
        }
    }
}
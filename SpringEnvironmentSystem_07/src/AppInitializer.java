import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        Map<String, String> getenv = System.getenv();
        for ( String key:getenv.keySet()) {
            System.out.println(key+" : "+getenv.get(key));
        }
    }
}

import config.AppConfig;
import config.AppConfig01;
import config.AppConfig02;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //ctx.register(AppConfig02.class);
        //ctx.register(AppConfig01.class);
        ctx.register(AppConfig.class);

        ctx.refresh();
        ctx.registerShutdownHook();

    }}

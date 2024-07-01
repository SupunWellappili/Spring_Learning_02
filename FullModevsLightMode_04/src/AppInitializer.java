import bean.MyBasicDataSource;
import bean.MyConnection;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        //Context Invocation
        MyConnection bean = ctx.getBean(MyConnection.class);
        System.out.println("Context :"+bean);

    }
}

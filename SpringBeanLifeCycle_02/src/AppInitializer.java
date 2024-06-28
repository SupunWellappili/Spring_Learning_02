import bean.MyConnection;
import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*SpringBeanOne ref1 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne ref2 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne ref3 = ctx.getBean(SpringBeanOne.class);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);*/

        MyConnection conn1 = ctx.getBean(MyConnection.class);
        MyConnection conn2 = ctx.getBean(MyConnection.class);
        System.out.println(conn1);
        System.out.println(conn2);

    }
}

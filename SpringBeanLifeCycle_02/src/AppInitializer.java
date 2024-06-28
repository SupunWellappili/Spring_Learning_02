import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        //ctx.registerShutdownHook();

        Object bean1 = ctx.getBean(SpringBeanOne.class);
        Object bean2 = ctx.getBean(SpringBeanOne.class);

        System.out.println(bean1);
        System.out.println(bean2);


    }
}

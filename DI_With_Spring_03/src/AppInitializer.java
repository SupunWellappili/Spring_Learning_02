import bean.Boy;
import config.AppConfig;
import di.Kamal;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Boy boy = ctx.getBean(Boy.class);
        //System.out.println(boy);
        boy.chattingWithGirl();

        /*Kamal k1 = ctx.getBean(Kamal.class);
        k1.chattingWithKamali();*/
    }
}

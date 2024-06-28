package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import java.util.Hashtable;

@Component
public class Girl {
    public Girl() {
        System.out.println("Girl Instantiated");
    }

    public void chat() {
        System.out.println("Chatting");
    }

  }

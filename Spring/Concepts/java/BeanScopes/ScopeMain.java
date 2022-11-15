package BeanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    public static void main(String[] args){
        ApplicationContext factory =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        Home home = factory.getBean("home", Home.class);
        System.out.println(home.hashCode());
        Home home1 = factory.getBean("home", Home.class);
        System.out.println(home1.hashCode());
    }
}

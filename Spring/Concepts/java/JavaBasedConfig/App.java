package JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//We are trying to work with spring Annotations.
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory =
                new AnnotationConfigApplicationContext(AppConfigWithoutBean.class);

        Cricket c = factory.getBean(Cricket.class);
        c.details();
//        System.out.println(c.hashCode());

//        Cricket c1 = factory.getBean(Cricket.class);
//        System.out.println(c1.hashCode());

        // Second Object is created just to check the Bean Scopes  Singleton and Protoype
        //functionalities. Comment out the previous three lines and add Scope("prototype")
        // to the Cricket class.

        Football f = factory.getBean(Football.class);
        f.details();
    }
}

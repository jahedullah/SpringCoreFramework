package SpringBeanLC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Few things to remember. When working with destroy you have to call the AbstractApplication...
//Plus obj.registerShutdownHook();
public class BeanLCTest {

    public static void main(String[] args){
        AbstractApplicationContext beanFactory =
                new ClassPathXmlApplicationContext("blc.xml");

        Shingara shingara = (Shingara) beanFactory.getBean("shingara");
        System.out.println(shingara);
        Somusa somusa = (Somusa) beanFactory.getBean("somusa");
        System.out.println(somusa);
        Sub sub = (Sub) beanFactory.getBean("sub");
        System.out.println(sub);
        beanFactory.registerShutdownHook();
    }
}

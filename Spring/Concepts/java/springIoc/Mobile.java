package springIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args){
        ApplicationContext bean = new ClassPathXmlApplicationContext("springIoc.xml");
        Sim s = bean.getBean("sim",Sim.class);
        s.calling();
    }
}

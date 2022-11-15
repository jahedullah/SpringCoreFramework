package DependencyInjection.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("injection.xml");
        Student s = factory.getBean("student1",Student.class);
        s.displayStudentInfo();
    }
}
package DependencyInjection.SetterGetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args){
        ApplicationContext bean = new ClassPathXmlApplicationContext("injection.xml");
        Student s = bean.getBean("student",Student.class);
        s.displayStudentInfo();
    }
}


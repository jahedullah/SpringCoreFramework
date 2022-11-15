package SpringEventsAdvanced;

import SpringEventsAdvanced.Config.AppConfig;
import SpringEventsAdvanced.Publisher.WellPay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        factory.start();
        WellPay wp = factory.getBean("wellPay",WellPay.class);
        wp.sendMoney("Jahed",213000.98,true);
        factory.stop();

    }
}

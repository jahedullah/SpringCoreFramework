package SpringEvents.main;

import SpringEvents.publishers.NetflixPublisherUpdated;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext factory =
                new AnnotationConfigApplicationContext(AppConfig.class);
        NetflixPublisherUpdated nfp = (NetflixPublisherUpdated) factory.getBean("netflixPublisherUpdated");

        nfp.streamGameOfThrones("004");
        System.out.println();
        nfp.BreakingBad("210");

    }
}

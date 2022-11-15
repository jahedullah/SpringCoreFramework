package SpringEventsAdvanced.Listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {
    @EventListener
    public void onAppEvent(ContextRefreshedEvent event){
        System.out.println("App Refreshed with ContextRefreshEvent");
        System.out.println(event);
    }

    @EventListener
    public void contextStartedEvent(ContextStartedEvent event){
        System.out.println("App started with ContextStartedEvent");
        System.out.println(event);
    }

    @EventListener
    public void ContextStoppedEvent(ContextStoppedEvent event){
        System.out.println("App stopped with ContextStoppedEvent");
        System.out.println(event);
    }
}

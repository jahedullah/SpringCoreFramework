package SpringEventsAdvanced.Listener;

import SpringEventsAdvanced.Events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SendEmailListener {
    @Order(2)
    @EventListener
    public void start(TransactionFailureEvent event){
        System.out.println("Hi, "+event.getName() + ". Sorry for the inconvenience.");
        System.out.println("Your transaction of "+event.getAmount()+" has been failed. \nEmail has been sent to you with details.\n");
    }
}

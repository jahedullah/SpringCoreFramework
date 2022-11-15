package SpringEventsAdvanced.Publisher;

import SpringEventsAdvanced.Events.TransactionFailureEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class WellPay {
    @Autowired
    private ApplicationEventPublisher eventPublisher;
   public void sendMoney(String name , double amount, boolean condition){
       try {
           if (condition) {
               throw new RuntimeException("Yo, Transaction Failed.");
           }

           System.out.println("Hi, " + name);
           System.out.println("Sending amount " + amount + " is succesfull.");
       }
       catch (Exception e){
           eventPublisher.publishEvent(new TransactionFailureEvent(name, amount));
           e.printStackTrace();
       }
   }
}

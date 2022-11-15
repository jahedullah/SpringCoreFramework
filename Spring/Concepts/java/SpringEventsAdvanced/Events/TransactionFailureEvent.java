package SpringEventsAdvanced.Events;

import org.springframework.stereotype.Component;


public class TransactionFailureEvent {

    private String name;
    private double amount;

    public TransactionFailureEvent(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    public String getName(){
        return this.name;
    }

    public double getAmount() {
        return amount;
    }
}

package SpringBeanLC;

import javax.annotation.PreDestroy;

public class Shingara {
    private double price;
    public Shingara(){
        super();
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        System.out.println("Shingara Price has been set.");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shingara [Price = "+ price + " ]";
    }
    public void init(){
        System.out.println("Shingara Initialized.");
    }
    public void destroy(){
        System.out.println("Shingara Destroyed.");
    }
}

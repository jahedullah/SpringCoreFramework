package SpringBeanLC;

public class Somusa {
    private double price;
    public Somusa(){
    }
    public void setPrice(double price) {
        System.out.println("Somusa Price has been set.");
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Somusa [Price = " + price +" ]";
    }
    public void init(){System.out.println("Somusa has been initialized");
    }
    public void destroy(){System.out.println("Somusa has been destroyed");
    }
}

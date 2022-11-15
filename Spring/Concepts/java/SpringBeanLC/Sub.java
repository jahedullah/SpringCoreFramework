package SpringBeanLC;
public class Sub {
    private double price;
    public Sub(){
    }
    public void setPrice(double price) {
        System.out.println("Sub price has been set.");
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Sub [Price = " + price + " ]";
    }
    public void init(){System.out.println("Sub has been initialized");
    }
    public void destroy(){
        System.out.println("Sub has been destroyed");
    }
}

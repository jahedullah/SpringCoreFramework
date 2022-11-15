package JavaBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Cricket implements Game{
    @Autowired
    @Qualifier("italy") //Or you can give @Primary at the begining of class of Usa/Italy.
    Manufacturer manuf;

    public void setManufacturer(Manufacturer manuf) {
        this.manuf = manuf;
    }

    public Manufacturer getManufacturer() {
        return manuf;
    }

    public String name(){
        return "Cricket.";
    }
    public String member(){
        return "Total member 11.";
    }
    public String origin(){
        return "Origin : England.";
    }
   public void details(){
        System.out.println(name() + " " + member()+ " " + origin());
        manuf.company();
    }
}

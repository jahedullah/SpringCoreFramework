package JavaBasedConfig;

import org.springframework.stereotype.Component;

@Component
public class Football implements Game{
    public String name(){
        return "Football.";
    }
    public String member(){
        return "Total member 11.";
    }
    public String origin(){
        return "Origin : Britain.";
    }
    public void details() {
        System.out.println(name() + " " + member()+ " " + origin());
    }
}

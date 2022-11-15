package JavaBasedConfig;
import org.springframework.stereotype.Component;

@Component
public class Italy implements Manufacturer{
    public void company() {
        System.out.println("Done By Italy");
    }
}

package JavaBasedConfig;

import org.springframework.stereotype.Component;

@Component

public class Usa implements Manufacturer {

    public void company() {
        System.out.println("Done by USA");
    }
}

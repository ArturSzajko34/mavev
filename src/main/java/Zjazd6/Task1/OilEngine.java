package Zjazd6.Task1;

import org.springframework.stereotype.Component;

@Component("oile")
public class OilEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("OilEngine");
    }
}

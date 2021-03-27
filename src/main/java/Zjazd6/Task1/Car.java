package Zjazd6.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;

    @Autowired
    public Car(@Qualifier("oile") Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.startEngine();
    }
}

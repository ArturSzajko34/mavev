package Task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;
    private final AutoPilot autoPilot;


    @Autowired
    public Car(Engine engine, AutoPilot autoPilot) {
        System.out.println("Car" + getClass().getSimpleName());
        this.engine = engine;
        this.autoPilot = autoPilot;
    }

    public void drive(){
        engine.start();
        autoPilot.driveAuto();
    }
}

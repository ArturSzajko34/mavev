package Zjazd5.Task5;

import org.springframework.stereotype.Component;

@Component
public class AutoPilot {

    public AutoPilot() {
        System.out.println("AutoPilot " + getClass().getSimpleName());
    }

    public void driveAuto(){
        System.out.println("Car drive in auto pilot");
    }
}

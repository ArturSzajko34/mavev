package Zjazd5.Task5;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public Engine() {
        System.out.println("Engine " + getClass().getSimpleName());
    }

    public void start(){
        System.out.println("start engine");
    }
}

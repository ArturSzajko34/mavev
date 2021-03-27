package Zjazd6.Task1;

import org.springframework.stereotype.Component;

@Component("elektryk")
public class ElectricEngine implements Engine{

    @Override
    public void startEngine() {
        System.out.println("ElectricEngine");
    }
}

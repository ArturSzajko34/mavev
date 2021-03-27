package Zjazd6.Task2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pies")
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }
}

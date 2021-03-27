package Zjazd6.Task2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("kot")
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat Eat");
    }
}

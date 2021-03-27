package Zjazd6.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maine {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Zjazd6/Task1");
        context.refresh();

        Car beanCar = context.getBean("car", Car.class);
        beanCar.startEngine();
    }
}

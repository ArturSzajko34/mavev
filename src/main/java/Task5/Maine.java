package Task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maine {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Task5");
        context.refresh();

        Car beanCar = context.getBean("car", Car.class);
        beanCar.drive();

    }
}

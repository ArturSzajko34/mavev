package Zjazd6.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maine {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Zjazd6/Task2");
        context.refresh();

        AnimalService beanAnimalService = context.getBean("animalService", AnimalService.class);
        beanAnimalService.eat();
    }
}

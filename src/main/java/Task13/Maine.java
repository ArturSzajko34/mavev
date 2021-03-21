package Task13;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Maine {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Task13");
        context.refresh();

        CarRentService carRentService = context.getBean("carRentService", CarRentService.class);
        List<Car> car = carRentService.getCar("Dacia", "Duster", 2020);
        carRentService.rentCar("Artur",car.get(0).getIdCar());

    }
}

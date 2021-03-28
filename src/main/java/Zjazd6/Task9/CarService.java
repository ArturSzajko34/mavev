package Zjazd6.Task9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


@Service
public class CarService {

    private int index;
    private final List<Car> cars = new ArrayList<>();


    public CarService() {
        cars.add(new Car("Dacia", "Duster", 3500));
        cars.add(new Car("Ford", "Focus", 3500));
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(int index){
        return cars.get(index);
    }


    public Car getMax() {
        Car carsMin = cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .get();
        return carsMin;
    }

    public Car getMin() {
        Car carMax = cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .get();
        return carMax;
    }

}

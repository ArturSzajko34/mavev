package Zjazd6.Task9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class CarService {

    private int index;
    private final List<Car> cars = new ArrayList<>();


    public CarService() {
        cars.add(new Car("Dacia", "Duster", 3500));
        cars.add(new Car("Ford", "Focus", 5000));
        cars.add(new Car("Honda", "Civic", 10000));
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(int index){
        return cars.get(index);
    }


    public List<Car> getCarForMinMaxPrice (Integer minPrice, Integer maxPrice) {
     return cars.stream()
             .filter(car -> minPrice == null || car.getPrice() > minPrice)
             .filter(car -> minPrice == null || car.getPrice() < maxPrice)
             .collect(Collectors.toList());
    }
}

package Zjazd7.Task16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> carList = new ArrayList<>();

    @Autowired
    public CarService() {

        carList.add(new Car("Ford", "Focus", 100000));
        carList.add(new Car("Dacia", "Duster", 65000));
    }

    public Car getCar(int index) {
        return carList.get(index);
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList(Integer minPrice,Integer maxPrice) {
        return carList.stream()
                .filter(car -> minPrice==null || car.getPrice() >= minPrice)
                .filter(car -> maxPrice== null || car.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public Car deleteCar(int index){
        return carList.remove(index);
    }
}

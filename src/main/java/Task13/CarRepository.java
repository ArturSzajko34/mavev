package Task13;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarRepository {


    private final List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Dacia", "Duster",2020));
        cars.add(new Car("Ford","Focus",2000));
    }

    public List<Car> getCarList(){
        return cars;
    }

}

package RestApi;

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

        carList.add(new Car("Ford", "Focus", 10000));
    }

    public Car deleteCar(int index){
        return carList.remove(index);
    }


    public Car getCar(int index) {
        return carList.get(index);
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
}

package Task13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<Car> findCarsList(String brand, String model, int year) {
        return carRepository.getCarList().stream()
                .filter(car -> model == null || car.getBrand().equals(brand))
                .filter(car -> brand == null || car.getModel().equals(model))
                .filter(car -> year == 0 || car.getProductYear() == year)
                .collect(Collectors.toList());
    }


    public Optional<Car> getCarInId(int idCar) {
        return carRepository.getCarList().stream()
                .filter(car -> car.getIdCar() == idCar)
                .findFirst();
    }
}

package Zjazd7.Task16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public List<Car> getCars(@RequestParam(name = "minPrice", required = false) Integer minPrice,
                             @RequestParam(name = "maxPrice", required = false) Integer maxPrice) {
        return carService.getCarList(minPrice,maxPrice);
    }

    @GetMapping("/cars/{index}")
    public Car getCar(@PathVariable(value = "index") int index) {
        return carService.getCar(index);
    }

    @PostMapping("/car")
    public ResponseEntity addCar(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/car/{index}")
    public Car deleteCarForIndex(@PathVariable(value = "index") int index){
       return carService.deleteCar(index);
    }
}

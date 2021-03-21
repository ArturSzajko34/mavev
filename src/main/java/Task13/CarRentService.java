package Task13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarRentService {

    private final CarService carService;
    private final UserService userService;


    @Autowired
    public CarRentService(CarService carService, UserService userService) {
        this.carService = carService;
        this.userService = userService;
    }


    public List<Car> getCar(String brand, String model, int year){
        return carService.findCarsList(brand,model,year);
    }


    public void rentCar(String name,int idCar){
        Optional<User> userOptional = userService.getUserByName(name);
        if(userOptional.isEmpty()){
            System.out.println("User does not exist");
            return;
        }
        if(userOptional.get().getAge() < 18 ){
            System.out.println("User is under 18 years of age");
            return;
        }


        Optional<Car> carOptional = carService.getCarInId(idCar);
        if(carOptional.isEmpty()){
            System.out.println("Cars does not exist");
            return;
        }

        System.out.println("Client: " + name + " Ordered: " + idCar);
    }
}

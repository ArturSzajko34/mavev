package Zjazd5.Task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class ShopService {


    private SmartfoneService smartfoneService;
    private UserService userService;

    @Autowired
    public ShopService(SmartfoneService smartfoneService, UserService userService) {
        this.smartfoneService = smartfoneService;
        this.userService = userService;
    }

    public boolean order(String nickName, Brand brand) {

//        Brand brand1 = Brand.valueOf(brand.toUpperCase());
        //Jeśli w argumencie zmienie tym na String to jeszcze trzeba i

        Optional<User> user = userService.getUserByName(nickName);
        Optional<Smartphone> phone = smartfoneService.findSmartPhoneByBrand(brand);


        if (user.isEmpty()) {
            System.out.println("nie istnieje " + nickName);
            return false;
        }

        if (phone.isEmpty()) {
            System.out.println("nie istnieje " + brand);
            return false;

        } else
            System.out.println("Użytkownik " + nickName + " zamówił " + brand);
        return true;
    }
}


package Task11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopService {

    private LoggerService loggerService;
    private SmartfoneService smartfoneService;
    private UserService userService;

    @Autowired
    public ShopService(SmartfoneService smartfoneService, UserService userService, LoggerService loggerService) {
        this.smartfoneService = smartfoneService;
        this.userService = userService;
        this.loggerService = loggerService;
        loggerService.logInfo("ShopService");
    }

    public boolean order(String nickName, Brand brand) {
        loggerService.logInfo("order");

//        Brand brand1 = Brand.valueOf(brand.toUpperCase());
        //Jeśli w argumencie zmienie tym na String to jeszcze trzeba i

        Optional<User> user = userService.getUserByName(nickName);
        Optional<Smartphone> phone = smartfoneService.findSmartPhoneByBrand(brand);


        if (user.isEmpty()) {
            loggerService.logError("ShopService");
            System.out.println("nie istnieje " + nickName);
            return false;
        }

        if (phone.isEmpty()) {
            loggerService.logError("ShopService");
            System.out.println("nie istnieje " + brand);
            return false;

        } else
            System.out.println("Użytkownik " + nickName + " zamówił " + brand);
        return true;
    }
}


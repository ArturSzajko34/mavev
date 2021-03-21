package Task9;


public class Maine {
    public static void main(String[] args) {

        SmartphoneRepository smartphoneRepository = new SmartphoneRepository();
        UserRepository userRepository = new UserRepository();

        SmartfoneService smartfoneService = new SmartfoneService(userRepository, smartphoneRepository);
        UserService userService = new UserService(userRepository,smartphoneRepository);

        ShopService shopService = new ShopService(smartfoneService,userService);
        shopService.order("Artur", Brand.NOKIA);
        shopService.order("Asia", Brand.NOKIA);
    }
}

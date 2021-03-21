package Task10;


public class Maine {
    public static void main(String[] args) {

        LoggerService loggerService = new LoggerService();
        SmartphoneRepository smartphoneRepository = new SmartphoneRepository(loggerService);
        UserRepository userRepository = new UserRepository(loggerService);


        SmartfoneService smartfoneService = new SmartfoneService(loggerService, userRepository, smartphoneRepository);
        UserService userService = new UserService(userRepository,smartphoneRepository,loggerService);

        ShopService shopService = new ShopService(smartfoneService,userService,loggerService);
        shopService.order("Artur", Brand.NOKIA);
        shopService.order("Asia", Brand.NOKIA);
    }
}

package Task10;


import java.util.Optional;

public class SmartfoneService {

    private final LoggerService loggerService;
    private final UserRepository userRepository;
    private final SmartphoneRepository smartphoneRepository;

    public SmartfoneService(LoggerService loggerService, UserRepository userRepository, SmartphoneRepository smartphoneRepository) {
        this.loggerService = loggerService;
        this.userRepository = userRepository;
        this.smartphoneRepository = smartphoneRepository;
        loggerService.logInfo("SmartfoneService");
    }

    public Optional<Smartphone> findSmartPhoneByBrand(Brand brand){
        loggerService.logInfo("findSmartPhoneByBrand");
       return  smartphoneRepository.getSmarthPones().stream().filter(smartphone ->
               smartphone.getBrand().equals(brand))
               .findFirst();
    }

}

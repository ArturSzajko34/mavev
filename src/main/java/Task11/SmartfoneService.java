package Task11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartfoneService {

    private final LoggerService loggerService;
    private final UserRepository userRepository;
    private final SmartphoneRepository smartphoneRepository;

    @Autowired
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

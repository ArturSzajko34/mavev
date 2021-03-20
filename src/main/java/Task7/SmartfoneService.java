package Task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SmartfoneService {

    private final UserRepository userRepository;
    private final SmartphoneRepository smartphoneRepository;

    @Autowired
    public SmartfoneService(UserRepository userRepository, SmartphoneRepository smartphoneRepository) {
        this.userRepository = userRepository;
        this.smartphoneRepository = smartphoneRepository;
    }

    public Optional<Smartphone> findSmartPhoneByBrand(Brand brand){
       return  smartphoneRepository.getSmarthPones().stream().filter(smartphone ->
               smartphone.getBrand().equals(brand))
               .findFirst();
    }

}

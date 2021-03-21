package Task8;


import java.util.Optional;

public class SmartfoneService {

    private final UserRepository userRepository;
    private final SmartphoneRepository smartphoneRepository;

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

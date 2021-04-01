package Zjazd5.Task8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public SmartphoneRepository smartphoneRepository() {
        return new SmartphoneRepository();
    }



    @Bean
    SmartfoneService smartfoneService(UserRepository userRepository, SmartphoneRepository smartphoneRepository){
        return new SmartfoneService(userRepository,smartphoneRepository);
    }

    @Bean
    ShopService shopService(SmartfoneService smartfoneService, UserService userService) {
        return new ShopService(smartfoneService, userService);
    }

    @Bean
     UserService userService(UserRepository userRepository, SmartphoneRepository smartphoneRepository) {
        return new UserService(userRepository,smartphoneRepository);
    }
}


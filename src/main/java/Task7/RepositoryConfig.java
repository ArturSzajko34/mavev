package Task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public SmartphoneRepository smartphoneRepository() {
        return new SmartphoneRepository();
    }

    @Bean
    public SmartfoneService smartfoneService(UserRepository userRepository, SmartphoneRepository smartphoneRepository) {
        return new SmartfoneService(userRepository,smartphoneRepository);
    }

    @Bean
    public UserService userService (UserRepository userRepository, SmartphoneRepository smartphoneRepository){
        return new UserService(userRepository,smartphoneRepository);
    }

    @Bean
    public ShopService shopService(SmartfoneService smartfoneService,UserService userService){
        return new ShopService(smartfoneService,userService);
    }






}

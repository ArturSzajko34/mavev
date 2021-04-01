package Zjazd5.Task7;

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


}

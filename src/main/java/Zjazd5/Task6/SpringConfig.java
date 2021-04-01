package Zjazd5.Task6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public AutoPilot autoPilot() {
        return new AutoPilot();
    }

    @Bean
    Car car(Engine engine, AutoPilot autoPilot) {
        return new Car(engine, autoPilot);
    }

}

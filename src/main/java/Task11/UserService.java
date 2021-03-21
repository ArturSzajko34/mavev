package Task11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    private UserRepository userRepository;
    private SmartphoneRepository smartphoneRepository;
    private LoggerService loggerService;

    @Autowired
    public UserService(UserRepository userRepository, SmartphoneRepository smartphoneRepository, LoggerService loggerService) {
        this.userRepository = userRepository;
        this.smartphoneRepository = smartphoneRepository;
        this.loggerService = loggerService;
        loggerService.logInfo("UserService");
    }

    public Optional<User> getUserByName(String name){
        loggerService.logInfo("getUserByName");
        return  userRepository.getUser().stream().filter(user ->
                user.getNickName().equals(name))
                .findFirst();
    }

}

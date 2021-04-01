package Zjazd5.Task10;

import java.util.Optional;


public class UserService {

    private UserRepository userRepository;
    private SmartphoneRepository smartphoneRepository;
    private LoggerService loggerService;

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

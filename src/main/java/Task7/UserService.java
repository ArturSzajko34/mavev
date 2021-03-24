package Task7;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;

public class UserService {

    private UserRepository userRepository;
    private SmartphoneRepository smartphoneRepository;


    public UserService(UserRepository userRepository, SmartphoneRepository smartphoneRepository) {
        this.userRepository = userRepository;
        this.smartphoneRepository = smartphoneRepository;
    }

    public Optional<User> getUserByName(String name){
        return  userRepository.getUser().stream().filter(user ->
                user.getNickName().equals(name))
                .findFirst();
    }

}

package Task13;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Optional<User> getUserByName(String name){
        return userRepository.getUserList().stream().filter(user ->
                user.getName().equals(name))
                .findFirst();
    }
}

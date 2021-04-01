package Zjazd5.Task11;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {


    public List<User> getUser() {
        List<User> user = new ArrayList<>();
        user.add(new User("Artur"));
        user.add(new User("Sabina"));
        user.add(new User("Aleksander"));

        return user;
    }

}

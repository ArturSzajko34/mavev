package Task11;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {


    public List<User> getUser() {
        List<User> user = new ArrayList<>();
        user.add(new User("Artur"));
        user.add(new User("Sabina"));
        user.add(new User("Aleksander"));

        return user;
    }

}

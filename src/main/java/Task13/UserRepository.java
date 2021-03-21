package Task13;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {


    public List<User> getUserList(){
        List<User> userList =new ArrayList<>();
        userList.add(new User("Artur", 34));
        userList.add(new User("Sabina",30));
        return userList;
    }

}

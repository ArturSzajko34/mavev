package Zjazd5.Task10;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private LoggerService loggerService;

    public UserRepository(LoggerService loggerService) {
        this.loggerService = loggerService;
        loggerService.logInfo("UserRepository");
    }


    public List<User> getUser() {
        List<User> user = new ArrayList<>();
        user.add(new User("Artur"));
        user.add(new User("Sabina"));
        user.add(new User("Aleksander"));

        return user;
    }

}

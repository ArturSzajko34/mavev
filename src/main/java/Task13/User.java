package Task13;

import java.util.Random;


public class User {


    private final String name;
    private final int age;
    private final int id;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = createUserId();
    }

    private int createUserId(){
        Random random = new Random();
        return random.nextInt(100);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}

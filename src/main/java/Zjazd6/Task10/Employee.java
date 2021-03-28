package Zjazd6.Task10;

public class Employee {
    private final Integer id;
    private final String name;
    private final Integer salary;
    private final Integer age;
    private Gender gender;


    public Employee(String name, Integer age, Integer salary,Integer id,Gender gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}

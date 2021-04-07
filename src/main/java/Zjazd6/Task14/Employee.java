package Zjazd6.Task14;

public class Employee {

    private Integer id;

    private String name;

    private Integer salary;

    private Integer age;

    private Gender gender;


    public Employee(Integer id, String name, Integer salary, Integer age, Gender gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

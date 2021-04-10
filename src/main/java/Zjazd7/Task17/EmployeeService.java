package Zjazd7.Task17;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    List<Employee> userList = new ArrayList<>();


    public EmployeeService() {
        userList.add(new Employee(0, "Artur", 5000, 34, Gender.MALE));
        userList.add(new Employee(1, "Sabina", 1000, 30, Gender.FEMALE));

    }

    public List<Employee> findEmployees(Integer minSalary, Gender gender, Integer minAge, Integer maxAge) {
        return userList.stream()
                .filter(employee -> minSalary == null || employee.getSalary() >= minSalary)
                .filter(employee -> gender == null || employee.getGender().equals(gender))
                .filter(employee -> minAge == null || employee.getAge() >= minAge)
                .filter(employee -> maxAge == null || employee.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public Optional<Employee> getEmployeeForId(Integer index) {
        return userList.stream()
                .filter(employee -> index == null || employee.getId().equals(index))
                .findFirst();
    }

    public Employee addEmployee (Employee employee){
         userList.add(employee);
         return employee;
    }
}

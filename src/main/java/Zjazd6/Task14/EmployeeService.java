package Zjazd6.Task14;

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

    public Employee findEmployeeForId (Integer index) {
        return getUserList().stream()
                .filter(employee -> employee.getId().equals(index))
                .findFirst()
                .orElseThrow(()->new EmployeeNotFoundException(index));
    }

    public void addEmployee(Employee newEmployee) {
        Optional<Employee> employeeOptional = getUserList().stream()
                .filter(employee-> employee.getId().equals(newEmployee.getId()))
                .findFirst();

        if(employeeOptional.isPresent()){
            throw new EmployeeAlreadyExistException(newEmployee.getId());
        }
        userList.add(newEmployee);

    }

    public List<Employee> getUserList(){
        return userList;
    }
}

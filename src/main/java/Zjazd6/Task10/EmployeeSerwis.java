package Zjazd6.Task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class EmployeeSerwis {


    private final List<Employee> employeeList = new ArrayList<>();

    @Autowired
    public EmployeeSerwis() {
        employeeList.add(new Employee("Sabina", 30, 2000, 1, Gender.FEMALE));
        employeeList.add(new Employee("Natalia", 1, 5000, 2, Gender.FEMALE));
        employeeList.add(new Employee("Aleksander", 3, 60000, 3, Gender.MALE));

    }

    public List<Employee> getListEmployee(Integer minSalary, Integer minAge, Integer maxAge,Gender gender) {
        return employeeList.stream()
                .filter(employee -> minSalary == null || employee.getSalary() > minSalary)
                .filter(employee -> minAge == null || employee.getAge() >= minAge)
                .filter(employee -> minAge == null || employee.getAge() <= maxAge)
                .filter(employee -> gender == null ||employee.getGender().equals(gender))
                .collect(Collectors.toList());
    }

    public Optional<Employee> getEmployeeInID(Integer idEmployee) {
        return employeeList.stream()
                .filter(employee -> idEmployee == null || employee.getId().equals(idEmployee))
                .findFirst();
    }

//    public Employee getEmploy(Integer id){
//        return employeeList.get(id);
//    }
}

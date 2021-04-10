package Zjazd7.Task17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> employeesList(@RequestParam(name = "gender", required = false) Gender gender,
                                        @RequestParam(name = "minAge", required = false) Integer minAge,
                                        @RequestParam(name = "maxAge", required = false) Integer maxAge,
                                        @RequestParam(name = "minSalary", required = false) Integer minSalary) {
        return employeeService.findEmployees(minSalary, gender, minAge, maxAge);
    }

    @GetMapping("/employee/{index}")
    public ResponseEntity getEmployeeFofId(@PathVariable(name = "index") Integer index) {
        Optional<Employee> employeeForId = employeeService.getEmployeeForId(index);
        if (employeeForId.isPresent()) {
            return ResponseEntity.ok(employeeForId.get());
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/employee")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employee);
    }
}

package Zjazd6.Task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {

    private final EmployeeSerwis employeeSerwis;

    @Autowired
    public EmployeeController(EmployeeSerwis employeeSerwis) {
        this.employeeSerwis = employeeSerwis;
    }


    @GetMapping("/employees")
    public ModelAndView carsList(@RequestParam(name = "minSalary", required = false) Integer minSalary,
                                 @RequestParam(name = "gender", required = false) Gender gender,
                                 @RequestParam(name = "minAge", required = false) Integer minAge,
                                 @RequestParam(name = "maxAge", required = false) Integer maxAge) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Employees");
        modelAndView.addObject("employees", employeeSerwis.getListEmployee(minSalary, minAge, maxAge,gender));
        return modelAndView;
    }

    @GetMapping("/employee/{id}")
    public ModelAndView carForList(@PathVariable(name = "id") int index) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Employee> employee = employeeSerwis.getEmployeeInID(index);
        modelAndView.setViewName("Employee");
        modelAndView.addObject("employee", employeeSerwis.getEmployeeInID(index).get());
        return modelAndView;
    }
}

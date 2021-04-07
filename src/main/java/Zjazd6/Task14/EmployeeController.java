package Zjazd6.Task14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public ModelAndView employeesList(@RequestParam(name = "gender", required = false) Gender gender,
                                      @RequestParam(name = "minAge", required = false) Integer minAge,
                                      @RequestParam(name = "maxAge", required = false) Integer maxAge,
                                      @RequestParam(name = "minSalary", required = false) Integer minSalary) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Employees");
        modelAndView.addObject("employees", employeeService.findEmployees(minAge, gender, maxAge, minSalary));
        return modelAndView;
    }

    @GetMapping("/employee/{index}")
    public ModelAndView getEmployeeFofId(@PathVariable(name = "index") Integer id) throws EmployeeNotFoundException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Employee");
        modelAndView.addObject("employee", employeeService.findEmployeeForId(id));
        return modelAndView;
    }


    @GetMapping("/employee")
    public String employee(Model model) {
        model.addAttribute("employee", new Employee());
        return "EmployeeForm";
    }


    @PostMapping("/employee")
    public String addEmployee(@ModelAttribute Employee employee, Model model)
    {
        employeeService.addEmployee(employee);
        model.addAttribute("employee", employee);
        return "EmployeeResult";
    }
}

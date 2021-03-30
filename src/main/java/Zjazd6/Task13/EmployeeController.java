package Zjazd6.Task13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {

    private  EmployeeService employeeService;

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
        modelAndView.addObject("employees", employeeService.findEmployees(minAge,gender,maxAge,minSalary));
        return modelAndView;
    }

    @GetMapping("/employee/{index}")
    public ModelAndView getEmployeeFofId(@PathVariable(name = "index") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Employee");
        modelAndView.addObject("employee",employeeService.getEmployeeForId(id).get());
        return  modelAndView;
    }



}

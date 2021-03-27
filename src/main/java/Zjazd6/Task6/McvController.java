package Zjazd6.Task6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class McvController {


    @GetMapping("/task6/{name}/{age}")
    public String helloWorld(@PathVariable(name = "name") String name, Model model,
                             @PathVariable(name = "age") int age)
    {
        model.addAttribute("name", name);
        model.addAttribute("age",age);
        return "task6";
    }
}

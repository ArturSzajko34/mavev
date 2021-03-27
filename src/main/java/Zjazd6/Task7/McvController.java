package Zjazd6.Task7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class McvController {


    @GetMapping("/user")
    public String helloWorld(@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "task7";
    }
}

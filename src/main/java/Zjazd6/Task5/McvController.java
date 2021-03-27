package Zjazd6.Task5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class McvController {


    @GetMapping("/task5/{name}")
    public String helloWorld(@PathVariable(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "task5";
    }
}

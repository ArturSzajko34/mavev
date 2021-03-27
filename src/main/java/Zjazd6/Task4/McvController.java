package Zjazd6.Task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class McvController {

    @GetMapping("/Spring")
    public String helloSpring(){
        return "HelloSpring";
    }

    @GetMapping("/World")
    public String helloWorld(){
        return "HelloWorld";
    }
}

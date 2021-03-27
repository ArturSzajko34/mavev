package Zjazd6.Task3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class McvController {

    @GetMapping("/hello/Spring")
    public String helloSpring(){
        return "HelloSpring";
    }

    @GetMapping("/hello/World")
    public String helloWorld(){
        return "HelloWorld";
    }
}

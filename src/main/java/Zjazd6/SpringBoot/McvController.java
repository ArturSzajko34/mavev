package Zjazd6.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class McvController {


    @GetMapping("/helloworld")
    public String helloWorld(){
        return "HelloWorld";
    }
}

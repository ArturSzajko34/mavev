package Zjazd6.Task8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class McvController {


    @GetMapping("/cars/{brand}")
    public String helloWorld(@PathVariable(name = "brand") String brand,
                             @RequestParam(name = "models",required = true) String models,
                             @RequestParam(name = "price",required = false) Integer price, Model model)
    {
        model.addAttribute("brand", brand);
        model.addAttribute("models", models);
        model.addAttribute("price", price);
        return "task8";
    }
}

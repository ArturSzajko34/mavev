package Zjazd6.Task11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmartphoneController {

    private final SmartphoneSerwise smartphoneSerwise;

    @Autowired
    public SmartphoneController(SmartphoneSerwise smartphoneSerwise) {
        this.smartphoneSerwise = smartphoneSerwise;
    }


    @GetMapping("/smartphone/{index}")
    public ModelAndView smartForID(@PathVariable(name = "index") Integer index){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("SmartphoneIndex");
        ModelAndView modelAndView1 = modelAndView.addObject("smartphoneIndex", smartphoneSerwise.getSmartphoneByIndex(index));
        return modelAndView;
    }


    @PostMapping("/smartphone")
    public String addSmartphone(@ModelAttribute Smartphone smartphone, Model model) {
        smartphoneSerwise.addSmartphone(smartphone);
        model.addAttribute("smartphonePost", smartphone);
        return "SmartphoneResult";
    }


}

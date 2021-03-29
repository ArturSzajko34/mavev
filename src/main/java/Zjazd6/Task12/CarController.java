package Zjazd6.Task12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public ModelAndView carsList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Cars");
        modelAndView.addObject("cars", carService.getCarList());
        return modelAndView;
    }


    @GetMapping("/car/{index}")
    public ModelAndView carForList(@PathVariable(name = "index") int index) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Car");
        modelAndView.addObject("car", carService.getCar(index));
        return modelAndView;
    }

    @GetMapping("/car")
    public String car(Model model) {
        model.addAttribute("car", new Car());
        return "CarForm";
    }

    @PostMapping("/car")
    public String addCar(@ModelAttribute Car car, Model model) {
        carService.addCar(car);
        model.addAttribute("car", car);
        return "CarResult";
    }
}

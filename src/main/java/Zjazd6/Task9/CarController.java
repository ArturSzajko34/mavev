package Zjazd6.Task9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ModelAndView carsList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Cars");
        modelAndView.addObject("cars", carService.getCars());
        return modelAndView;
    }


    @GetMapping("/car/{index}")
    public ModelAndView carForList (@PathVariable(name = "index") int index){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Car");
        modelAndView.addObject("car", carService.getCar(index));
        return modelAndView;
    }


    @GetMapping("/carss")
    public ModelAndView carsMaxMin (@RequestParam(name ="minPrice",required = false) Integer minPrice,@RequestParam(name ="maxPrice",required = false) Integer maxPrice){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Cars");
        modelAndView.addObject("cars", carService.getCarForMinMaxPrice(minPrice,maxPrice));
        return modelAndView;
    }
}

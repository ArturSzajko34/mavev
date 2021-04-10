package Zjazd7.Task15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SmartphoneController {

    private final SmartphoneSerwise smartphoneSerwise;

    @Autowired
    public SmartphoneController(SmartphoneSerwise smartphoneSerwise) {
        this.smartphoneSerwise = smartphoneSerwise;
    }


    @GetMapping("/smartphone/{index}")
    public Smartphone getSmartphone(@PathVariable(name = "index") Integer index) {
        return smartphoneSerwise.getSmartphoneByIndex(index);
    }


    @PostMapping("/smartphone")
    public ResponseEntity addSmartphone(@RequestBody Smartphone smartphone) {
        smartphoneSerwise.addSmartphone(smartphone);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/smartphones/")
    public List<Smartphone> findSmartphones(@RequestParam(name = "minPrice", required = false) Integer minPrice,
                                           @RequestParam(name = "maxPrice", required = false) Integer maxPrice,
                                           @RequestParam(name = "brand", required = false) String brand,
                                           @RequestParam(name = "model", required = false) String model)
    {
        return smartphoneSerwise.findSmartphone(minPrice,maxPrice,brand,model);

    }

}

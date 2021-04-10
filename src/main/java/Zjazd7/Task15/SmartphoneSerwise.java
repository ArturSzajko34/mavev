package Zjazd7.Task15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SmartphoneSerwise {

    private final List<Smartphone> smartphonesList = new ArrayList<>();

    @Autowired
    public SmartphoneSerwise() {

        smartphonesList.add(new Smartphone("Nokia", "3310", 15000));
        smartphonesList.add(new Smartphone("HTC", "3333", 20000));
    }

    public Smartphone getSmartphoneByIndex(Integer index) {
        return smartphonesList.get(index);
    }

    public void addSmartphone(Smartphone smartphone) {
        smartphonesList.add(smartphone);
    }

    public List<Smartphone> findSmartphone(Integer minPrice, Integer maxPrice, String brand, String model){
        return smartphonesList.stream()
                .filter(smartphone -> maxPrice == null || smartphone.getPrice() <= maxPrice)
                .filter(smartphone -> minPrice == null || smartphone.getPrice() >= minPrice)
                .filter(smartphone -> brand == null || smartphone.getBrand().equals(brand))
                .filter(smartphone -> model == null || smartphone.getModel().equals(model))
                .collect(Collectors.toList());
    }

}

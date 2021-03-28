package Zjazd6.Task11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmartphoneSerwise {

    private final List<Smartphone> smartphonesList = new ArrayList<>();

    @Autowired
    public SmartphoneSerwise() {
        smartphonesList.add(new Smartphone("Nokia", "3310", 15000));
    }

    public Smartphone getSmartphoneByIndex(Integer index) {
        return smartphonesList.get(index);
    }


    public void addSmartphone(Smartphone smartphone) {
        smartphonesList.add(smartphone);
    }

    public List<Smartphone> getSmartphonesList() {
        return smartphonesList;
    }
}

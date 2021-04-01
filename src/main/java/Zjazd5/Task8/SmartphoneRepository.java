package Zjazd5.Task8;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneRepository {

    public List<Smartphone> getSmarthPones() {
        List<Smartphone> phone = new ArrayList<>();
        phone.add(new Smartphone(Brand.HTC));
        phone.add(new Smartphone(Brand.NOKIA));
        phone.add(new Smartphone(Brand.SIEMENS));

        return phone;
    }
}

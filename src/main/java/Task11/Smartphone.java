package Task11;

import org.springframework.stereotype.Component;


public class Smartphone {

    private Brand brand;

    public Smartphone(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

}

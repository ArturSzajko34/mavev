package Task13;

import java.util.Random;

public class Car {

    private final String brand;

    private final String model;

    private final int productYear;

    private final int idCar;


    public Car(String brand, String model, int productYear) {
        this.brand = brand;
        this.model = model;
        this.productYear = productYear;
        this.idCar = createCarId();
        System.out.println("Car");
    }


    private int createCarId() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductYear() {
        return productYear;
    }

    public int getIdCar() {
        return idCar;
    }

}

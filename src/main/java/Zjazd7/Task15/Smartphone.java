package Zjazd7.Task15;

public class Smartphone {

    private  String brand;

    private  String model;

    private  Integer price;

    public Smartphone() {
    }

    public Smartphone(String brand, String model, Integer price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

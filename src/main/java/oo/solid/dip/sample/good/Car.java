package oo.solid.dip.sample.good;

public class Car implements Vehicle {

    private final String brand;
    private final String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getSpecifications() {
        return String.format("Brand: %s - Model: %s - Year: %s", this.brand, this.model, this.year);
    }
}

package domain;

import java.sql.Timestamp;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int yearOfManufacture;
    public Timestamp lastEmissionCheck;
    public int speed = 0;

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void accelerate(int add) {
        speed += add;
    }

}

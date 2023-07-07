package day3;

import day2.Car;

public class Toyota extends Car {

    static String brand;
    public Toyota(String model, String color, int year) {
        super(brand, model, color, year);
    }

    static {
        brand = "TOYOTA";
    }
}

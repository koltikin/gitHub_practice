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

    public static void main(String[] args) {
        Toyota toyota1 = new Toyota("corolla","black",2023);


        System.out.println("toyota1 = " + toyota1);
        System.out.println(toyota1.getBrand());
    }
}

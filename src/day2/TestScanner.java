package day2;

import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("enter your age: ");
        int age = myScanner.nextInt();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}

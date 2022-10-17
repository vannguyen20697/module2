package Array.ThucHanh;

import java.util.Scanner;

public class Change {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("nhap do F can chuyen sang C");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C can chuyen sang do F");
                    celsius = input.nextInt();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
            }
        }
    }
}
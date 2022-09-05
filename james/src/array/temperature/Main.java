package array.temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit) + " C" );
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit : " +celsiusToFahrenheit(celsius) + " F" );
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }

}

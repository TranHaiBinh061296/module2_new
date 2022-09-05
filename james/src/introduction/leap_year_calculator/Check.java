package introduction.leap_year_calculator;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner ye = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year = ye.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is leap year", year);
                } else {
                    System.out.printf("%d is not leap year", year);
                }
            } else {
                System.out.printf("%d is leap year", year);
            }
        } else {
            System.out.printf("%d is not leap year", year);
        }
    }
}

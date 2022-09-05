package introduction.show_geometries;

import java.util.Scanner;

public class DisPlay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter choice");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    int i = 1;
                    while (i <= 5) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        i++;
                        System.out.println("");
                    }

                    System.out.printf("\n");

                    for (int k = 5; k >= 1; k--) {
                        for (int j = 1; j <= k; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.printf("\n");

                    for (int g = 5; g >= 1; g--) {
                        for (int j = 1; j <= g; ++j) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");

            }
        }
    }
}

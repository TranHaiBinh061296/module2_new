package introduction.linear_equation;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner pt = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = pt.nextDouble();
        System.out.println("Enter b : ");
        double b = pt.nextDouble();
        System.out.println("Enter C : ");
        double c = pt.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}

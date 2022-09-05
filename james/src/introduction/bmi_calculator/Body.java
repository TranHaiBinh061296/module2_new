package introduction.bmi_calculator;

import java.util.Scanner;

public class Body {
    public static void main(String[] args) {
        Scanner body = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight ( in kg) : ");
        weight = body.nextDouble();
        System.out.print("Your height (in meter) : ");
        height = body.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}

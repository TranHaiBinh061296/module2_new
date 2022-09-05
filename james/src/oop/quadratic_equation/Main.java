package oop.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tham số a:");
        double a = input.nextDouble();
        System.out.println("Nhập tham số b:");
        double b = input.nextDouble();
        System.out.println("Nhập tham số c:");
        double c = input.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        if (quadratic.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm : x1 = " + quadratic.getRoot1() + " x2 = " + quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm kép x1 = x2 = " + quadratic.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

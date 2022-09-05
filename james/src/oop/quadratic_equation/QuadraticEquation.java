package oop.quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = b * b - 4 * a * c;
    }

    public double getRoot1() {
        double root1;
        return root1 = ((-b + Math.sqrt(getDiscriminant()))/2*a);
    }
    public double getRoot2() {
        double root2;
        return root2 = ((-b - Math.sqrt(getDiscriminant()))/2*a);
    }
    public double getRoot() {
        double root;
        return root = (-b/2*a);
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
}

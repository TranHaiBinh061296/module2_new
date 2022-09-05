package inheritance.triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return   ((side1 + side2 + side3) *
                (side1 + side2 - side3) *
                (side2 + side3 - side1) *
                (side3 + side1 - side2))/2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Triangle " +
                "side1= " + getSide1() +
                ", side2= " + getSide2() +
                ", side3= " + getSide3() +
                " Triangle area : " + getArea() +
                " Triangle perimeter : " + getPerimeter();
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3.0, 7.5, 9.5);
        System.out.println(triangle);
    }
}

package inheritance.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "đỏ";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính là: "
                + getRadius()
                +  ", màu là màu " + getColor() ;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
    }
}

package access_modifier.modifier_access;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area;
        return area = Math.pow(getRadius(),2)*Math.PI;
    }
    void display() {
        System.out.println("Bán kính: " + getRadius() + " , " + " Diện tích :" + getArea());
    }

}

package abstract_interface.resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle : " +
                " radius= " + radius
                + super.toString()
                + " Area circle : " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius = radius *percent/100;
    }
}

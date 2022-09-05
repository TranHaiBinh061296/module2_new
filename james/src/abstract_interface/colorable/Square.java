package abstract_interface.colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square " +
                "side=" + side +
                ", color='" + color
                +
                ", filled=" + filled
                + "Square area : " + getArea()
                + ", Perimeter : " + getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

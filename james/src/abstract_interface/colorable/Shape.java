package abstract_interface.colorable;

public class Shape {
    protected String color = "pink";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape color = " + color
                +
                ", filled have " + (isFilled() ? "filled" : " not filled");
    }
}

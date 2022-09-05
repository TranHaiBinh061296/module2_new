package abstract_interface.resizeable;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent / 100;
        this.height = this.height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle width=" + width
                +
                ", height=" + height
                + ", Color " + getColor()
                + " , Area : " + getArea();
    }
}

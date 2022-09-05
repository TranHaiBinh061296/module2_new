package abstract_interface.resizeable;

public class Aquare extends Shape {
    private double side;

    public Aquare(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Aquare() {
    }

    public Aquare(double side) {
        this.side = side;
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public void setColor(String color) {
        this.setColor(color);
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
    public String toString() {
        return "Aquare side= " + side
                +" Area square " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double x) {
        this.side =Math.random()*100 + (this.side*x)-1;
    }
}

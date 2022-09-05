package inheritance.circle;

public class Cylinder extends Circle{
    private double height = 3.0;

    public Cylinder() {
    }
    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double high) {
        this.height = high;
    }
    public double getVolumetric() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao là: "
                + getHeight()
                + " à lớp con của "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.9, "xanh", 3.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolumetric());
    }
}

package abstract_interface.colorable;

public class TestShape {
    public static void main(String[] args) {
        // tạo mảng chứa các đối tượng
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3.5,9);
        shapes[2] = new Square(4.6);

        // in ra mảng + diện tích
        System.out.println("Area of elements in array");
        for (Shape shape:shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}

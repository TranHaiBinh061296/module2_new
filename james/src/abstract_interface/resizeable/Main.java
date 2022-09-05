package abstract_interface.resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        //Chưa thay đổi
        Circle circle = new Circle(12);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(3.5,9);
        System.out.println(rectangle);
        Aquare aquare = new Aquare(8.6);
        System.out.println(aquare);
        // khai báo 1 biến random từ 1- 100 để set kích thước
        double percent = Math.floor(Math.random()*100-1);
        //Thay đổi kích thước
        circle.resize(percent);
        shapes [0] = circle;
        rectangle.resize(percent);
        shapes [1] = rectangle;
        aquare.resize(percent);
        shapes[2] =aquare;
        System.out.println("Array after resizing : " + Arrays.toString(shapes));

    }
}

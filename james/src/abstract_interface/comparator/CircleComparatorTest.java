package abstract_interface.comparator;

import inheritance.geometric_object.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle(3.5, "green",false);

        System.out.println("pre-sorted");
        for(Circle circle1: circle) {
            System.out.println(circle1);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);
        System.out.println("After-sorted");
        for (Circle circle1 : circle){
            System.out.println(circle1);
        }
    }
}

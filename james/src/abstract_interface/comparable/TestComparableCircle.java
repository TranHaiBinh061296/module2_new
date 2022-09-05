package abstract_interface.comparable;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(9.5,"red",false);
        System.out.println("pre-sorted : ");
        for (ComparableCircle circle:circles ) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("after-sorted : ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}

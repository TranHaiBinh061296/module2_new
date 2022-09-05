package testfirst_tdd.triangle_tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    @DisplayName(" 2,2,2")
    public void howTriangle_2_2_2() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" 2,2,3")
    public void howTriangle_2_2_3() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" 3,4,5")
    public void howTriangle_3_4_5() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String expected = "right triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("6,5,7")
    public void howTriangle_6_5_7() {
        double side1 = 6;
        double side2 = 5;
        double side3 = 7;
        String expected = "normal triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("-1,2,1")
    public void howTriangle_notTriangle1() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;
        String expected = "not triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("8,2,3")
    public void howTriangle_notTriangle2() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;
        String expected = "not triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("0,1,1")
    public void howTriangle_notTriangle3() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expected = "not triangle";
        String result = TriangleClassifier.Triangle.whatTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}

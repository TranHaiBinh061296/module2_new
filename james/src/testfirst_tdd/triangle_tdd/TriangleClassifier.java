package testfirst_tdd.triangle_tdd;

public class TriangleClassifier {
    public static class Triangle {
        public static String whatTriangle(double side1, double side2, double side3) {
            boolean isTriangle = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1
                    && side1 > 0    && side2 > 0     && side3 > 0;
            boolean isEquilateralTriangle = side1 == side2 && side2 == side3;
            boolean isIsoscelesTriangle = side1 == side2 || side2 == side3 || side1 == side3;
            boolean isRightTriangle =
                    side1 * side1 + side2 * side2 == side3 * side3 ||
                            side2 * side2 + side3 * side3 == side1 * side1 ||
                            side1 * side1 + side3 * side3 == side2 * side2;

            if (!isTriangle) return "not triangle";
            if (isEquilateralTriangle) return "equilateral triangle";
            if (isIsoscelesTriangle) {
                if (isRightTriangle) return "isosceles right triangle";
                else return "isosceles triangle";
            }
            if (isRightTriangle) return "right triangle";
            return "normal triangle";
        }
    }
}

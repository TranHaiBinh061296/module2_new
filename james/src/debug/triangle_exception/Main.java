package debug.triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IllegalTriangleException tre = new IllegalTriangleException();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh a,b,c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Nhập 3 cạnh d,f,e");
        double d = scanner.nextDouble();
        double f = scanner.nextDouble();
        double e = scanner.nextDouble();
//        tre.triangleException(a, b, c);
//        tre.triangleException_double(d, f, e);
    }
}

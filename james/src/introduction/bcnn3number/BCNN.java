package introduction.bcnn3number;

import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, max;

        System.out.println("nhap so a");
        a = scanner.nextInt();
        System.out.println("nhap so b");
        b = scanner.nextInt();
        System.out.println("nhap so c");
        c = scanner.nextInt();

        max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        while (true) {
            if (max % a == 0 && max % b == 0 && max % c == 0) {
                break;
            }
            max++;
        }
        System.out.println("Boi chung nho nhat cua " + a + ", " + b + ", " + c + " la = " + max);
    }
}
package introduction.greate_common_factor;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int a, b;
        int ucln = 1;
        System.out.println("Nhập số a : ");
        a = check.nextInt();
        System.out.println("Nhập số b : ");
        b = check.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
//        if(a == 0 || b == 0) {
//            System.out.println("Không có ước chung lớn nhất : ");
//        }
//        while (a != b ) {
//            if (a > b) {
//                a = a-b;
//            } else {
//                b = b -a;
//            }
//        }
//        System.out.println("ước chung lớn nhất là " + a);
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        System.out.printf("ước chung lớn nhất của %d và %d = %d", a, b, ucln);
    }
}

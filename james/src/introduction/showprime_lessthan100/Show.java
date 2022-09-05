package introduction.showprime_lessthan100;

import java.util.Scanner;

public class Show {
    // kiểm tra phải là số nguyên tố không?
    public static boolean isPriemeNumber(int n) {
        if (n < 2) {
            return false;
        } //nếu căn bậc 2 của n mà chia hết cho i thì n không phải là số nguyên tố
        // vì số nguyên tố chỉ chia hết cho 1 và chính nó
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = input.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn 100 %d : \n " , n);
        if (n >= 2) {
            System.out.println(2);
        } // i += 2 kiem tra cac so le
        for (int i = 3; i <= 100; i += 2) {
            if (isPriemeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}

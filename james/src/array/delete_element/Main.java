package array.delete_element;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {2, 3, 6, 7, 8, 34, 23, 45, 23, 13, 32};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập phần tử cần xóa : ");
//        int input_del = input.nextInt();
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[input_del] == array[i]) {
//                array[i] = 0;
//                index = i;
//            }
//        }
//        for (; index < array.length; index++) {
//            if (index == array.length - 1)
//                array[index] = 0;
//            else
//                array[index] = array[index + 1];
//        }
//        System.out.print("Mảng sau khi xóa : " + array[index + 1] + "\t");
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }

        n = c;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}

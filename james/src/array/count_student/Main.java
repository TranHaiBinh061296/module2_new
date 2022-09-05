package array.count_student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng :");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Nhập quá độ dài cho phép !");
            }
        } while (size > 10);
        array = new int[size];
        int n = 0;
        while (n < array.length) {
            System.out.print(" Nhập điểm cho sinh viên " + (n+1) + ":" );
            array[n] = input.nextInt();
            n++;
        }
        int count = 0;
        System.out.print("Danh sách điểm sinh viên : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] >= 5 && array[i] <= 10 ) {
                count++;
            }
        }
        System.out.print("\n Số lượng sinh viên thi đỗ là : " + count);
    }
}

package array.reverse_array;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        do {
            System.out.println("Enter size arrays");
            size = input.nextInt();
            if (size > 20) {
                System.out.printf("Size does not exceed 20");
            }
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        //In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements is array : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Đảo ngược thứ tự các phần tử trong mảng
        //Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử.
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Reverse array : " , "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"\t");
        }
    }
}

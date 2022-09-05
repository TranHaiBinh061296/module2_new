package algorithm_sort.insertion_sort;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử mảng: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Phần tử đầu vào của bạn là :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n Bắt đầu xử lý sắp xếp...");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i]; // phần tử muốn chèn vào đoạn con
            int pos = i - 1;
            while (pos >= 0 && array[pos] > x) {
                array[pos + 1] = array[pos];
                pos = pos -1;
            }
            array[pos + 1] = x;
        }
        for (int j = 0; j < array.length; j ++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
    }
}

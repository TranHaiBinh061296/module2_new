package algorithm_sort.bubblesort;

import java.util.Scanner;

public class BubbleSortByStep {
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
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Hóan đổi " + list[i] + " với " + list[i + 1]);
                    int tempt = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tempt;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.print("Mảng có thể được sắp xếp và không cần chuyển bước tiếp theo");
                break;
            }
            //danh sách sau khi sắp xếp như thế nào
            System.out.print("Liệt kê sau " + k + " sắp xếp: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

}

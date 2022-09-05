package practice_activities.bubble_sort;

public class Bubble {
    public static void bubbleSort(int a[], int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = n - 1; j > i; j--) {
//                if (a[j] < a[j - 1]) {
//                    int t = a[j];
//                    a[j] = a[j - 1];
//                    a[j - 1] = t;
//                }
//            }
//        }
        for (int i = 0; i < n - 1; i++) { // i nghĩa vụ lấy vị trí phía ngoài
            for (int j = 0; j < n - i -1; j++) { // j nghĩa vụ sắp xếp các phần tử
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {8, 3, 2, 6, 5, -4, -10, 7, 6, 36, 12, 15, 35, 24};
        bubbleSort(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

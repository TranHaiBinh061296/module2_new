package practice_activities.insertion_sort;

public class Insertion {
    public static void insertionSort(int array[], int n) {
        for (int i = 1; i < n; i++) {
            int x = array[i]; // phần tử muốn chèn vào đoạn con
            int pos = i - 1;
            while (pos >= 0 && array[pos] > x) {
                array[pos + 1] = array[pos];
                pos = pos - 1;
            }
            array[pos + 1] = x;
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 6, 2, -5, 9, -20,5,12, 12, 25, 10};
        insertionSort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

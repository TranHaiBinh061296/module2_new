package algorithm_sort.setting_insertion;

public class Insertion {
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int pos = i - 1;
            while (pos >= 0 && array[pos] > x) {
                array[pos + 1] = array[pos];
                pos = pos - 1;
            }
            array[pos + 1] = x;
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 2, 6, 12, -4, 7, 9, 5, 9, 23};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

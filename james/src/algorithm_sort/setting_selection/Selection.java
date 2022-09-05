package algorithm_sort.setting_selection;

public class Selection {
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = array[i];
                array[i] = array[min_index];
                array[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 9, 4, 5, 6, 6, 5, 7, -4, 5};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

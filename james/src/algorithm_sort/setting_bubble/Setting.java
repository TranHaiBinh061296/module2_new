package algorithm_sort.setting_bubble;

public class Setting {
    public static void bubbleSort(int array[]) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) { // array.length - i điều kiện để khi duyệt qua hết ptử kthuc
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int list[] = {5, 2, 3, 12, 9, 7, 3, -3, 23};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}

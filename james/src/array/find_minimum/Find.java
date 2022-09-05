package array.find_minimum;

public class Find {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 12, 3, 21, 44, 2, 12};
        int index = minValue(arr);
        System.out.printf("Số nhỏ nhất trong mảng là : " + arr[index]);
    }
}

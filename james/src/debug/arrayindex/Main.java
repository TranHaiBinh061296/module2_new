package debug.arrayindex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayIndex arrayIndex = new ArrayIndex();
        Integer [] arrs = arrayIndex.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ : ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là "  + arrs[x]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

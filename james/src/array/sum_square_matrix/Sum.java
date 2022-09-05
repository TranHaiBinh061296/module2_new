package array.sum_square_matrix;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng và cột (trùng nhau) :");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array [][] = new int[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random()*(20-5 + 1) + 5);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for(int i = 0 ; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính của mảng là : " + sum);
    }
}

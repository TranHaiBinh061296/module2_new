package array.find_element_biggest_2c;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng ngang và côt :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        System.out.println("Nhập 2 số ngãu nhiên (nhỏ nhất đến lớn nhất)");
        int rd1 = sc.nextInt();
        int rd2 = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (rd2 - rd1 + 1) + rd1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int max = array[0][0];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array[i].length;j++){
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
    }
}

package search.algorithm_aomplexity;

import java.util.Scanner;

public class AlgorithmComplexityText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String inputString = sc.nextLine();

        //Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            //Tìm vị trí tương ứng của ký tự trong bảng ASCII
            int ascii = (int) inputString.charAt(i);
            // Tăng giá trị tần suất
            frequentChar[ascii] += 1;
        }
        //Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;
        char character = (char) 255; /* Ký tự trống*/
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là " + character + " với tần suất là " + max + " lần.");
    }
}

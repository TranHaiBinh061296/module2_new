package array.count_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String khaibao = "xin chao moi nguoi va chuc mot ngay tot lanh";
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Mời nhập:");
        while ((input = sc.nextLine()).length() != 1) {
            System.out.println("Mời nhập lại !");
        }
        char ch = input.charAt(0);
        int count = 0;
        for (int i = 0; i < khaibao.length(); i++) {
            if(ch == khaibao.charAt(i))
                count++;
        }
        System.out.printf("Số lần xuất hiê ký tư %s là: %s", ch, count);
    }

}

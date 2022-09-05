package search.stringmax;

import java.util.LinkedList;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("Nhập chuỗi : ");
        String string = sc.nextLine();
        //Timd chuỗi liên tiếp có độ dài lớn nhất
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()
                    && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i)); //1 câu lệnh
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            //hiển thị chuỗi liên tiếp dài nhất
        }
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();

    }
}

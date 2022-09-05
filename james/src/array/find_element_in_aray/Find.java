package array.find_element_in_aray;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students = {"Hải Bình", "Khanh Hoàng", "Lộc Shawdow", "Hiếu", "Tùng", "Tài", "Hà", "Hướng"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học viên bạn muốn tìm : ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)) {
                System.out.println("Học viên bạn muốn tìm là " + input_name + " ở vị trí " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(input_name + " không có trong danh sách học viên bạn muốn tìm");
        }
    }
}

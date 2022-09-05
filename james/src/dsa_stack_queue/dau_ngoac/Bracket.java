package dsa_stack_queue.dau_ngoac;

import java.util.LinkedList;
import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        //Tạo bStack rỗng
        LinkedList<Character> bStack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("kiểm tra chuỗi đầu vào : ");
        String str = sc.nextLine();
        boolean isTrue = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                //1.1 Nếu sym là dấu ngoặc trái
                //1.2 đưa sym vào bstack
                bStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (bStack.size() == 0) {
                    isTrue = false;
                    break;
                } else {
                    //1.3 nếu sym là dấu ngoặc phải ")"
                    //1.3.1 nếu bstack rỗng, return false
                    //1.3.2 lấy dấu ngoặc ở bstack, đưa vào biến left
                    //1.3.3 nếu left và sym không khớp được với nhau, return false
                    bStack.pop();
                }
            }
        }
        if (bStack.size() != 0) {
            isTrue = false;
        }
        if (isTrue) {
            System.out.println("well");
        } else System.out.println("???????");
    }
}

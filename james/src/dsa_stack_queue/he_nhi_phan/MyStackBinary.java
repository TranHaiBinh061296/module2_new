package dsa_stack_queue.he_nhi_phan;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MyStackBinary {
    public static void main(String[] args) {
        //Khởi tạo stack rỗng
        LinkedList stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number need convert: ");
        int number = sc.nextInt();

        //Chuyển đổi từ thập phân sang nhị phân
        final int NUM = number;
        while (number != 0) {
            // result => stack
            stack.push(number % 2);//số dư
            number = number/2;
        }
        // đọc hết stack => nối chuỗi
        String string = "";
        while (!stack.isEmpty()) {
            string += stack.pop();
        }
        System.out.println("result: " + NUM + " = " + "(" + string + ")" + "B");
        // Ví dụ chuyển từ hệ thập phân sang hệ nhị phân
//        Stack<String> stackSoDu = new Stack<String>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
//        int x = sc.nextInt();
//        while(x>0) {
//            int soDu = x%2;
//            System.out.println(soDu);
//            stackSoDu.push(soDu+"");
//            x = x/2;
//        }
//        System.out.println("Số nhị phân là:");
//        int n = stackSoDu.size();
//        for(int i=0; i<n; i++) {
//            System.out.print(stackSoDu.pop());
//        }
    }
}

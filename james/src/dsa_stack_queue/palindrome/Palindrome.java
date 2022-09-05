package dsa_stack_queue.palindrome;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        // kiểm tra chuỗi
        // chuỗi palindrome là chuỗi có thể đọc xuôi lẫn đọc ngược

        LinkedList stack = new LinkedList();
        Queue queue = new Queue();
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("String need test is : \n");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            stack.push(c);
            queue.enQueue(c);
        }
        String stringStack = "";
        String stringQueue = "";
        while (!stack.isEmpty()) {
            stringStack += stack.pop();
        }
        while (!queue.isEmpty()) {
            stringQueue += queue.deQueue();
        }

        if (stringStack.equals(stringQueue)) {
            System.out.println("is Palindrome !");
        } else System.out.println("Not is Palindrome !");
    }
}

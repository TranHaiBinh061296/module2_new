package dsa_stack_queue.stack_daonguoc_phantu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayInteger {
    public static void main(String[] args) {
        //khởi tạo stack rỗng
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");

        //khởi tạo mảng array = phần tử nhập vào
        int size = sc.nextInt();
        int[] arr = new int[size];

        //với n phần tử của mảng, lần lượt đưa vào stack thông qua push
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100 + 1);//lấy ngẫu nhiên từ 1 -100
            stack.push(arr[i]);
        }
        System.out.println("Ta có mảng: ");
        System.out.println(Arrays.toString(arr));
        //lần lượt lấy ra từ stack n phần tử và đưa vào trở lại mảng ban đầu

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi nap vào stack: ");
        System.out.println(Arrays.toString(arr));

        //tạo 1 wstack rỗng
        LinkedList<Character> wstack = new LinkedList<>();

        //với mỗi mword đọc từ bàn phím, đưa nó vào stack(push)
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            wstack.push(string.charAt(i));
        }
        System.out.println("Chuỗi nhập từ bàn phím: ");
        System.out.println(wstack);
        //đọc stack cho đến hết => pop 1 word từ wstack vào mword
        // => nối mword vào cuối chuô mới vào output
        String stackPop = "";
        for (int i = 0;i< string.length();i++) {
            stackPop += wstack.pop();
        }
        System.out.println("Chuỗi mới");
        System.out.println(stackPop);
    }
}

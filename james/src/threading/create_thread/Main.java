package threading.create_thread;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int n1 = Integer.MAX_VALUE - 100;
            System.out.println("Input number begin 2 : ");
            int n2 = sc.nextInt();
            NumberGenerator number1 = new NumberGenerator(n1);
            NumberGenerator number2 = new NumberGenerator(n2);

            Thread t1 = new Thread(number1);
            Thread t2 = new Thread(number2);

            t1.start();
            t2.start();
        }catch (NoSuchElementException e) {
            System.out.println("Not number ! ");
        }
    }
}

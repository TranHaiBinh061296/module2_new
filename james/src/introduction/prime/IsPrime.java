package introduction.prime;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.printf("%d is not prime", number);
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("%d is prime", number);
            } else {
                System.out.printf("%d is not prime", number);
            }
        }
    }
}

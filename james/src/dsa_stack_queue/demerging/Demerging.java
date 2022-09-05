package dsa_stack_queue.demerging;

import java.util.Scanner;

public class Demerging {
    public static void main(String[] args) {
        Queue QueueNu = new Queue();
        Queue QueueNam = new Queue();

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng người trong danh sách : ");
        int num = input.nextInt();

        String name, gender;
        int day, month, year;
        int i = 1;
        while (i <= num) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Họ và tên nv" + i + ": ");
            name = scanner.nextLine();
            do {
                System.out.print(" Giới tính nv" + i + ": ");
                gender = scanner.nextLine();
                if ((!gender.equals("NU")) && (!gender.equals("NAM"))) {
                    System.out.println("Nhập lại giới tính !");
                }
            }
            while ((!gender.equals("NU")) && (!gender.equals("NAM")));

            Scanner integer = new Scanner(System.in);
            System.out.print(" Ngày sinh nv" + i + ": ");
            day = integer.nextInt();
            System.out.print(" Tháng sinh nv" + i + ": ");
            month = integer.nextInt();
            System.out.print(" Năm sinh nv" + i + ": ");
            year = integer.nextInt();
            if (gender.equals("NU")) {
                QueueNu.enQueue(name, gender, day, month, year);
            } else
                QueueNam.enQueue(name, gender, day, month, year);
            i++;
        }
        while (!QueueNu.isEmpty()) {
            System.out.println(QueueNu.deQueue());
        }
        while (!QueueNam.isEmpty()) {
            System.out.println(QueueNam.deQueue());
        }
    }
}

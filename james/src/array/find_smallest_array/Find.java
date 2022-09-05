package array.find_smallest_array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int size = sc.nextInt();
        int n = 0;
        int[] array = new int[size];
        //Nhập các phần tử của mảng vào
        while (n < array.length) {
            System.out.println("Nhập các phần tử của mảng " + (n + 1) + " : ");
            array[n] = sc.nextInt();
            n++;
        }
        // in ra các phần tử của mảng
        System.out.println("Mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nPhần tử nhỏ nhất trong mảng là : " + min);
    }
}

package introduction.currency;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn đổi");
        usd = sc.nextDouble();
        double quy_doi = usd * vnd;
        System.out.println("Giá trị VND :" + quy_doi);
    }
}

package introduction.interest_calculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        double sotiengui, laisuat, sotienlai;
        int sothang ;
        System.out.println("Nhập số tiền gửi vào : ");
        sotiengui = calculator.nextDouble();
        System.out.println("Số tháng gửi : ");
        sothang = calculator.nextInt();
        System.out.println("Lãi suất ( % năm ) : ");
        laisuat = calculator.nextDouble();
        sotienlai = sotiengui * ((laisuat/100)/12) * sothang;

        System.out.printf("%12.3f là số tiền lãi nhận được", sotienlai);
    }
}

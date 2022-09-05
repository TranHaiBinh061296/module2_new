package practice_activities.minigame.tai_xiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 20000;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi", "VN");
//        NumberFormat num = NumberFormat.getInstance();
        NumberFormat num = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 0;
        do {
            System.out.println("----------- MỜI BẠN LỰA CHỌN -----------");
            System.out.println("Chọn (1) để tiếp tục chơi.");
            System.out.println("Chọn (phím kỳ) để tiếp thoát.");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("*** BẮT ĐẦU CHƠI: ");
                System.out.println("****** Tài khoản của bạn: " + num.format(taiKhoanNguoiChoi) + "    , bạn muốn cược bao nhiêu? ");
                double datCuoc = 0;
                do {
                    System.out.println("****** Đặt cược (0<số tiền cược<=" + num.format(taiKhoanNguoiChoi) + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("****** Chon: 1<-> Tài hoặc 2 <-> Xỉu");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();
                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;
                System.out.println("****** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("****** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua!");
                    System.out.println("****** Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("****** Tổng là: " + tong + " => Xỉu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("****** Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("****** Tổng là: " + tong + " => Tài");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("****** Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    }
                }
            }
        } while (luaChon == 1);
    }
}

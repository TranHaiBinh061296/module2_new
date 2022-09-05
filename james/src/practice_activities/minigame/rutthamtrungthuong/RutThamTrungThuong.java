package practice_activities.minigame.rutthamtrungthuong;

import java.util.*;

public class RutThamTrungThuong {
    Set<String> thungPhieuDuThuong = new HashSet<String>();//Nơi chứa

    public RutThamTrungThuong() {
    }
    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }
    public int laySoLuong() {
        return this.thungPhieuDuThuong.size();
    }

    public void xoaTatCaPhieuDuThuong() {
         this.thungPhieuDuThuong.clear();
    }

    public String rutTham() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCa() {
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong rt = new RutThamTrungThuong();

        int choice = 0;
        do{
            System.out.println("❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃");
            System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤MENU❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            System.out.println("【?】     1. Thêm mã số dự thưởng          【?】");
            System.out.println("【?】     2. Xóa mã số dự thưởng           【?】");
            System.out.println("【?】3. Kiểm tra mã số dự thưởng có tồn tại hay không?【?】");
            System.out.println("【?】     4. Xóa tất cả các phiếu dự thưởng【?】");
            System.out.println("【?】     5. Số lượng phiếu dự thưởng      【?】");
            System.out.println("【?】     6. Rút thăm trúng thưởng         【?】");
            System.out.println("【?】     7. In ra tất cả các phiếu        【?】");
            System.out.println("【?】     0. Thoát khỏi chương trình       【?】");
            System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.println("Nhập phiếu dự thưởng");
                String giaTri = sc.nextLine();
                if (choice ==1 ) {
                    rt.themPhieu(giaTri);
                } else if (choice == 2) {
                    rt.xoaPhieu(giaTri);
                } else {
                    System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));

                }
            } else if (choice == 4) {
                rt.xoaTatCaPhieuDuThuong();
            } else if (choice == 5) {
                System.out.println("Số lượng phiếu là: " + rt.laySoLuong());
            } else if (choice == 6) {
                System.out.println("Mã sô trúng thưởng là: " + rt.rutTham());
            } else if (choice == 7) {
                System.out.println("Các mã phiếu dự thưởng là: " );
                rt.inTatCa();
            }
        }while (choice !=0);
    }
}

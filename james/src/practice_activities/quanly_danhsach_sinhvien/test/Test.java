package practice_activities.quanly_danhsach_sinhvien.test;

import practice_activities.quanly_danhsach_sinhvien.quanly.DanhSachSinhVien;
import practice_activities.quanly_danhsach_sinhvien.quanly.SinhVien;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("☸☸☸☸ MENU ☸☸☸☸");
            System.out.println("Vui lòng cho chức năng: ");
            System.out.println("1.Thêm sinh viên vào danh sách.\n" +
                     "2.In danh sách sinh viên ra màn hình.\n" +
                    "3.Kiểm tra danh sách có rỗng hay không.\n" +
                    "4.Lấy ra số lượng sinh viên trong danh sách.\n" +
                    "5.Làm rỗng danh sách sinh viên.\n" +
                    "6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n" +
                    "7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n" +
                    "8.Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n" +
                    "9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" +
                    "10.	Lưu danh sách sinh viên xuống tập tin.\n" +
                    "11.	Đọc sách sinh viên từ tập tin.\n" +
                    "0.   Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
                System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
                System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);
            } else if (luaChon == 2) {
                dssv.inDanhSachSinhVien();
            } else if (luaChon == 3) {
                System.out.println("Danh sách rỗng: " + dssv.kiemTraDanhSachRong());
            } else if (luaChon ==4) {
                System.out.println("Số lượng hiện tại: " + dssv.laySoLuongSinhVien());
            } else if (luaChon == 5) {
                dssv.lamRongDanhSach();
            } else if (luaChon == 6) {
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                SinhVien sv =new SinhVien(maSinhVien);
                System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraTonTai(sv));
            } else if (luaChon == 7) {
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                SinhVien sv =new SinhVien(maSinhVien);
                System.out.println("Xóa sinh viên trong danh sách: " + dssv.xoaSinhVien(sv));
            } else if (luaChon == 8) {
                System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                dssv.timSinhVien(hoVaTen);
            } else if (luaChon == 9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
            } else if(luaChon==10) {
			System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
//                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                dssv.ghiDuLieuXuongFile(f);
            }else if(luaChon==11) {
                System.out.println("Nhap ten file: ");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                dssv.docDuLieuTuFile(f);
            }
        }while (luaChon != 0);
    }
}

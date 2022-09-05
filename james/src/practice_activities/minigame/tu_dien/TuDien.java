package practice_activities.minigame.tu_dien;

import java.util.*;

public class TuDien {
   // private Map<String, String> duLieu = new TreeMap<>(); // sắp xếp theo trật tự
   private Map<String, String> duLieu = new HashMap<>(); // không sắp xếp theo trật tự
    public String themTU(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);// Xóa 1 cặp,từ khóa và ý nghĩa bị xóa
    }

    public String traTu(String tuKhoa) {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();  //in tất cả ra
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int soLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("❦❦❦❦❦❦❦❦❦❦❦❦❦❦❦❦❦");
            System.out.println("❤❤❤❤❤MENU❤❤❤❤❤");
            System.out.println("Tra từ điểN Anh-Việt: \n"
                    + "1.Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2.Xóa từ\n"
                    + "3.Tìm ý nghĩa của từ khóa - Tra từ\n"
                    + "4.In ra danh sách từ khóa\n"
                    + "5.In ra số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n");
            luaChon = sc.nextInt();
            sc.nextLine(); //tránh ảnh hưởng hàm bên dưới
            if (luaChon == 1) {
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhập vào ý nghĩa: ");
                String yNghia = sc.nextLine();
                tuDien.themTU(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                if (luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                } else {
                    System.out.println("ý nghĩa là: " + tuDien.traTu(tuKhoa));
                }
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.println("Số lượng từ khóa là: " + tuDien.soLuong());
            } else if (luaChon == 6) {
                tuDien.xoaTatCa();
            }
        } while (luaChon != 0);
    }

}

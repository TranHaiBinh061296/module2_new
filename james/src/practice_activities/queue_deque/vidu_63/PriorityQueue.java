package practice_activities.queue_deque.vidu_63;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new java.util.PriorityQueue<String>();//Sắp xếp lại so sánh tử đầu đến cuối
        danhSachSV.offer("Hai Binh B");
        danhSachSV.offer("Hai Binh A");
        danhSachSV.offer("Loc fuho 2");
        danhSachSV.offer("Loc fuho 1");

        while (true) {
            String ten = danhSachSV.poll();//poll lấy ra và xóa
            if (ten == null) {
                break;
            }
            //peek => lấy ra nhưng không xóa
            System.out.println(ten);
        }
    }
}

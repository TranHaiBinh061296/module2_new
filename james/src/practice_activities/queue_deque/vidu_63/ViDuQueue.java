package practice_activities.queue_deque.vidu_63;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("Hai Binh 0612");
        danhSachSV.offer("Khanh Hoang");
        danhSachSV.offer("Loc fuho ");

        while (true) {
            String ten = danhSachSV.poll();//poll lấy ra và xóa
            if (ten == null) {
                break;
            }
            //peek => lấy ra nhưng không xóa
            System.out.println(ten);
        }
//        System.out.println(danhSachSV.peek());
    }
}

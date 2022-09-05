package practice_activities.queue_deque.vidu_63;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ViduDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();
        danhSachSV.offer("Hai Binh B");
        danhSachSV.offer("Hai Binh A");
        danhSachSV.offer("Loc fuho 2");
        danhSachSV.offer("Loc fuho 1");
        danhSachSV.offerLast("Loc 4");
        danhSachSV.offerFirst("Loc 001");

        // Loc 001 > Hai Binh B> Hai Binh A >Loc fuho 2 >Loc fuho 1 > Loc 4

        while (true) {
            String ten = danhSachSV.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
//        System.out.println(danhSachSV.peek());

    }
}

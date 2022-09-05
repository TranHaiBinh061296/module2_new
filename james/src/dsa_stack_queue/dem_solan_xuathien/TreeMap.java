package dsa_stack_queue.dem_solan_xuathien;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        //Tạo treemap, dùng để lưu trữ số lượng
        Map<String, Integer> map = new java.util.TreeMap<>();

        String example = "Hải Bình, Quảng Trị, Hue. Hue. City,";
        //duyệt và thay đổi các ký tự có trên chuỗi

        example.replace(",", "");
        example.replace(".", "");
        String[] arr = example.split(" ");
        //Duyệt toàn bộ chuỗi
        String key = "";
        int value;
        //mỗi từ lấy ra từ chuỗi, chuyển toàn bộ thành chữ hoa hoặc chữ thường
        //coi mỗi từ lấy ra là 1 key
        for (int i = 0; i < arr.length; i++) {
            key = arr[i].toLowerCase();
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        //Kiểm tra trong map có key chưa? nếu có đẩy key vào map
        //tăng value lên 1
        //key mà chưa có, thì đẩy key vào map và gán mặc định value là 1
        Object obj = new Object();
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println(" Từ" +
                    " ' " + key + " ' xuất hiện "
                    + map.get(key) + " lần");
        }
    }

}

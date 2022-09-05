package java_collection_framework.save_list_students;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hải Bình",18);
        hashMap.put("Khanh Hoàng", 35);
        hashMap.put("Tùng Lý", 25);
        hashMap.put("Bá Lộc",20);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedlistMap = new LinkedHashMap<>(16, 075f,true);
        linkedlistMap.put("Hải Bình",18);
        linkedlistMap.put("Khanh Hoàng", 35);
        linkedlistMap.put("Tùng Lý", 25);
        linkedlistMap.put("Bá Lộc",20);
        System.out.println("\nThe age for " + "Hải Bình is " + linkedlistMap.get("Hải Bình") );


    }
}

package java_collection_framework.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bình", 26, "Quảng Trị");
        Student student1 = new Student("Khanh", 21, "Hà Nội");
        Student student2 = new Student("Lộc", 20, "Huế");
        Student student3 = new Student("Tùng", 22, "Quảng Trị");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}

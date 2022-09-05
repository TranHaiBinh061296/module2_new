package practice_activities.bai13_tinhchatoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Certificated> arr = new ArrayList<>();
        arr.add(new Certificated("h1", "cao thủ", "level max", "06/1296"));
        List<Certificated> arr2 = new ArrayList<>();
        arr2.add(new Certificated("h2", "đồng", "level thấp", "06/9/2006"));
//        Employee[] employees = new Employee[3];
//        employees[0] = new Experience("h1", "Trần Hải Bình", "0611296", 99999999, "b@gmail.com",arr,12,"Trùm IT",0 );
//        employees[1] = new Fresher();
//        employees[2] = new Intern();
//
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
        Employee nv1 = new Experience("h1", "Trần Hải Bình", "0611296", 99999999, "b@gmail.com", arr, 12, "Trùm IT", 0);
        nv1.showInfo();
        System.out.println(nv1.getCount());

        Employee nv2 = new Fresher("h2", "Hoàng Đức Khanh", "09/09/1969", 123456789, "khanhchanga@gamil.com", arr2, 2014, "Khá", "Kinh Tế", 1);
        nv2.showInfo();
        System.out.println(nv2.getCount());
    }
}

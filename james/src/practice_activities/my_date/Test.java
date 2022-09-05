package practice_activities.my_date;

public class Test {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(15, 5, 2025);
        MyDate md2 = new MyDate(11, 1, 2021);
        MyDate md3 = new MyDate(15, 5, 2025);


        System.out.println(md1); // 15/5/2021
        System.out.println(md2);
        System.out.println(md3);


        System.out.println("md1 so sanh bang md2: "
                + md1.equals(md2));

        System.out.println("md1 so sanh bang md3: "
                + md1.equals(md3));

        System.out.println("Hashcode md1 " + md1.hashCode());
        System.out.println("Hashcode md2 " + md2.hashCode());
        System.out.println("Hashcode md3 " + md3.hashCode());

//        MyDate[] arrs = new MyDate[5];
//        arrs[0] = new MyDate(06, 12, 1996);
//        arrs[1] = new MyDate(12, 2, 1999);
//        arrs[2] = new MyDate(16, 7, 2010);
//        arrs[3] = new MyDate(06, 12, 1996);
//        arrs[4] = new MyDate(16, 7, 2010);
//
//        for (MyDate arr : arrs) {
//            System.out.println(arr);
//        }


    }
}

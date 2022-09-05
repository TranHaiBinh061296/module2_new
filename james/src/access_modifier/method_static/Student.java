package access_modifier.method_static;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // constructor để khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    //static method to change the value of static variable
    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }
    //method to display values
    //hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

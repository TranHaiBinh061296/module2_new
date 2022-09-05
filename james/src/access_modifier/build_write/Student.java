package access_modifier.build_write;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    void display() {
        System.out.println("Tên của tôi là: " + name + ", học lớp: " + classes);
    }
}

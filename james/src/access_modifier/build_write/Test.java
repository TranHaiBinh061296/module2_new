package access_modifier.build_write;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
        student.setName("Hải Bình");
        student.setClasses("C0622G1");
        student.display();
    }
}

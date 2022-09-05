package access_modifier.method_static;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student st = new Student(111, "Hoang");
        Student st2 = new Student(69, "Khanh");
        Student st3 = new Student(333, "Nam");

        st.display();
        st2.display();
        st3.display();
    }
}

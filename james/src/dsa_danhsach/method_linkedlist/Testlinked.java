package dsa_danhsach.method_linkedlist;

public class Testlinked {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student st1 = new Student(1, "Hải Bình");
        Student st2 = new Student(2, "Lộc");
        Student st3 = new Student(3, "Khanh");
        Student st4 = new Student(4, "Hà");

        myLinkedList.addFirst(st1);
        myLinkedList.addFirst(st2);
        myLinkedList.addLast(st3);
        myLinkedList.add(2, st4);

//        MyLinkedList<Student> cloneLinkedlist = myLinkedList.clone();
//        System.out.println(myLinkedList.contains(st1));
        System.out.println(myLinkedList.indexOf(st2));

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}

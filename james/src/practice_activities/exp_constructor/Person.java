package practice_activities.exp_constructor;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
            return age;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public void setAge(int newage) {
        if (age <= 0) {
            System.out.printf("Tuổi không hợp lệ  ");
            return;
        }
            this.age = newage;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void display() {
        System.out.printf("Tôi tên là: " + name + " năm nay tôi " + age + " năm thanh xuân");
    }

    public static void main(String[] args) {
        Person person = new Person("Lộc", -5);
//        System.out.printf(person.toString());
        person.display();
    }
}
